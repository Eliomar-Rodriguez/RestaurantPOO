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

    private int cantPlatos;

    private int cantBebidas;
    private ArrayList<Bebida> listaBebidas;
    private ArrayList<Plato> listaPlatos;

    public Orden() {
    }

    public Orden(Mesero mesero, Mesa mesa, int costoFinal, String formaPago, String hora, int cantPlatos, int cantBebidas) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.costoFinal = costoFinal;
        this.formaPago = formaPago;
        this.hora = hora;
        this.cantPlatos = cantPlatos;
        this.cantBebidas = cantBebidas;
        this.listaBebidas = new ArrayList();
        this.listaPlatos = new ArrayList();
    }

    public Bebida getBebida(int i) {
        return listaBebidas.get(i);
    }

    public Plato getPlato(int i) {
        return listaPlatos.get(i);
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

    public int getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }

    public int getCantBebidas() {
        return cantBebidas;
    }

    public void setCantBebidas(int cantBebidas) {
        this.cantBebidas = cantBebidas;
    }

    public void agregarBebida(Bebida bebida) {
        listaBebidas.add(bebida);
    }

    public void agregarPlato(Plato plato) {
        listaPlatos.add(plato);
    }

    @Override
    public String toString() {
        return "Orden{" + "mesero=" + mesero + ", mesa=" + mesa + ", costoFinal=" + costoFinal + ", formaPago=" + formaPago + ", hora=" + hora + ", cantPlatos=" + cantPlatos + ", cantBebidas=" + cantBebidas + '}';
    }
}
