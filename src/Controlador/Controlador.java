package Controlador;


import java.awt.event.ActionEvent;

public class Controlador {

     private ServicioRestaurante.Factura factura;

    public ActionEvent ActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Controlador(ServicioRestaurante.Factura factura) {
        this.factura = factura;
    }

    public Controlador() {
    }

    public ServicioRestaurante.Factura getFactura() {
        return factura;
    }

    public void setFactura(ServicioRestaurante.Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Controlador{" + "factura=" + factura + '}';
    }
}