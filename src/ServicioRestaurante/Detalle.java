package ServicioRestaurante;

import java.util.ArrayList;

public class Detalle {

    private int cantidad;
    private ArrayList<Bebida> listaBebidas;
    private ArrayList<Plato> listaPlatos;

    public Detalle() {
    }

    public Detalle(int cantidad, String detalle) {
        this.cantidad = cantidad;
    }

    public Bebida getBebida(int i) {
        return listaBebidas.get(i);
    }

    public void setBebidas(Bebida bebida) {
        this.listaBebidas.add(bebida);
    }

    public Plato getPlato(int i) {
        return listaPlatos.get(i);
    }

    public void setPlato(Plato plato) {
        this.listaPlatos.add(plato);
    }
    
    public void setCantidad(int c) {
        this.cantidad=c;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", listaBebidas=" + listaBebidas + ", listaPlatos=" + listaPlatos + '}';
    }

    
}
