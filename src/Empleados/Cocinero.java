package Empleados;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Restaurant;
import ServicioRestaurante.Restaurant;
public class Cocinero extends Empleado {

    private int cantPlatosCocinados;

    private int cantidadBebidasHechas;

    private String especialidad;

    public Cocinero() {
    }

    public Cocinero(int cantPlatosCocinados, int cantidadBebidasHechas, String especialidad, String direccion, String correo, String nombreCompleto, String cedula, String telefono) {
        super(direccion, correo, nombreCompleto, cedula, telefono);
        this.cantPlatosCocinados = cantPlatosCocinados;
        this.cantidadBebidasHechas = cantidadBebidasHechas;
        this.especialidad = especialidad;
    }
    
    
    public void crearPlato() {// como lo hago? lleno datos aqui o recibo por parametros un plato?
        //Los platos van por parametro, ya que van a estar en un menu fijo, el menu de un restaurante no cambia seguido.
    }
    
    //metodo en el cual se van a ver las ordenes pendientes
    public void verOrdenesPendientes() {
        System.out.println("Bebidas");
        for (int i = 0; i < Restaurant.listaOrdenes.size(); i++) {
            System.out.println(Restaurant.listaOrdenes.get(i).getBebida(i));
        }
        System.out.println("Platos");
        for (int i = 0; i < Restaurant.listaOrdenes.size(); i++) {
            System.out.println(Restaurant.listaOrdenes.get(i).getPlato(i));
        }
        
    }
    
    //metodo para ver el estado del plato
    public void cocinarPlatillo(Plato plato) {
    }

    public int getCantPlatosCocinados() {
        return cantPlatosCocinados;
    }

    public void setCantPlatosCocinados(int cantPlatosCocinados) {
        this.cantPlatosCocinados = cantPlatosCocinados;
    }

    public int getCantidadBebidasHechas() {
        return cantidadBebidasHechas;
    }

    public void setCantidadBebidasHechas(int cantidadBebidasHechas) {
        this.cantidadBebidasHechas = cantidadBebidasHechas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Cocinero{" + "cantPlatosCocinados=" + cantPlatosCocinados + ", cantidadBebidasHechas=" + cantidadBebidasHechas + ", especialidad=" + especialidad + '}';
    }
    
    @Override
    public String mostrar() {
        return "Cocinero{"+ "Platos cocinados=" + cantPlatosCocinados + "Bebidas hechas=" + cantidadBebidasHechas + "Especialidad="+ especialidad+ "Direccion=" + direccion + ",Correo=" + correo + ",Cedula=" + cedula + ",Telefono=" + telefono + '}';
    }
    
    
    
}
