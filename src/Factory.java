//INTERFACE FACTORY PARA LOS METODOS ABSTRACTOS

public interface Factory {
    
    public Empleados.Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono);
    
    public Empleados.Mesero crearMesero(String idiomasDomina, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
    
    public Empleados.Cocinero creaCocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono);
       
}

