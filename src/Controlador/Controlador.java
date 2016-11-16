package Controlador;


import ServicioRestaurante.Factura;
import java.awt.event.ActionEvent;

public class Controlador {

     private Factura factura;

    public ActionEvent ActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Controlador(Factura factura) {
        this.factura = factura;
    }

    public Controlador() {
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Controlador{" + "factura=" + factura + '}';
    }
}