package ServicioRestaurante;

public class Bebida extends Producto {

    private int tipo;

    private int tamano;
    
    public Bebida(int idProducto, int precio, String nombre, int tipo, int tamano) {
        super(idProducto, precio, nombre);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public Bebida() {
    }
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + ", tamano=" + tamano + '}';
    }    
}