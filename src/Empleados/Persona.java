package Empleados;

//CLASE ABSTRACTA PERSONA PARA IMPLEMENTAR SUS METODOS Y UTILIZAR EL PATRON FACTORY
public abstract class Persona {

    protected String nombreCompleto;

    protected String cedula;

    protected String telefono;

    public Persona() {
    }

    public Persona(String nombreCompleto, String cedula, String telefono) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", cedula=" + cedula + ", telefono=" + telefono + '}';
    }
    //METODO ABSTRACTO QUE VA A CONTENER LA INFORMACION CREADA POR EL FACTORY
    public abstract String mostrar();
}
