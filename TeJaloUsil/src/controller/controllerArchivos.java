package controller;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import model.*;
import view.*;

public class controllerArchivos {
    private ArrayList<conductor> lstMatchCond = new ArrayList<>();
    private ArrayList<pedido> lstRutasHoras = new ArrayList<>();
    private registrar viewRegistrar;
    private conductor modelCond;
    private alumno modelAlu;
    private movilidad mov;
    
    public controllerArchivos(){}
    
    //Get modelos de alumnos y conductores
    public alumno getModelAlu() {return modelAlu;}
    public conductor getModelCond() {return modelCond;}
    
    
    public void guardarPersona(String nomUsuario, String apeUsuario, String usuario, 
    String contrasena, int tipoUsuario, int dniUsuario, int celUsuario){
        try {
            String line;
            String file;
            
            //Alumno: salto de linea, Conductor: con numDisponibilidad
            if(tipoUsuario == 1){line = "\n"; file = "Alumnos.txt";}
            else{line = "15;"; file = "Conductores.txt";}
            
            FileWriter fw = new FileWriter(file, true);
            fw.write(nomUsuario + ";" + apeUsuario + ";" + usuario + ";" + contrasena
            + ";" + tipoUsuario + ";" + dniUsuario + ";" + celUsuario + ";" + line);
            fw.close();
        } catch (Exception e) {System.out.println(e.toString() + "No se encontró archivo");}
    }
    
    
    //Agregar arrayRutasHoras a misma linea en conductor
    public void addRutasHoras(String horas, String paradero){
        try {
            FileWriter fw = new FileWriter("Conductores.txt", true);
            fw.write("["+ horas + ", " + paradero + "]/");
            fw.close();
        } catch (Exception e){System.out.println(e.toString() + "No se encontró archivo");}  
    }
    
    
    //Salto de línea cuando se terminan de registrar rutasHoras
    public void regRutasHoras(){
        try {
            FileWriter fw = new FileWriter("Conductores.txt", true);
            fw.write(";\n");
            fw.close();
        } catch (Exception e){System.out.println(e.toString() + "No se encontró archivo");}  
    }
    
    
    //Inicia sesión, retorna num según resultado por tipoUsuario
    public int sesionInicio(String usuario, String contrasena){
       try {
           //Busqueda en alumno y conductor
           String[] tipoUsuario = {"Alumnos.txt", "Conductores.txt"};
           
           for (int i = 0; i < tipoUsuario.length; i++) {
               Scanner sc = new Scanner(new File(tipoUsuario[i]));
               while(sc.hasNextLine()) {
                    String s = sc.nextLine();
                    String[] split = s.split(";");
                    boolean cond1 = usuario.equals(split[2]);
                    boolean cond2 = contrasena.equals(split[3]);

                    if(cond1 && cond2){if(i==0){setPersona(split);return 1;} //Alumno
                    else if(i==1){setPersona(split);return 2;}}             //Conductor
                    
                    //Mal contraseña
                    else if (cond1 && !cond2) {
                        if(i==0){return 3;}         //Alumno
                        else if(i==1){return 4;}    //Conductor
                    }
               }
           }
           
       } catch (Exception e) {System.out.println("Error " + e.getMessage());}

       return 0; //No existe usuario
    }
    
    
    //Recibe array e instancia alumno/conductor dependiendo de tipoUsuario
    public void setPersona(String[] atributos){
        
        String nom = atributos[0];
        String ape = atributos[1];
        String nomUsuario = atributos[2];
        String pwUsuario = atributos[3];
        int tipoUsuario = Integer.parseInt(atributos[4]);
        int dni = Integer.parseInt(atributos[5]);
        int celular = Integer.parseInt(atributos[6]); 
        
        if(tipoUsuario == 1)
        {
            modelAlu = new alumno(nom, ape, nomUsuario, 
                    pwUsuario, tipoUsuario, dni, celular);
        }
        
        else
        {
            int disp = Integer.parseInt(atributos[7]);
            String rutasHoras = atributos[8];
            lstRutasHoras = stringLista(rutasHoras); //Se transforma a arrayList<pedido>
            
            modelCond = new conductor(nom, ape, nomUsuario,
                    pwUsuario, tipoUsuario, dni, celular, 
                    disp, lstRutasHoras);
        }
        
    } 
    
