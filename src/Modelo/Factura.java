package Modelo;

import java.util.Date;

public class Factura {

    private Cliente cliente;

    private Date fecha;

    private String hora;

    private Detalle detalle;

    private int impuestoVenta;

    private int cobroServicio;

    public Factura() {
    }

    public Cliente getCliente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCliente(Cliente c) {
    }

    public Date getFecha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFecha(Date f) {
    }

    public String getHora() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHora(String h) {
    }

    public Detalle getDetalle() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDetalle(Detalle de) {
    }

    public int getCobroServicio() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCobroServicio(int cS) {
    }

    public int getImpuestoVenta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setImpuestoVenta(int iV) {
    }
}
