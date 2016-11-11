package ServicioRestaurante;

import Empleados.Cocinero;

public class ItemPedido {

    private Cocinero creador;

    private String estado;

    private Producto producto;

    public ItemPedido() {
    }

    public ItemPedido(Cocinero creador, String estado, Producto producto) {
        this.creador = creador;
        this.estado = estado;
        this.producto = producto;
    }

    public Cocinero getCreador() {
        return creador;
    }

    public void setCreador(Cocinero creador) {
        this.creador = creador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "creador=" + creador + ", estado=" + estado + ", producto=" + producto + '}';
    }

    
}
