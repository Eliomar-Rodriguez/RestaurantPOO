package Modelo;

<<<<<<< HEAD
public class Factory {

    public Mesero crearMesero() {
        return new Mesero();
    }

    public Cocinero crearCocinero(String especialidad) {
        return new Cocinero(0, 0, especialidad);
    }

    public Cliente crearCliente() {
        return new Cliente(0,"","","");
    }
=======
public interface Factory {
    
    public Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono);
    
    public Mesero crearMesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
    
    public Cocinero creaCocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
       
>>>>>>> 07558e4be14aa34d5e1f6ff1082ec51eb809e7c6
}

