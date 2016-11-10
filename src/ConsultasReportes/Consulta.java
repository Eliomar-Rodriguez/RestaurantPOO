
package ConsultasReportes;

import Empleados.Empleado;
import ServicioRestaurante.Cliente;
import ServicioRestaurante.Factura;
import java.util.ArrayList;


// En esta clase se crearan todos los metodos de consulta.
public class Consulta {
    protected ArrayList<Factura> facturas;
    protected ArrayList<Cliente> listaClientes;

    
    
    public Consulta() {
        this.facturas = new ArrayList();
        this.listaClientes = new ArrayList();
    }
    
    
    
    //Metodo que va a devolver el empleado del mes
    public Empleado getEmpleadoMes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
     //Metodo que va a dar los dos platos mas consumidos
    public void dosPlatosMasConsumidos() {
    }
    
    
    //METODO QUE VA A DAR LA HORA DONDE EL RESTAURANTE ESTA MAS LLENO
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
    
    //Metodo que va a dar el cliente mas frecuente de acuerdo al numero de visitas
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
}
