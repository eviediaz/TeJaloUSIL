package controller;

import java.awt.event.*;
import tejalousil.home;
import javax.swing.*;
import model.*;
import view.*;

public class controlador implements ActionListener{
    home viewHome = new home();
    
    public controlador(){
        //Vistas
        viewHome.setVisible(true);
        viewHome.setTitle("Principal");
        viewHome.setLocationRelativeTo(null);
        viewHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //ActionListener
        viewHome.btnIngresar.addActionListener(this);
        viewHome.btnRegistrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == viewHome.btnIngresar) {controllerIngresar cIngresar = new controllerIngresar();}
        if (ae.getSource() == viewHome.btnRegistrar) {controllerRegistro cRegistro = new controllerRegistro();}
    }
   
    
}
