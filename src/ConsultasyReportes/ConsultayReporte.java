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
import ServicioRestaurante.Detalle;
import ServicioRestaurante.Factura;
import ServicioRestaurante.ItemPedido;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Restaurant;
import static ServicioRestaurante.Restaurant.facturas;
import ServicioRestaurante.VistaCocinero;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Vistas.ConsultasReportes;
import static Vistas.ConsultasReportes.areaConsulta;

/**
 *
 * @author Extreme pc
 */
public class ConsultayReporte {
    
    protected ArrayList<Cliente> listaClientes;
    

    public ConsultayReporte() {
        
        this.listaClientes = new ArrayList();

    }
    
   public Orden meseroDelmes(){
        String cadena7 = "";
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
        
        cadena7 = String.valueOf(Restaurant.listaOrdenes.get(mayor));
        
        cadena7= Integer.toString(mayor);
        
        areaConsulta.setText(cadena7);
        return Restaurant.listaOrdenes.get(mayor);
    
        
    }
    
    public ItemPedido cocineroDelmes(){// metodo del cocinero del mes
        
        int vecesActual=0,vecesMayor=0, mayor=0;
        
        for (int i = 0; i < VistaCocinero.listaItemPedido.size(); i++) {
            
            for (int j = 0; j < VistaCocinero.listaItemPedido.size(); j++) {
                if (VistaCocinero.listaItemPedido.get(i).getCreador().equals(VistaCocinero.listaItemPedido.get(j).getCreador())){ 
                    vecesActual++;
                }                                
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
    return VistaCocinero.listaItemPedido.get(mayor);
       
    }
    
     //Metodo que va a dar los dos platos mas consumidos
    public Detalle dosPlatosMasConsumidos() { // ESTA MALO
        int vecesActual=0,vecesMayor=0, mayor=0;
        
        for(int i= 0; i < ServicioRestaurante.Factura.listaDetalles.size(); i++){
            
            for(int j = 0; j< ServicioRestaurante.Factura.listaDetalles.size();j++){
                
                if(ServicioRestaurante.Factura.listaDetalles.get(i).getProducto().getNombre().equals(ServicioRestaurante.Factura.listaDetalles.get(j).getProducto().getNombre())){
                    vecesActual++;
                }
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
        return ServicioRestaurante.Factura.listaDetalles.get(mayor) ;
      
    }
    
    //METODO QUE VA A DAR LA HORA DONDE EL RESTAURANTE ESTA MAS LLENO
    public void horaPicoRest() {
        String hora;
                String horaPico = "";
                
                int veces=0,mayor=0;
        
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
                    hora = Restaurant.facturas.get(i).getHora();
            
                    for (int j = 0; j < Restaurant.facturas.size(); j++) {
                        if (Restaurant.facturas.get(i).getHora().equals(hora)){
                            veces++;
                        } 
                    }
                    if (veces>mayor){
                        horaPico = Restaurant.facturas.get(i).getHora();
                    }
                    mayor = veces;
                    veces=0;
                }
                
                
                areaConsulta.setText(horaPico);
    }
    
    //Metodo que va a dar el cliente mas frecuente de acuerdo al numero de visitas
    public Cliente clienteFrecuente() {
        String cadena6 = "";
        int vecesActual=0,vecesMayor=0, mayor=0;
        
        for (int i = 0; i < listaClientes.size(); i++) {
            
            for (int j = 0; j < Restaurant.facturas.size(); j++) {
                if (listaClientes.get(i).getCedula().equals(Restaurant.facturas.get(j).getCliente().getCedula())){ // si el cliente que esta en la lista
                    vecesActual++;
                }                                
            }
            if (vecesActual>vecesMayor){
                mayor=i;
            }
            vecesMayor=vecesActual; 
            vecesActual=0;
        }
        
        cadena6 = String.valueOf(listaClientes.get(mayor));
        
        cadena6= Integer.toString(mayor);
        
        areaConsulta.setText(cadena6);
        return listaClientes.get(mayor);
        
                
    }
    
    //metodo que va a dar el total de platos creados en el mes
    public void totalPlatosxMes() {
        String cadena5 = "";
                Plato plato = new Plato();
                int mes2 = 0;
                int total5 = 0;
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
            
                    String formato="MM";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);

                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==mes2){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                        total5 += plato.getIdProducto(); 
                    }
                }
                
                cadena5 = String.valueOf(total5);
 
                cadena5= Integer.toString(total5);
                areaConsulta.setText(cadena5);
        
    }
    
    //metodo que va a dar el total de las bebidas por dia
      public void totalBebidasXDia() { 
        String cadena4 = "";
                Bebida bebida = new Bebida();
                int dia = 0;
                int total4=0;
            
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
                    String formato="d";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==dia){ // obtengo el dia exacto de la fecha que tiene la factura y la comparo con el dia que recibo de parametro
                        total4 += bebida.getIdProducto(); 
                    }
                }
                cadena4 = String.valueOf(total4);
 
                cadena4= Integer.toString(total4);
                areaConsulta.setText(cadena4);
    }

    public void totalVendidoXMes() {// vendido por mes pensar bien como hacerlo porque son con lapso de tiempo     
                String cadena3 = "";
                int mes1 = 0;
                int total3 = 0;
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
            
                    String formato="MM";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);

                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==mes1){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                        total3 += Restaurant.facturas.get(i).getPrecioTotal(); // el precio total contiene el precio de las comidas mas lo impuestos, ademas del coste del servicio
                    }
                }
                
                cadena3 = String.valueOf(total3);
                
                cadena3= Integer.toString(total3);
                
               areaConsulta.setText(cadena3);
                
                
    }
    
    public void totalVendidoXAno() {// vendido por ano pensar bien como hacerlo
        String cadena2 = "";
                int ano = 0;
                int total2 = 0;
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
            
                    String formato="yyyy";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);

                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==ano){ // obtengo el año exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                        total2 += Restaurant.facturas.get(i).getPrecioTotal(); // el precio total contiene el precio de las comidas mas lo impuestos, ademas del coste del servicio
                    }
                }
                cadena2 = String.valueOf(total2);
 
                cadena2= Integer.toString(total2);
                areaConsulta.setText(cadena2);  
    }

    public void totalClientesXMes() {
        String cadena = "";
                int mes = 0;
                int total = 0;
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
            
                    String formato="MM";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);

                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==mes){ // obtengo el mes exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                        total += Restaurant.facturas.get(i).getCliente().getVisitasRealizadas(); // esto me va a dar la cantidad de visitas de clientes en el mes
                    }
                }
                cadena = String.valueOf(total);
 
                cadena= Integer.toString(total);
                areaConsulta.setText(cadena);
                
    }
    public void totalClientesXAno() {
         String cadena1 = "";
                int total1 = 0;
                int ano1 = 0;
                for (int i = 0; i < Restaurant.facturas.size(); i++) {
            
                    String formato="yyyy";
                    SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            
                    if (Integer.parseInt(dateFormat.format(Restaurant.facturas.get(i).getFecha()))==ano1){ // obtengo el año exacto de la fecha que tiene la factura y la comparo con el mes que recibo de parametro
                    total1 += Restaurant.facturas.get(i).getCliente().getVisitasRealizadas(); // esto me va a dar la cantidad de visitas de clientes en el año
                    }
                }
                cadena1 = String.valueOf(total1);
 
                cadena1= Integer.toString(total1);
                areaConsulta.setText(cadena1);
    }

    @Override
    public String toString() {
        return "ConsultayReporte{" + "facturas=" + facturas + ", listaClientes=" + listaClientes + '}';
    }
    
    
}
