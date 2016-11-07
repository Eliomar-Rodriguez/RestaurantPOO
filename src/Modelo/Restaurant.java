package Modelo;


import Modelo.Factura;
import Modelo.Cliente;
import Modelo.Orden;
import Modelo.Empleado;
import Modelo.Mesa;

public class Restaurant {

    private String nombre;

    private String dirLogo;

    private String telefono;

    private String direccion;

    private String correo;

    public Restaurant() {
    }

    public Restaurant(String nombre, String dirLogo, String telefono, String direccion, String correo) {
        this.nombre = nombre;
        this.dirLogo = dirLogo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirLogo() {
        return dirLogo;
    }

    public void setDirLogo(String dirLogo) {
        this.dirLogo = dirLogo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public Empleado getEmpleadoMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void dosPlatosMasConsumidos() {
    }

    public void horaPicoRest() {
    }

    public Cliente clienteFrecuente() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalPrecioXPlatoMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalBebidasXDia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalVendidoXMesYAno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalClientesXMesYAno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hayMesa(int cantPersonas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean hayMesaDisponible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void eliminarCliente(String nombre) {
    }

    public void registrarCliente(Cliente cliente) {
    }

    public void ponerMesaOcupada(int numMesa) {
    }

    public void ponerMesaDisponible(Mesa m) {
    }

    public void agregarFactura(Factura factura) {
    }

    public void agregarOrdenesPreparar(Orden orden) {
    }

    @Override
    public String toString() {
        return "Restaurant{" + "nombre=" + nombre + ", dirLogo=" + dirLogo + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + '}';
    }
    
}