    //Entregas string largo de arrayRutaHora, devuelve arrayList
    public ArrayList<pedido> stringLista(String array){
        
        ArrayList<pedido> lstRutas = new ArrayList<>();
        String[] splitPedido = array.split("/");
        
        for (int i = 0; i < splitPedido.length; i++) {
            String s = splitPedido[i]; 
            s = s.replace("[", "");
            s = s.replace("]", "");
            String[] output = s.split(",");
            lstRutas.add(new pedido(output));
        }
        
        return lstRutas;
    }
    
    
    //Le entregas arrayRutaHora, te retorna listaCoincidencias de conductores
    public ArrayList<conductor> matchFileRutasHoras(String[] atributos){
        
        int x = 0;
        ArrayList<conductor> lstMatchCond = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File("Conductores.txt"));
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] split = s.split(";");
                String[] splitPedido = split[8].split("/");

                for(int i=0; i<splitPedido.length; i++){
                    if(Arrays.toString(atributos).equals(splitPedido[i])){
                        x++;
                        setPersona(split);
                        if(modelCond.getDisponibilidad() != 0){lstMatchCond.add(modelCond);}
                    }
                }
                
            }
        } catch (FileNotFoundException ex) {System.out.println(ex.getMessage());}
        
        if(x == 0){return null;} //No hay conductores coincidentes
        return lstMatchCond;
    }
    
    
    //Cambia la disponiblidad en el archivo de texto
    public void setDisponibilidad(int dni, int disp){
        try {
            BufferedReader file = new BufferedReader(new FileReader("Conductores.txt"));
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            while ((line = file.readLine()) != null) {
                char[] chars = line.toCharArray();
                if(line.contains(String.valueOf(dni))){
                    int count = 0;
                    for(char c : chars){ 
                        if(c == ';'){count++;
                        if(count == 7){
                            inputBuffer.append(line.replaceFirst(";" + String.valueOf(disp) + ";", ";" + String.valueOf(disp-1) + ";"));
                            inputBuffer.append("\n");
                        }}
                    }
                }
                else{inputBuffer.append(line);inputBuffer.append("\n");}
            }
            file.close();

            FileOutputStream fileOut = new FileOutputStream("Conductores.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();

        } catch (Exception e) {System.out.println("Error: " + e.getMessage());}
    }
    
    
    
    public ArrayList<pedido> stringPedido(String array){
        
        ArrayList<pedido> lstRutas = new ArrayList<pedido>();

        array = array.replace("[", "");
        array = array.replace("]", "");
        String[] output = array.split(",");
        lstRutas.add(new pedido(output));
            
        return lstRutas;
    }
    
    
    
    public void getDni(int dni, int tipoU){
        try {
            String dniC = String.valueOf(dni);
            String[] tipoUsuario = {"Conductores.txt", "Alumnos.txt"};

            Scanner sc = new Scanner(new File(tipoUsuario[tipoU]));
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] split = s.split(";");
                boolean cond1 = dniC.equals(split[5]);
                System.out.println(dniC + " " + split[5]);
                if(cond1){setPersona(split);}
            }
        } catch (Exception e) {System.out.println("Error " + e.getMessage());}
    }
    
    
    public void registrarMovilidad(int dniCond, int dniAlu, String[] match){
        try {     
            FileWriter fw = new FileWriter("RegistroMovilidades.txt", true);
            fw.write(dniCond + ";" + dniAlu + ";" + Arrays.toString(match) + ";" + "\n");
            fw.close();
        } catch (Exception e) {System.out.println(e.toString() + "No se encontró archivo");} 
    }
    
    
    //Retorna movilidad(dniAlu/Cond, rutaHora) dependiendo del dni y tipo de usuario a buscar
    public ArrayList<movilidad> getMovilidad(int dni, int us){
        ArrayList<movilidad> lstMovilidad = new ArrayList<>();
        try {
            int x = 0;
            String dniC = String.valueOf(dni);
            Scanner sc = new Scanner(new File("RegistroMovilidades.txt"));
            while(sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] split = s.split(";");
                
                if(us == 0){x=1;}
                boolean cond1 = dniC.equals(split[x]);
                
                if(cond1)
                {
                    mov = new movilidad(Integer.parseInt(split[us]), setRutasHoras(split));
                    lstMovilidad.add(mov);
                }
            }
        } catch (Exception e) {System.out.println("Error " + e.getMessage());}
        
        return lstMovilidad;
    }
    
    
    //Busca en movilidades existentes si el dni del alumno coincide, retorna rutasHoras ya registradas
    public ArrayList<pedido> getDniRuta(int dni){
        ArrayList<pedido> lstPedido = new ArrayList<pedido>();
        try {
            String dniC = String.valueOf(dni);
            Scanner sc = new Scanner(new File("RegistroMovilidades.txt"));
            
            while(sc.hasNextLine()) {
                
                String s = sc.nextLine();
                String[] split = s.split(";");
                
                boolean cond1 = dniC.equals(split[1]);
                if(cond1){lstPedido.add(setRutasHoras(split));}
            }
        } catch (Exception e) {System.out.println("Error " + e.getMessage());}
        
        return lstPedido;
    }
    
    
    //Entregas un solo arrayRuta, devuelve en forma de pedido
    public pedido setRutasHoras(String[] atributos){
        String rutasHoras = atributos[2];
        rutasHoras = rutasHoras.replace("[", "");
        rutasHoras = rutasHoras.replace("]", "");
        String[] output = rutasHoras.split(", ");
        pedido p = new pedido(output);
        
        return p;
    } 
    
   
    
}
