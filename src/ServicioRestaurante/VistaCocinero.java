package ServicioRestaurante;

import Empleados.Cliente;
import java.util.ArrayList;

public class VistaCocinero {
    
    protected Producto producto;
    protected ArrayList<Producto> listaProductos;
    public static ArrayList<ItemPedido> listaItemPedido;

    public VistaCocinero() {
        this.listaProductos = new ArrayList();
        this.listaItemPedido = new ArrayList();
        this.producto = producto;
    }
    
    
    public Producto getProducto(int i) {
        return listaProductos.get(i);
    }

    public void setProducto(Producto p) {
        this.listaProductos.add(p);
    }

    public ItemPedido getItemPedido(int i) {
        return listaItemPedido.get(i);
    }

    public void setItemPedido(ItemPedido itemPedido) {
        this.listaItemPedido.add(itemPedido);
    }

    @Override
    public String toString() {
        return "VistaCocinero{" + "listaProductos=" + listaProductos + ", listaItemPedido=" + listaItemPedido + '}';
    }
    
    
}
