package Modelo;

public interface Factory { // DEBEN SER COCINERO Y EMPLEADO
    
    public Cliente crearCliente(int visitasRealizadas, String nombreCompleto, String cedula, String telefono);
    
    public Empleado crearEmpleado(String direccion, String correo,String nombreCompleto, String cedula, String telefono);
       
}
