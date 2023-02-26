package controller;

import javax.swing.table.DefaultTableModel;
import view.ViewConductor.viewConductor;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import model.*;

public final class controllerConductor extends MouseAdapter implements ActionListener{
    private ArrayList<movilidad> lstMovilidad = new ArrayList<>();
    private ArrayList<alumno> matchAlumno = new ArrayList<>();
    private controllerArchivos cA = new controllerArchivos();
    private viewConductor vConductor= new viewConductor();
    private conductor modelConduc;
    private int rowResultados;
    
    public controllerConductor(conductor modelConduc){
        this.modelConduc = modelConduc;
        
        //Vista
        vConductor.setVisible(true);
        vConductor.setTitle("Conductor");
        vConductor.setLocationRelativeTo(null);
        vConductor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vConductor.labTitulo.setText("¡Bienvenid@ " + this.modelConduc.getNombreUsuario() + "!");
        
        //ActionListeners
        vConductor.btnVerAlumno.addActionListener(this);
        vConductor.btnCerrarSesion.addActionListener(this);
        vConductor.tblDatos.addMouseListener(this);        
        
        //Operaciones
        getPerfil();
        movilidadTabla();
    }
    
    
    public void getPerfil(){
        vConductor.tfNombre.setText(modelConduc.getNombreUsuario());
        vConductor.tfApellido.setText(modelConduc.getApellidoUsuario());
        vConductor.tfUsuario.setText(modelConduc.getUsuario());
        vConductor.tfContrasena.setText(modelConduc.getContraseña());
        vConductor.tfCelular.setText(String.valueOf(modelConduc.getCelularUsuario()));
        vConductor.tfDni.setText(String.valueOf(modelConduc.getDniUsuario()));
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        //Mostrar atributos de alumnos en fila seleccionada
        if(e.getSource() == vConductor.btnVerAlumno)
        {
            String dni = vConductor.tblDatos.getValueAt(rowResultados, 2).toString();
            cA.getDni(Integer.parseInt(dni), 1);           
            alumno a = cA.getModelAlu();
            
            vConductor.jtfNombre.setText(a.getNombreUsuario());
            vConductor.jtfApellido.setText(a.getApellidoUsuario());
            vConductor.jtfCelular.setText(String.valueOf(a.getCelularUsuario()));
        }
        
        //Cerrar sesion
        if(e.getSource() == vConductor.btnCerrarSesion){controlador c = new controlador();}
    }
    
    
    @Override
    public void mouseClicked(MouseEvent me) {
        //Activar click en tabla de datos Conductor
        if(me.getSource() == vConductor.tblDatos){rowResultados = vConductor.tblDatos.getSelectedRow();}
    }
    
    
    //Llenar tabla con alumnos coincidentes al dniConductor
    public void movilidadTabla(){
        //TipoUsuario es 1 -> busco alumnos
        lstMovilidad = cA.getMovilidad(modelConduc.getDniUsuario(), 1);
        
        DefaultTableModel dtModel = (DefaultTableModel)vConductor.tblDatos.getModel();
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
