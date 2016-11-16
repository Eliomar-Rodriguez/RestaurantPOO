
package Empleados;


// fabrica que contendra los metodos del factory para crearlos.
public class CrearFabrica implements Factory{

    @Override
    public Mesero crearMesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        return new Mesero(idiomasDomina,direccion,correo,nombreCompleto,cedula,telefono);
    }
    
    @Override
    public Cocinero creaCocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        return new Cocinero(cantPlatosCocinados, cantidadBebidasHechas,especialidad,direccion,correo,nombreCompleto,cedula,telefono);
    }

    @Override
    public Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono) {
         return new Cliente(nombreCompleto, cedula, telefono, visitasRealizadas);
    }
    
}
