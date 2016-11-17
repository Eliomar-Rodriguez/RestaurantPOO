/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultasyReportes;

import Empleados.Cliente;
import Empleados.Empleado;
import ServicioRestaurante.Factura;
import ServicioRestaurante.Plato;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Extreme pc
 */
public class ConsultayReporte {
    protected ArrayList<Factura> facturas;
    protected ArrayList<Cliente> listaClientes;

    public ConsultayReporte() {
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
    
    public int totalPlatosxMes(Plato plato,int mes) {
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
    
    public int totalVendidoXAno(int ano) {// vendido por ano pensar bien como hacerlo
        int total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            
            String formato="yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==ano){ // obtengo el año exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                total += facturas.get(i).getPrecioTotal(); // el precio total contiene el precio de las comidas mas lo impuestos, ademas del coste del servicio
            }
        }
        return total;   
    }

    public int totalClientesXMes(int mes) {
        int total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            
            String formato="MM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==mes){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                total += facturas.get(i).getCliente().getVisitasRealizadas(); // esto me va a dar la cantidad de visitas de clientes en el mes
            }
        }
        return total;
    }
    public int totalClientesXAno(int ano) {
        int total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            
            String formato="yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==ano){ // obtengo el año exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                total += facturas.get(i).getCliente().getVisitasRealizadas(); // esto me va a dar la cantidad de visitas de clientes en el año
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "ConsultayReporte{" + "facturas=" + facturas + ", listaClientes=" + listaClientes + '}';
    }
    
    
}
