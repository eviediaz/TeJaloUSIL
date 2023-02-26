package controller;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import model.*;
import view.*;

public class controllerRegistro implements ActionListener{
    private registrarConductor viewRConductor = new registrarConductor();
    private ArrayList<conductor> lsConductores = new ArrayList<>();
    private controllerArchivos cArchivos = new controllerArchivos();
    private ArrayList<alumno> lsAlumnos = new ArrayList<>();
    private ArrayList<pedido> rutasHoras = new ArrayList<>();
    private registrar viewRegistrar = new registrar();
    private conductor modelCond;
    private persona persona;
    private alumno modelAlu;
    private pedido pedido;
    private int n=0;
    
    
    public controllerRegistro(){
        //Vistas
        viewRegistrar.setVisible(true);
        viewRegistrar.setTitle("Registrar");
        viewRegistrar.setLocationRelativeTo(null);
        viewRegistrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //ActionListener
        viewRegistrar.bGuardar.addActionListener(this);
    }
    

    //Boton registrar
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            
        int tipoUsuario = viewRegistrar.cbTipoUsuario.getSelectedIndex();

        //Extraer datos de textfields
        String nom = viewRegistrar.tfNombre.getText();
        String ape = viewRegistrar.tfApellidos.getText();
        String nomUsuario = viewRegistrar.tfNomUsuario.getText();
        String contrasena = viewRegistrar.tfContrasena.getText();
        int dni = Integer.parseInt(viewRegistrar.tfDni.getText());
        int cel = Integer.parseInt(viewRegistrar.tfCelular.getText());

        //Guardar persona en archivo segun tipoUsuario
        cArchivos.guardarPersona(nom, ape, nomUsuario, contrasena, tipoUsuario, dni, cel);

        //Opciones segun tipoUsuario
        switch (tipoUsuario) {
            //Conductor
            case 0:
                //Vista
                viewRConductor.setVisible(true);
                viewRConductor.setLocationRelativeTo(null);
                viewRConductor.setTitle("Registrar Conductor");

                //ActionListener
                viewRConductor.btnAgregar.addActionListener(e -> {
                    n++;
                    String horas = viewRConductor.cbHoras.getSelectedItem().toString();
                    String paraderos = viewRConductor.cbParaderos.getSelectedItem().toString();
                    cArchivos.addRutasHoras(horas, paraderos);
                    
                    //Se agrega a un ArrayList de pedidos
                    String[] arrRutaHora = {horas, paraderos};
                    pedido = new pedido(arrRutaHora);
                    rutasHoras.add(pedido);
                });

                viewRConductor.btnRegistrar.addActionListener(e -> {
                    //Si ha registrado minimo de 3 rutas, se registrara con salto de linea
                    if(n>=3){cArchivos.regRutasHoras();controlador c = new controlador();}
                });
                
                modelCond = new conductor(nom, ape, nomUsuario, contrasena, tipoUsuario, 
                            dni, cel, 15, rutasHoras);
                lsConductores.add(modelCond);
                break;

            //Alumnos
            case 1:
                modelAlu = new alumno(nom, ape, nomUsuario, contrasena, tipoUsuario, dni, cel);
                lsAlumnos.add(modelAlu);
                controlador c = new controlador();
                break;
                
            default: throw new AssertionError();}
        
        } catch (Exception e) {System.out.println(e.getMessage());}
    }
}
