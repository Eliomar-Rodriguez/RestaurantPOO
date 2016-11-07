package Modelo;

public class Menu {

    private int cantBebidas;

    private int cantPlatos;

    public Menu() {
    }

    public Menu(int cantBebidas, int cantPlatos) {
        this.cantBebidas = cantBebidas;
        this.cantPlatos = cantPlatos;
    }

    public void agregarBebida(Bebida b) {
    }

    public void agregarPlato(Plato plato) {
    }

    public void borrarBebida(Bebida b) {
    }

    public void borrarPlato(Plato p) {
    }

    public void buscarBebida(String nomBebida) {
    }

    public void buscarPlato(String nomPlato) {
    }

    public int getCantBebidas() {
        return cantBebidas;
    }

    public void setCantBebidas(int cantBebidas) {
        this.cantBebidas = cantBebidas;
    }

    public int getCantPlatos() {
        return cantPlatos;
    }

    public void setCantPlatos(int cantPlatos) {
        this.cantPlatos = cantPlatos;
    }

    @Override
    public String toString() {
        return "Menu{" + "cantBebidas=" + cantBebidas + ", cantPlatos=" + cantPlatos + '}';
    }
    
}
