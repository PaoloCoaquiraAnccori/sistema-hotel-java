package model;

public class Estacionamiento {
    private int capacidadTotal;
    private int espaciosDisponibles;
    private boolean disponible;

    
    public int getCapacidadTotal() {
        return capacidadTotal;
    }
    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }
    public int getEspaciosDisponibles() {
        return espaciosDisponibles;
    }
    public void setEspaciosDisponibles(int espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
