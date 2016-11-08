package Modelo;


import Modelo.Factura;
import Modelo.Cliente;
import Modelo.Orden;
import Modelo.Empleado;
import Modelo.Mesa;
import java.util.ArrayList;

public class Restaurant {

    protected String nombre;

    protected String dirLogo;

    protected String telefono;

    protected String correo;
    
    protected Menu menu;
    
    protected Direccion direccion;
    
    //private ArrayList<Direccion> direccion;      
    protected ArrayList<Empleado> listaEmpleados;   // lista que contiene los empleados del restaurante
    protected ArrayList<Mesa> listaMesas;
    protected ArrayList<Factura> facturas;
    protected ArrayList<Cliente> listaClientes;
    

    public Restaurant() {
    }

    public Restaurant(String nombre, String dirLogo, String telefono, String correo) {
        this.nombre = nombre;
        this.dirLogo = dirLogo;
        this.telefono = telefono;
        this.correo = correo;
        this.listaEmpleados = new ArrayList();
        this.listaClientes = new ArrayList();
        this.listaMesas = new ArrayList();
        this.facturas = new ArrayList();
    }
    
    public int agregarEmpleado(Empleado e){ // agregar empleados a la lista de empleados que hay
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(e.getCedula())){
                System.out.println("Ya existe este usuario!");
                return 0;
            }            
        }
        this.listaEmpleados.add(e); // ingresa el usuario en caso de que no exista otro igual ya que las cedulas son unicas para cada persona
        return 0;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
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
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getCantPersonas()==cantPersonas & listaMesas.get(i).getEstado()==true){ // si hay una mesa para esa cantidad de personas y que esta vacia entonces retorna true
                return true; // si hay mesa disponible!
            }
        }
        return false; // no hay mesa disponible para esa cantidad de personas o si habia alguna pero estaba ocupada
    }
    public boolean hayMesaDisponible() {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getEstado()==true){
                return true; // si hay mesa disponible!
            }
        }
        return false; // no hay mesa disponible porque nunca encontro una en estado true y se salio del ciclo despues de recorrer todas las mesas
    }

    public void eliminarCliente(String cedula) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCedula().equals(cedula)){
                listaClientes.remove(i); // elimina de la lista de clientes al cliente elegido
            }            
        }
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void ponerMesaOcupada(int numMesa) {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getNumMesa()==numMesa){
                listaMesas.get(i).setEstado(false); // mesa ocupada
            }
        }
    }
    
    
    public void ponerMesaDisponible(Mesa m) {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).equals(m)){
                listaMesas.get(i).setEstado(true);
            }            
        }
        m.setEstado(true); // disponible
    }

    public int agregarFactura(Factura factura) {
        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).equals(factura)){ // en caso de que ya exista una factura igual a esta
                System.out.println("Esta factura ya existe.");
                return 0;
            }            
        }
        facturas.add(factura); // agrega la factura
        return 0;
    }

    public void agregarOrdenesPreparar(Orden orden) { // en veremos
    }

    @Override
    public String toString() {
        return "Restaurant{" + "nombre=" + nombre + ", dirLogo=" + dirLogo + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + '}';
    }
    
}
