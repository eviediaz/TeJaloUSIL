package model;

public class pedido{
    String[] rutasHoras;

    public pedido(String[] rutasHoras) {
        this.rutasHoras = rutasHoras;
    }

    public String[] getRutasHoras() {
        return rutasHoras;
    }

    public void setRutasHoras(String[] rutasHoras) {
        this.rutasHoras = rutasHoras;
    }

    public String getHoras(){
        return rutasHoras[0];
    }
    
    public String getParadero(){
        return rutasHoras[1];
    }
    
    
}
