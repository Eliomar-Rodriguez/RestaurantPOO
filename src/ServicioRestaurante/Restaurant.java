package ServicioRestaurante;


import Controlador.MainRestaurante;
import ServicioRestaurante.Factura;
import Empleados.Cliente;
import ServicioRestaurante.Orden;
import Empleados.Empleado;
import Empleados.Persona;
import ServicioRestaurante.Mesa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;


public class Restaurant {

    private String nombre;

    private String dirLogo;

    private String telefono;

    private Direccion direccion;

    private String correo;
    
    protected Menu menu;
    
    private VistaCocinero vistaCocinero;
           
    public static ArrayList<Orden> listaOrdenes;
    
    public static ArrayList<Empleado> listaEmpleados;   // lista que contiene los empleados del restaurante

    public static ArrayList<Mesa> listaMesas;

    public static ArrayList<Factura> facturas;
    
    protected ArrayList<Cliente> listaClientes;
    
    
    public Restaurant() {
    }
    
    public Restaurant(String nombre, String dirLogo, String telefono, String correo, Menu menu, VistaCocinero vistaCocinero, Direccion direccion) {
        this.nombre = nombre;
        this.dirLogo = dirLogo;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.menu = menu;
        this.vistaCocinero = vistaCocinero;
        this.listaEmpleados = new ArrayList();
        this.listaClientes = new ArrayList();
        this.listaMesas = new ArrayList();
        this.facturas = new ArrayList();
        this.listaOrdenes = new ArrayList();
        
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }
    

    public ArrayList<Orden> getListaOrdenes() {
        return listaOrdenes;
    }
    
    public ArrayList<Mesa> getMesas() {
        return listaMesas;
    }
    
    public void setMesas(Mesa m) {
        listaMesas.add(m);
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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int agregarEmpleado(Empleado e){ // agregar empleados a la lista de empleados que hay
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(e.getCedula())){
                System.out.println("Ya existe este usuario!");
                return 0;
            }            
        }
        
        this.listaEmpleados.add(e); // ingresa el usuario en caso de que no exista otro igual ya que las cedulas son unicas para cada persona
        return 1;
    }

    public boolean hayMesa(int cantPersonas) {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getCantPersonas()==cantPersonas & listaMesas.get(i).getEstado()==true){ // si hay una mesa para esa cantidad de personas y que esta vacia entonces retorna true
                return true; // si hay mesa disponible!
            }
        }
        return false; // no hay mesa disponible para esa cantidad de personas o si habia alguna pero estaba ocupada
    }
    public int getCantidadEmpleados(){
        return listaEmpleados.size();
    }
    public boolean hayMesaDisponible() {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getEstado()==true){
                return true; // si hay mesa disponible!
            }
        }
        return false;   // no hay mesa disponible porque nunca encontro una en estado true y se salio del ciclo despues
                        // de recorrer todas las mesas
    }

    public void eliminarCliente(String cedula) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCedula().equals(cedula)){
                listaClientes.remove(i); // elimina de la lista de clientes al cliente elegido
            }            
        }
    }
    public static Restaurant getInstance(){                                        ////////////////////
        
        return MainRestaurante.rest;
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
    
    public void ponerMesaDisponible(int numMesa) {
        for (int i = 0; i < listaMesas.size(); i++) {
            if (listaMesas.get(i).getNumMesa()==numMesa){
                listaMesas.get(i).setEstado(true);
            }            
        }
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
        listaOrdenes.add(orden);
    }

    public void agregarProducto(Producto p) {
    }

    public VistaCocinero getVistaCocinero() {
        return vistaCocinero;
    }
    
    public int eliminarEmpleado(String cedula){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)){
                listaEmpleados.remove(i);
                return 1; // 1 significa encontrado y eliminado
            }
        }
        return 0; // no encontro al empleado
    }
    public Empleado getEmpleado(String cedula){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)){
                return listaEmpleados.get(i);
            }
            
        }
        return null;
    }

    public void setOrden(Orden orden) {
        Restaurant.listaOrdenes.add(orden);
    }
        
    public Empleado getEmpleado(int i){
        return listaEmpleados.get(i);
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    
    

    public void setVistaCocinero(VistaCocinero vC) {
        this.vistaCocinero = vC;
    }        
}
