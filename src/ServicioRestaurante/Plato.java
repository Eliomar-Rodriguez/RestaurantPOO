package ServicioRestaurante;


import Empleados.Cocinero;

//CLASE PLATO QUE TIENE  ATRIBUTOS DEL PLATO
public class Plato {

    private String nomPlato;

    private int idPlato;

    private int cantCalorias;

    private int precioSinImpuestos;

    private String ingredientes;

    private Cocinero creadorPlato;

    private int estadoPreparacion;

    public Plato() {
    }

    public Plato(String nomPlato, int idPlato, int cantCalorias, int precioSinImpuestos, String ingredientes, Cocinero creadorPlato, int estadoPreparacion) {
        this.nomPlato = nomPlato;
        this.idPlato = idPlato;
        this.cantCalorias = cantCalorias;
        this.precioSinImpuestos = precioSinImpuestos;
        this.ingredientes = ingredientes;
        this.creadorPlato = creadorPlato;
        this.estadoPreparacion = estadoPreparacion;
    }

    public String getNomPlato() {
        return nomPlato;
    }

    public void setNomPlato(String nomPlato) {
        this.nomPlato = nomPlato;
    }

    public int getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(int idPlato) {
        this.idPlato = idPlato;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public int getPrecioSinImpuestos() {
        return precioSinImpuestos;
    }

    public void setPrecioSinImpuestos(int precioSinImpuestos) {
        this.precioSinImpuestos = precioSinImpuestos;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Cocinero getCreadorPlato() {
        return creadorPlato;
    }

    public void setCreadorPlato(Cocinero creadorPlato) {
        this.creadorPlato = creadorPlato;
    }

    public int getEstadoPreparacion() {
        return estadoPreparacion;
    }

    public void setEstadoPreparacion(int estadoPreparacion) {
        this.estadoPreparacion = estadoPreparacion;
    }

    @Override
    public String toString() {
        return "Plato{" + "nomPlato=" + nomPlato + ", idPlato=" + idPlato + ", cantCalorias=" + cantCalorias + ", precioSinImpuestos=" + precioSinImpuestos + ", ingredientes=" + ingredientes + ", creadorPlato=" + creadorPlato + ", estadoPreparacion=" + estadoPreparacion + '}';
    }

    
    
}
