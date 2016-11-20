package Modelo;

public interface Factory {
    
    public Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono);
    
    public Mesero crearMesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
    
    public Cocinero creaCocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
       
}

