package Modelo;

public class Detalle {

    private int cantidad;

    private String detalle;

    public Detalle() {
    }

    public Detalle(int cantidad, String detalle) {
        this.cantidad = cantidad;
        this.detalle = detalle;
    }
    
    public void setCantidad(int c) {
        this.cantidad=c;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setDetalle(String d) {
        this.detalle=d;
    }

    public String getDetalle() {
        return detalle;
    }

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", detalle=" + detalle + '}';
    }
    
}
