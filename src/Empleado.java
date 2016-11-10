public class Empleado extends Persona {

    private String direccion;

    private String correo;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String cedula, String telefono, String direccion, String correo) {
        super(nombreCompleto, cedula, telefono);
        this.correo = correo;
        this.direccion = direccion;
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
    
}
