package Modelo;

public class Mesero extends Empleado {

    private String idiomasDomina;

    public Mesero() {
    } 

    public Mesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        super(direccion, correo, nombreCompleto, cedula, telefono);
        this.idiomasDomina = idiomasDomina;
    }

    
    
    public void ubicarCliente() {
    }

    public String getIdiomasDomina() {
        return idiomasDomina;
    }

    public void setIdiomasDomina(String idiomasDomina) {
        this.idiomasDomina = idiomasDomina;
    }    

    public void entregarOrden(Orden o) {
    }

    public void tomarOrden(Orden orden) {
    }

    @Override
    public String toString() {
        return "Mesero{" + "idiomasDomina=" + idiomasDomina + '}';
    }
    
}
