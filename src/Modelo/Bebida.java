package Modelo;

public class Bebida {

    private int tipo;

    private int precio;

    private int tamano;

    private Cocinero creadorBebida;

    private int estadoPreparacion;

    private int idBebida;

    public Bebida() {
    } 

    public Bebida(int tipo, int precio, int tamano, Cocinero creadorBebida, int estadoPreparacion, int idBebida) {
        this.tipo = tipo;
        this.precio = precio;
        this.tamano = tamano;
        this.creadorBebida = creadorBebida;
        this.estadoPreparacion = estadoPreparacion;
        this.idBebida = idBebida;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Cocinero getCreadorBebida() {
        return creadorBebida;
    }

    public void setCreadorBebida(Cocinero creadorBebida) {
        this.creadorBebida = creadorBebida;
    }

    public int getEstadoPreparacion() {
        return estadoPreparacion;
    }

    public void setEstadoPreparacion(int estadoPreparacion) {
        this.estadoPreparacion = estadoPreparacion;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    @Override
    public String toString() {
        return "Bebida{" + "tipo=" + tipo + ", precio=" + precio + ", tamano=" + tamano + ", creadorBebida=" + creadorBebida + ", estadoPreparacion=" + estadoPreparacion + ", idBebida=" + idBebida + '}';
    }
    
}
