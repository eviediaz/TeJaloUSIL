package model;

public class alumno extends persona{

    public alumno(String nombreUsuario, String apellidoUsuario, String usuario, String contrasena, int tipoUsuario, int dniUsuario, int celularUsuario) {
        super(nombreUsuario, apellidoUsuario, usuario, contrasena, tipoUsuario, dniUsuario, celularUsuario);
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

    public void setContrasena(String contrasena) {
        this.contraseña = contrasena;
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

    public String getContrasena() {
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
