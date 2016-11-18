package ServicioRestaurante;

import java.util.ArrayList;

public class Detalle {

    private int cantidad;
    private Producto producto;

    public Detalle() {
    }

    public Detalle(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public void setCantidad(int c) {
        this.cantidad=c;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
}
