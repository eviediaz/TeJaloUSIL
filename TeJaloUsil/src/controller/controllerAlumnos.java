package controller;

import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import javax.swing.*;
import ViewAlumno.*;
import java.util.*;
import model.*;

public final class controllerAlumnos extends MouseAdapter implements ActionListener{
    private controllerArchivos cArchivos = new controllerArchivos();
    private ArrayList<conductor> matchConductor = new ArrayList<>();
    private ArrayList<movilidad> lstMovilidad = new ArrayList<>();
    private ArrayList<pedido> matchPedidos = new ArrayList<>();
    private viewAlumno vAlumno = new viewAlumno();
    private String[] match = new String[2];
    private int rowResultados;
    private int rowResultados1;
    private alumno modelAlu;
    private int x;
    private int y;
    
    
    public controllerAlumnos(alumno modelAlu){
        this.modelAlu = modelAlu;
        
        //Ventana
        vAlumno.setVisible(true);
        vAlumno.setTitle("Alumnos");
        vAlumno.setLocationRelativeTo(null);
        vAlumno.gradientPanel2.setVisible(false);
        vAlumno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vAlumno.labTitulo.setText("¡Bienvenid@ " + this.modelAlu.getNombreUsuario() + "!");
        
        //Operaciones
        getPerfil();
        movilidadTabla();
        
        //ActionListeners
        vAlumno.btnVerConductor.addActionListener(this);
        vAlumno.btnCerrarSesion.addActionListener(this);
        vAlumno.tabResultados.addMouseListener(this);
        vAlumno.btnRegresar.addActionListener(this);
        vAlumno.btnVerCond.addActionListener(this);
        vAlumno.tbMovilidad.addMouseListener(this);
        vAlumno.btnElegir.addActionListener(this);
        vAlumno.btnBuscar.addActionListener(this);
    }
    
   
    public void getPerfil(){
        
        //Textfields de perfil
        vAlumno.tfCelular.setText(String.valueOf(modelAlu.getCelularUsuario()));
        vAlumno.tfDni.setText(String.valueOf(modelAlu.getDniUsuario()));
        vAlumno.tfApellido.setText(modelAlu.getApellidoUsuario());
        vAlumno.tfContrasena.setText(modelAlu.getContrasena());
        vAlumno.tfNombre.setText(modelAlu.getNombreUsuario());
        vAlumno.tfUsuario.setText(modelAlu.getUsuario()); 
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        //Cerrar sesion: regresar home
        if(ae.getSource() == vAlumno.btnCerrarSesion){controlador c = new controlador();}
        
        
        if(ae.getSource() == vAlumno.btnBuscar){
            
            //Ver si ruta y hora coincide con conductor, registrada, 
            String ruta = vAlumno.cbParadero.getSelectedItem().toString();
            String hora = vAlumno.cbHoras.getSelectedItem().toString();
            match[0] = hora; match[1] = ruta; boolean b = true;
            
            matchConductor = cArchivos.matchFileRutasHoras(match);
            matchPedidos = cArchivos.getDniRuta(modelAlu.getDniUsuario());
            
            if(matchConductor != null){
                for(pedido p: matchPedidos){

                    //Si ya esta registrada la ruta y hora
                    if(Arrays.toString(match).equals(Arrays.toString(p.getRutasHoras())))
                    {
                        vAlumno.gradientPanel2.setVisible(false);
                        JOptionPane.showMessageDialog(vAlumno, "Ya registró esta ruta");
                        b = false; break;
                    }
                }
                
                if(b)
                {
                    llenarTabla();
                    vAlumno.gradientPanel1.setVisible(false);
                    vAlumno.gradientPanel2.setVisible(true);
                }   
            }
            
            else{
                //No existe
                vAlumno.gradientPanel1.setVisible(true);
                vAlumno.gradientPanel2.setVisible(false);
                JOptionPane.showMessageDialog(vAlumno, "No hay");
            } 
        }
        
        
        if(ae.getSource() == vAlumno.btnRegresar)
        {
            //Regresar desde busqueda
            vAlumno.gradientPanel2.setVisible(false);
            vAlumno.gradientPanel1.setVisible(true);
        }
        
        
        if(ae.getSource() == vAlumno.btnVerConductor)
        {
            //Busqueda: De la fila seleccionada, se toma como posicion en matchConductor
            conductor c = matchConductor.get(rowResultados);
            vAlumno.tfDniCond.setText(String.valueOf(c.getDniUsuario()));
            vAlumno.tfCelularCond.setText(String.valueOf(c.getCelularUsuario()));

            //Se recorre array<pedido> que tiene rutas y horas
            String[] cbItems = new String[c.getRutasHoras().size()];
            int i = 0;
            for(pedido x: c.getRutasHoras()){
                cbItems[i] = Arrays.toString(x.getRutasHoras());
                i++;
            }
            
            //Se imprime en comboBox
            vAlumno.cbRutasCond.setModel(new DefaultComboBoxModel<>(cbItems));
        }
        
        
        if(ae.getSource() == vAlumno.btnElegir)
        {
            int confirm = JOptionPane.showConfirmDialog(vAlumno, "¿Estás seguro?");
            
            if (confirm == JOptionPane.YES_NO_OPTION) { //Cuando seleccionas YES
                conductor c = matchConductor.get(rowResultados);
                
                //Elimina filas registradas de comboBox (temporal)
                x = vAlumno.cbParadero.getSelectedIndex();
                y = vAlumno.cbHoras.getSelectedIndex();
                vAlumno.cbParadero.removeItemAt(x);
                vAlumno.cbHoras.removeItemAt(y);
                
                //Cambiar la disponibilidad en txt gracias a dniConductor
                int dniCond = c.getDniUsuario();
                int dispCond = c.getDisponibilidad();
                cArchivos.setDisponibilidad(dniCond, dispCond);
                
                //Se registra en movilidad.txt con atributos de movilidad, se actualiza tabla
                cArchivos.registrarMovilidad(dniCond, modelAlu.getDniUsuario(), match);
                movilidadTabla();

                JOptionPane.showMessageDialog(vAlumno, "Registro exitoso");
                vAlumno.gradientPanel2.setVisible(false);
                vAlumno.gradientPanel1.setVisible(true);
            }
        }
        
        
        if(ae.getSource() == vAlumno.btnVerCond)
        {
            //Sacar dni de fila seleccionada y buscar en txt atributos coincidentes
            String dni = vAlumno.tbMovilidad.getValueAt(rowResultados1, 2).toString();
            cArchivos.getDni(Integer.parseInt(dni), 0);  
            
            conductor c = cArchivos.getModelCond();
            vAlumno.tfCelularCond1.setText(String.valueOf(c.getCelularUsuario()));
            
            //Recorrer rutas y horas, agregarlas a comboBox
            String[] cbItems = new String[c.getRutasHoras().size()];
            int i = 0;
            for(pedido x: c.getRutasHoras()){
                cbItems[i] = Arrays.toString(x.getRutasHoras());
                i++;
            }
            vAlumno.cbRutasCond1.setModel(new DefaultComboBoxModel<>(cbItems));
        }
        
    }

    
    @Override
    public void mouseClicked(MouseEvent me) {
        //Obtener fila seleccionada si clickeas la tabla
        if(me.getSource() == vAlumno.tabResultados){rowResultados = vAlumno.tabResultados.getSelectedRow();}
        if(me.getSource() == vAlumno.tbMovilidad){rowResultados1 = vAlumno.tbMovilidad.getSelectedRow();}
    }
    
    
    //Llenar tabla de busqueda con conductores coincidentes a rutaHora ingresados
    public void llenarTabla(){
        DefaultTableModel dtModel = (DefaultTableModel)vAlumno.tabResultados.getModel();
        dtModel.setRowCount(0);
        Object dataTabla[] = new Object[3];
        
        for (int i = 0; i < matchConductor.size(); i++) {
            dataTabla[0] = matchConductor.get(i).getNombreUsuario();
            dataTabla[1] = matchConductor.get(i).getApellidoUsuario();
            dataTabla[2] = matchConductor.get(i).getDisponibilidad();
            dtModel.addRow(dataTabla);
        }
    }
    
    
    //Tabla de movilidad con rutasHoras coincidentes al dniAlumno
    public void movilidadTabla(){
        lstMovilidad = cArchivos.getMovilidad(modelAlu.getDniUsuario(), 0);
        DefaultTableModel dtModel = (DefaultTableModel)vAlumno.tbMovilidad.getModel();
        dtModel.setRowCount(0);
        Object dataTabla[] = new Object[3];
        
        for (int i = 0; i < lstMovilidad.size(); i++) {
            dataTabla[0] = lstMovilidad.get(i).getRutaHora().getHoras();
            dataTabla[1] = lstMovilidad.get(i).getRutaHora().getParadero();
            dataTabla[2] = lstMovilidad.get(i).getDniPersona();
            dtModel.addRow(dataTabla);
        }
    }
    
}
