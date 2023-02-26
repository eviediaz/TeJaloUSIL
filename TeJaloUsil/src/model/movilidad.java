package model;

import java.util.ArrayList;

public class movilidad{
    int dniPersona;
    pedido rutaHora;
    ArrayList<pedido> rutasHoras = new ArrayList<>();

    public pedido getRutaHora() {
        return rutaHora;
    }

    public void setRutaHora(pedido rutaHora) {
        this.rutaHora = rutaHora;
    }


    public movilidad(int dniPersona, ArrayList<pedido> rutasHoras) {
        this.dniPersona = dniPersona;
        this.rutasHoras = rutasHoras;
    }

    public movilidad(int dniPersona, pedido rutaHora) {
        this.dniPersona = dniPersona;
        this.rutaHora = rutaHora;
    }
    
    
    public int getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(int dniPersona) {
        this.dniPersona = dniPersona;
    }

    public ArrayList<pedido> getRutasHoras() {
        return rutasHoras;
    }

    public void setRutasHoras(ArrayList<pedido> rutasHoras) {
        this.rutasHoras = rutasHoras;
    }
}
