package ServicioRestaurante;

import java.util.ArrayList;

public class Detalle {

    private int cantidad;
    private ArrayList<Producto> listaProductos;

    public Detalle() {
    }

    public Detalle(int cantidad, String detalle) {
        this.cantidad = cantidad;
    }

    public Producto getProducto(int id) {
        //if (listaProductos.add(e) instanceof Plato){
            
        //}
        return listaProductos.get(id);
    }

    public void setPlato(Producto p) {
        this.listaProductos.add(p);
    }
    
    public void setCantidad(int c) {
        this.cantidad=c;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", listaProductos=" + listaProductos + '}';
    }

    
    
}
