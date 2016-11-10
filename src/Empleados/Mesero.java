package Empleados;

import ServicioRestaurante.Orden;


//CLASE MESERO
public class Mesero extends Empleado {

    private String idiomasDomina;

    public Mesero() {
    } 
    
    public Mesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        super(direccion, correo, nombreCompleto, cedula, telefono);
        this.idiomasDomina = idiomasDomina;
    }
    
    //DONDE COLOCARA EL MESERO AL CLIENTE (MESA X)
    public void ubicarCliente() {
    }

    public String getIdiomasDomina() {
        return idiomasDomina;
    }

    public void setIdiomasDomina(String idiomasDomina) {
        this.idiomasDomina = idiomasDomina;
    }    
    
    //metodo para entregar orden al cocinero
    public void entregarOrden(Orden o) {
    }
    
    //metodo para tomar orden al cliente
    public void tomarOrden(Orden orden) {
    }

    @Override
    public String toString() {
        return "Mesero{" + "idiomasDomina=" + idiomasDomina + '}';
    }
    
    @Override
    public String mostrar() {
        return "Mesero{"+ "Idiomas que domina=" + idiomasDomina + "Direccion=" + direccion + ",Correo=" + correo + ",Cedula=" + cedula + ",Telefono=" + telefono + '}';
    }
    
}
