package Modelo;

public class Empleado extends Persona {

    private String direccion;

    private String correo;

    public Empleado() {
    }

    public Empleado(String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        super(nombreCompleto, cedula, telefono);
        this.direccion = direccion;
        this.correo = correo;
    }

   
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "direccion=" + direccion + ", correo=" + correo + '}';
    }

    @Override
    public String mostrar() {
        return "Empleado{" + "Direccion=" + direccion + ",Correo=" + correo + ",Cedula=" + cedula + ",Telefono=" + telefono + '}';
    }
    
}
