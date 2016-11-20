/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultasyReportes;

import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.Empleado;
import Empleados.Mesero;
import ServicioRestaurante.Bebida;
import ServicioRestaurante.Factura;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Restaurant;
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
    
   public Orden meseroDelmes(){
       
        int vecesActual=0,vecesMayor=0, mayor=0;
        
        for (int i = 0; i < Restaurant.listaOrdenes.size(); i++) {
            
            for (int j = 0; j < Restaurant.listaOrdenes.size(); j++) {
                if (Restaurant.listaOrdenes.get(i).getMesero().getNombreCompleto().equals(Restaurant.listaOrdenes.get(j).getMesero().getNombreCompleto())){ 
                    vecesActual++;
                }                                
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
    return Restaurant.listaOrdenes.get(mayor);
    
        
    }
    
    public Mesero cocineroDelmes(){
        
        int vecesActual=0,vecesMayor=0, mayor=0, productos=0;
        
        for (int i = 0; i < Restaurant.getInstance().getCantidadEmpleados(); i++) {
            
            for (int j = 0; j < Restaurant.getInstance().getCantidadEmpleados(); j++) {
                if (Restaurant.getInstance().getEmpleado(j) instanceof Cocinero){ 
                    Cocinero cocinero = (Cocinero) Restaurant.getInstance().getEmpleado(j);
                    int platBeb = cocinero.getCantPlatosCocinados() + cocinero.getCantidadBebidasHechas();
                    if (platBeb>productos){
                        vecesActual += platBeb;
                    }
                    
                }                                
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
    return (Mesero) Restaurant.getInstance().getEmpleado(mayor);       
    }
    
     //Metodo que va a dar los dos platos mas consumidos
    public int dosPlatosMasConsumidos() {
        int contador =0;
        for(int i= 0; i < facturas.size(); i++){
            if(facturas.get(i).getListaDetalle(i).getProducto().getNombre().equals(i)){
                contador++;
            }    
        }
        return contador;
    }
    
    //METODO QUE VA A DAR LA HORA DONDE EL RESTAURANTE ESTA MAS LLENO
    public String horaPicoRest() {
        String horaP=null,hora;
        int veces=0,mayor=0;
        
        for (int i = 0; i < facturas.size(); i++) {
            hora = facturas.get(i).getHora();
            
            for (int j = 0; j < facturas.size(); j++) {
                if (facturas.get(i).getHora().equals(hora)){
                    veces++;
                } 
            }
            if (veces>mayor){
                horaP = facturas.get(i).getHora();
            }
            mayor = veces;
            veces=0;
        }
        return horaP;
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
    
    //metodo que va a dar el total de platos creados en el mes
    public int totalPlatosxMes(int mes) { // precio de toooooooooooooodos los platos vendidos en un mes
        int total = 0;
        for (int i = 0; i < facturas.size(); i++) {
            
            String formato="MM";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==mes){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                //total += plato.getIdProducto(); 
            }
        }
        return total;
        
    }
    
    //metodo que va a dar el total de las bebidas por dia
      public int totalBebidasXDia(Bebida bebida, int dia) {  // precio total en un dia especifico
        int total=0;
        for (int i = 0; i < facturas.size(); i++) {
           String formato="d";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
            if (Integer.parseInt(dateFormat.format(facturas.get(i).getFecha()))==dia){ // obtengo el dia exacto de la fecha que tiene la factura y la comparo con el dia que recibo de parametro
                total += bebida.getIdProducto(); 
            }
        }
        return total;
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
            
            String formato="YYYY";
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
