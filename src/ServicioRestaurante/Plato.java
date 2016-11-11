package ServicioRestaurante;


import Empleados.Cocinero;

//CLASE PLATO QUE TIENE  ATRIBUTOS DEL PLATO
public class Plato extends Producto{

    private int cantCalorias;

    private String ingredientes;

    public Plato() {
    }

    //public Plato() {
    //}
    public Plato(int idProducto, int precio, String nombre, int cantCalorias, String ingredientes) {
        super(idProducto, precio, nombre);
        this.cantCalorias = cantCalorias;
        this.ingredientes = ingredientes;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Plato{" + "cantCalorias=" + cantCalorias + ", ingredientes=" + ingredientes + '}';
    }

    
    
}
