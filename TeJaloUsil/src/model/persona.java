package model;

public class persona {
    String nombreUsuario;
    String apellidoUsuario;
    String usuario;
    String contraseña;
    int tipoUsuario;
    int dniUsuario;
    int celularUsuario;

    //0 es conductor, 1 es alumno
    public persona(){  
    }
    
    public persona(String nombreUsuario, String apellidoUsuario, String usuario, String contraseña, int tipoUsuario, int dniUsuario, int celularUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.dniUsuario = dniUsuario;
        this.celularUsuario = celularUsuario;
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
