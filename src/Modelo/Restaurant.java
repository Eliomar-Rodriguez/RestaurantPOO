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

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDirLogo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getTelefono() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDireccion() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCorreo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setNombre(String n) {
    }

    public void setDirLogo(String l) {
    }

    public void setTelefono(String t) {
    }

    public void setDireccion(String d) {
    }

    public void setCorreo(String c) {
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
}
