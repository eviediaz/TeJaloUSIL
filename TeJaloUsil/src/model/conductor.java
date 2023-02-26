/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class conductor extends persona{
    int disponibilidad;
    ArrayList<pedido> rutasHoras = new ArrayList<>();
    
    public conductor(String nombreUsuario, String apellidoUsuario, String usuario, 
            String contraseña, int tipoUsuario, int dniUsuario, int celularUsuario, 
            int disponibilidad, ArrayList<pedido> rutasHoras) {
        super(nombreUsuario, apellidoUsuario, usuario, contraseña, tipoUsuario, dniUsuario, celularUsuario);
        this.disponibilidad = disponibilidad;
        this.rutasHoras = rutasHoras;
    }

    public ArrayList<pedido> getRutasHoras() {
        return rutasHoras;
    }

    public void setRutasHoras(ArrayList<pedido> rutasHoras) {
        this.rutasHoras = rutasHoras;
    }
    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setDniUsuario(int dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public void setCelularUsuario(int celularUsuario) {
        this.celularUsuario = celularUsuario;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getDniUsuario() {
        return dniUsuario;
    }

    public int getCelularUsuario() {
        return celularUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }
    
    
}
