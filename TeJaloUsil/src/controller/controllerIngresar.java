package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.*;
import model.*;

public class controllerIngresar implements ActionListener{ 
    private controllerArchivos cArchivos = new controllerArchivos();
    private ingresar viewIngresar = new ingresar();
    
    public controllerIngresar(){
        //Vista
        viewIngresar.setVisible(true);
        viewIngresar.setTitle("Ingresar");
        viewIngresar.setLocationRelativeTo(null);
        viewIngresar.btnIngresar.addActionListener(this);
        viewIngresar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String usuario      = viewIngresar.tfUsuario.getText();
        String contraseña   = viewIngresar.tfContrasena.getText();
        
        //Busqueda de usuario y contraseña en archivos
        switch (cArchivos.sesionInicio(usuario, contraseña)) {
            case 0:
                JOptionPane.showMessageDialog(viewIngresar, "No existe usuario");
                break;
            case 1:
                JOptionPane.showMessageDialog(viewIngresar, "Alumno");
                viewIngresar.setVisible(false);
                controllerAlumnos cAlumnos = new controllerAlumnos(cArchivos.getModelAlu());
                break;   
            case 2:
                JOptionPane.showMessageDialog(viewIngresar, "Conductor");
                viewIngresar.setVisible(false);
                controllerConductor cConductor = new controllerConductor(cArchivos.getModelCond());
                break;
            case 3:
                JOptionPane.showMessageDialog(viewIngresar, "Alumno: Contraseña incorrecta");
                break;
            case 4:
                JOptionPane.showMessageDialog(viewIngresar, "Conductor: Contraseña incorrecta");
                break;
            default:throw new AssertionError();
        }
        
    }   
}
