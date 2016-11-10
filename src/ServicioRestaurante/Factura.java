package ServicioRestaurante;

import Empleados.Cliente;
import java.util.ArrayList;
import java.util.Date;

//clase factura para cobrarle al cliente
public class Factura {

    private Cliente cliente;

    private Date fecha;

    private String hora;

    private int impuestoVenta;

    private int cobroServicio;
    
    private int precioTotal;
    private ArrayList<Detalle> listaDetalles;

    public Factura() {
    }
        
    public Factura(Cliente cliente, Date fecha, String hora, Detalle detalle, int impuestoVenta, int cobroServicio,int precioTotal) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.impuestoVenta = impuestoVenta;
        this.cobroServicio = cobroServicio;
        this.precioTotal = precioTotal;
        this.listaDetalles = new ArrayList();
    }

    public Detalle getListaDetalle(int i) {
        return listaDetalles.get(i);
    }

    public void setDetalle(Detalle detalle) {
        this.listaDetalles.add(detalle);
    }
    
    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
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
        return "Factura{" + "cliente=" + cliente + ", fecha=" + fecha + ", hora=" + hora + ", impuestoVenta=" + impuestoVenta + ", cobroServicio=" + cobroServicio + '}';
    }
    
}
