package Modelo;


import Modelo.Factura;
import Modelo.Cliente;
import Modelo.Orden;
import Modelo.Empleado;
import Modelo.Mesa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Restaurant {

    protected String nombre;

    protected String dirLogo;

    protected String telefono;

    protected String correo;
    
    protected Menu menu;
    
    protected Direccion direccion;
    
    //private ArrayList<Direccion> direccion;     
    public static ArrayList<Orden> listaOrdenes;
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
        this.listaOrdenes = new ArrayList();
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
        String horaPico,hora;
        int veces=0,mayor=0;
        
        for (int i = 0; i < facturas.size(); i++) {
            hora = facturas.get(i).getHora();
            
            for (int j = 0; j < facturas.size(); j++) {
                if (facturas.get(i).getHora().equals(hora)){
                    veces++;
                } 
            }
            if (veces>mayor){
                horaPico = facturas.get(i).getHora();
            }
            mayor = veces;
            veces=0;
        }
    }

    public Cliente clienteFrecuente() {
        int vecesActual=0,vecesMayor=0, mayor=0;
        
        for (int i = 0; i < listaClientes.size(); i++) {
            
            for (int j = 0; j < facturas.size(); j++) {
                if (listaClientes.get(i).getCedula().equals(facturas.get(j).getCliente().getCedula())){ // si el cliente que esta en la lista
                    vecesActual++;
                }                                
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
    return listaClientes.get(mayor);
    }

    public int totalPrecioXPlatoMes(Plato plato,int mes) {
        int precioTotal =0;
        for (int i = 0; i < facturas.size(); i++) {
                        
        }
        return precioTotal;
    }

    public int totalBebidasXDia(Date dia) { //  ocupa del tipo de bebida...
        int total=0;
        for (int i = 0; i < facturas.size(); i++) {
            //facturas.get(i).getDetalle().getBebida(i);// esta mal, falta pensar bien
        }
        return 0;
    }

    public int totalVendidoXMes(int mes) {// vendido por mes pensar bien como hacerlo porque son con lapso de tiempo     
        int total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            
            String formato="MM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==mes){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                total += facturas.get(i).getPrecioTotal(); // el precio total contiene el precio de las comidas mas lo impuestos, ademas del coste del servicio
            }
        }
        return total;
    }
    
    public int totalVendidoXAno() {// vendido por ano pensar bien como hacerlo
        int total = 0;
        
        return total;        
    }

    public int totalClientesXMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public int totalClientesXAno() {
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
            if (listaMesas.get(i).getNumMesa()==m.getNumMesa()){
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

    @Override
    public String toString() {
        return "Restaurant{" + "nombre=" + nombre + ", dirLogo=" + dirLogo + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + '}';
    }
    
}
