package ServicioRestaurante;

import Empleados.Mesero;
import java.util.ArrayList;

//CLASE ORDEN QUE CONTENDRA LO PEDIDO POR EL CLIENTE
public class Orden {

    private Mesero mesero;

    private Mesa mesa;

    private int costoFinal;

    private String formaPago;
    
    private String hora;
    
    public static ArrayList<Detalle> listaDetalles;
    //private ArrayList<Detalle> detalles; // tengo dudas si es una lista o simplemente una instancia
    public Orden() {
    }

    public Orden(Mesero mesero, Mesa mesa, int costoFinal, String formaPago, String hora, int cantPlatos, int cantBebidas) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.costoFinal = costoFinal;
        this.formaPago = formaPago;
        this.hora = hora;
        this.listaDetalles = new ArrayList();
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

    public void agregarDetalle(Detalle detalle) {
        listaDetalles.add(detalle);
    } 
    
    public Detalle getDetalle(int i) {
        return listaDetalles.get(i);
    }
    
    public ArrayList<Detalle> getListaDetalle() {
        return listaDetalles;
    }

    @Override
    public String toString() {
        return "Orden{" + "mesero=" + mesero + ", mesa=" + mesa + ", costoFinal=" + costoFinal + ", formaPago=" + formaPago + ", hora=" + hora + '}';
    }
    
}
