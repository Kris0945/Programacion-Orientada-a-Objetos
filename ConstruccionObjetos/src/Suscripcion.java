public class Suscripcion {
    //Atributos
    String tipo;
    Double costo;
    int periodicidad;

    //Constructor
    public Suscripcion(String tipo, Double costo, int periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    //Getter
    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }

    public int getPeriodicidad() {
        return periodicidad;
    }

    //Setter

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void setPeriodicidad(int periodicidad) {
        this.periodicidad = periodicidad;
    }
}
