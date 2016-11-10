
import java.util.ArrayList;

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
    protected ArrayList<Mesa> listaMesas;
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

    public void totalPrecioXPlatoMes() {
    }

    public int totalBebidasXDia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalVendidoXMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalClientesXMes() {
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

    public void agregarProducto(Producto p) {
    }

    public VistaCocinero getVistaCocinero() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setVistaCocinero(VistaCocinero vC) {
    }

    public int totalVendidoXAno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int totalClientesXAno() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
