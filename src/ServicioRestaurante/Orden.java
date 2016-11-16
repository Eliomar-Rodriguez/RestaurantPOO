package ServicioRestaurante;

import Empleados.Mesero;
import java.util.ArrayList;

//CLASE ORDEN QUE CONTENDRA LO PEDIDO POR EL CLIENTE
public class Orden {

    private Mesero mesero;

    private Mesa mesa;

    private int costoFinal;
    
    private Detalle detalle;

    private String formaPago;
    
    private String hora;

    private ArrayList<Producto> listaProductos;
    //private ArrayList<Detalle> detalles; // tengo dudas si es una lista o simplemente una instancia
    public Orden() {
    }

    public Orden(Mesero mesero, Mesa mesa, int costoFinal, String formaPago, String hora, int cantPlatos, int cantBebidas, Detalle detalle) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.costoFinal = costoFinal;
        this.formaPago = formaPago;
        this.hora = hora;
        this.listaProductos = new ArrayList();
        this.detalle = detalle;
    }

    public Producto getProducto(int i) {
        return listaProductos.get(i);
    }
    
    public void cerrarOrden() {
    }

    public Factura facturar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getCostoFinal() {
        return costoFinal;
    }

    public void setCostoFinal(int costoFinal) {
        this.costoFinal = costoFinal;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void agregarProducto(Producto p) {
        listaProductos.add(p);
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Orden{" + "mesero=" + mesero + ", mesa=" + mesa + ", costoFinal=" + costoFinal + ", detalle=" + detalle + ", formaPago=" + formaPago + ", hora=" + hora + ", listaProductos=" + listaProductos + '}';
    }

    

       
}
