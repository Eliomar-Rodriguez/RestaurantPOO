/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsultasReportes;

import ServicioRestaurante.Factura;
import ServicioRestaurante.Plato;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Peniche
 */

//CLASE QUE CONTENDRA TODOS LOS REPORTES DEL PROYECTO
public class Reporte {
    
    protected ArrayList<Factura> facturas;
    
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
}
