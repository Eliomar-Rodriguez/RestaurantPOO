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

    public Factura(Cliente cliente, Date fecha, String hora, Detalle detalle, int impuestoVenta, int cobroServicio) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.detalle = detalle;
        this.impuestoVenta = impuestoVenta;
        this.cobroServicio = cobroServicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Detalle getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle detalle) {
        this.detalle = detalle;
    }

    public int getImpuestoVenta() {
        return impuestoVenta;
    }

    public void setImpuestoVenta(int impuestoVenta) {
        this.impuestoVenta = impuestoVenta;
    }

    public int getCobroServicio() {
        return cobroServicio;
    }

    public void setCobroServicio(int cobroServicio) {
        this.cobroServicio = cobroServicio;
    }

    @Override
    public String toString() {
        return "Factura{" + "cliente=" + cliente + ", fecha=" + fecha + ", hora=" + hora + ", detalle=" + detalle + ", impuestoVenta=" + impuestoVenta + ", cobroServicio=" + cobroServicio + '}';
    }
    
}
