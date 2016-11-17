package ServicioRestaurante;


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

    private String direccion;

    private String correo;
    
    protected Menu menu;

    private VistaCocinero vistaCocinero;
    
    public static ArrayList<Orden> listaOrdenes;
    protected ArrayList<Empleado> listaEmpleados;   // lista que contiene los empleados del restaurante

    public static ArrayList<Mesa> listaMesas;

    protected ArrayList<Factura> facturas;
    protected ArrayList<Cliente> listaClientes;
    
    public Restaurant() {
    }
    
    public Restaurant(String nombre, String dirLogo, String telefono, String correo, Menu menu, VistaCocinero vistaCocinero) {
        this.nombre = nombre;
        this.dirLogo = dirLogo;
        this.telefono = telefono;
        this.correo = correo;
        this.menu = menu;
        this.vistaCocinero = vistaCocinero;
        this.listaEmpleados = new ArrayList();
        this.listaClientes = new ArrayList();
        this.listaMesas = new ArrayList();
        this.facturas = new ArrayList();
        this.listaOrdenes = new ArrayList();
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
        return 0;
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
    public static Restaurant getInstance(){
        return new Restaurant();
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
    
    public void crearMesas(){
        Mesa mesa1 = new Mesa(0, 4, true);
        Mesa mesa2 = new Mesa(1, 6, true);
        Mesa mesa3 = new Mesa(2, 5, true);
        Mesa mesa4 = new Mesa(3, 8, true);
        Mesa mesa5 = new Mesa(4, 10, true);
        Mesa mesa6 = new Mesa(5, 2, true);
        Mesa mesa7 = new Mesa(6, 3, true);
        Mesa mesa8 = new Mesa(7, 10, true);
        Mesa mesa9 = new Mesa(8, 6, true);
        Mesa mesa10 = new Mesa(9, 4, true);
        Mesa mesa11 = new Mesa(10, 5, true);
        Mesa mesa12 = new Mesa(11, 7, true);
        this.setMesas(mesa1);
        this.setMesas(mesa2);
        this.setMesas(mesa3);
        this.setMesas(mesa4);
        this.setMesas(mesa5);
        this.setMesas(mesa6);
        this.setMesas(mesa7);
        this.setMesas(mesa8); 
        this.setMesas(mesa9);
        this.setMesas(mesa10);
        this.setMesas(mesa11);
        this.setMesas(mesa12);       
    }

    public VistaCocinero getVistaCocinero() {
        return vistaCocinero;
    }
    
    public Persona getEmpleado(String cedula){
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getCedula().equals(cedula)){
                return listaEmpleados.get(i);
            }
            
        }
        return null;
    }

    public void setVistaCocinero(VistaCocinero vC) {
        this.vistaCocinero = vC;
    }        
}
