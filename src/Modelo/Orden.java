package Modelo;

public class Orden {

    private Mesero mesero;

    private Mesa mesa;

    private int costoFinal;

    private String formaPago;

    private String hora;

    private int cantPlatos;

    private int cantBebidas;

    public Orden() {
    }

    public void cerrarOrden() {
    }

    public void setCostoFinal(int costoFinal) {
    }

    public int getCostoFinal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Factura facturar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Mesa getMesa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setMesa(Mesa mesa) {
    }

    public void setMesero(Mesero mesero) {
    }

    public Mesero getMesero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getEstadoPreparacion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setEstadoPreparacion(int est) {
    }

    public String getHora() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setHora(String h) {
    }

    public int getCantBebidas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCantPlatos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setCantPlatos(int cP) {
    }

    public void setCantidadBebidas(int cB) {
    }

    public void agregarBebida(Bebida bebida) {
    }

    public void agregarPlato(Plato plato) {
    }
}
