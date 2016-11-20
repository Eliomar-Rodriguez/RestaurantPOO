package ServicioRestaurante;

public class Bebida extends Producto {

    private String tipo;

    private int tamano;
    
    public Bebida(String idProducto, int precio, String nombre, String tipo, int tamano) {
        super(idProducto, precio, nombre);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public Bebida() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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