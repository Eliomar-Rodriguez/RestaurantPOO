/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ConsultasyReportes.ConsultayReporte;
import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.CrearFabrica;
import Empleados.Mesero;
import Empleados.CrearFabrica;
import ServicioRestaurante.Bebida;
import ServicioRestaurante.Detalle;
import ServicioRestaurante.Direccion;
import ServicioRestaurante.ItemPedido;
import ServicioRestaurante.Menu;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Orden;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Producto;
import ServicioRestaurante.Restaurant;
import ServicioRestaurante.VistaCocinero;
import Vistas.Main;
import java.util.ArrayList;

/**
 *
 * @author Extreme pc
 */
public class MainRestaurante {
    
    public static Restaurant rest = null;
      
    
    public static void main(String[] args) {
          
        
        
        
        VistaCocinero co = new VistaCocinero();
        
        Direccion dir = new Direccion("Alajuela", "San Carlos", "Florencia", "TEC Santa Clara");
        
        Menu menu = new Menu(0, 0); 

        rest = new Restaurant("Dos Cielos TEC", "logo", "24741386", "algo@gmail.com", menu, co,dir);
        
        Mesa mesa1 = new Mesa(1,1,true);
        Mesa mesa2 = new Mesa(2,5,true);
        Mesa mesa3 = new Mesa(3,2,true);
        Mesa mesa4 = new Mesa(4,6,true);
        Mesa mesa5 = new Mesa(5,1,true);
        Mesa mesa6 = new Mesa(6,4,true);
        Mesa mesa7 = new Mesa(7,2,true);
        Mesa mesa8 = new Mesa(8,12,true);
        Mesa mesa9 = new Mesa(9,10,true);
        Mesa mesa10 = new Mesa(10,8,true);
        Mesa mesa11 = new Mesa(11,7,true);
        Mesa mesa12 = new Mesa(12,11,true);       
        
        rest.setMesas(mesa1);
        rest.setMesas(mesa2);
        rest.setMesas(mesa3);
        rest.setMesas(mesa4);
        rest.setMesas(mesa5);
        rest.setMesas(mesa6);
        rest.setMesas(mesa7);
        rest.setMesas(mesa8);
        rest.setMesas(mesa9);
        rest.setMesas(mesa10);
        rest.setMesas(mesa11);
        rest.setMesas(mesa12);
        System.out.println(Restaurant.getInstance().getMesas().size());
 
        /*Producto produ1 = new Producto(2,12000, "Papas");
        Orden.listaProductos.add(produ1);
        
        */
       
        CrearFabrica f = new CrearFabrica();
        
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "207240382", "85282245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "207340342", "84583234");
        
        Mesero m1 = f.crearMesero("Ingles, Ruso, Mandarin", "Santa Clara", "asd@hotmail.com", "Pedro Perez", "389654120", "88965412");
        
        Mesero m2 = f.crearMesero("Ingles, Frances, Español", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "205670945", "98764567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "203451678", "836383455");
        Cocinero co2 = f.creaCocinero(0, 0, "Arroces", "Aguas Zarcas", "jperez24@gmail.com", "Pancho Perez", "203451678", "836383455");
        Cocinero co3 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Jose Perez", "203451678", "836383455");
        Cocinero co4 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Eliomar Perez", "203451678", "836383455");
        Detalle detalle = new Detalle();
        Detalle detalle2 = new Detalle();
        rest.agregarEmpleado(co1);
        rest.agregarEmpleado(co2);
        rest.agregarEmpleado(co3);
        rest.agregarEmpleado(co4);
        

        //System.out.println("Impresión de datos ingresados a \"pata\".\n"+c1.mostrar()+"\n"+c2.mostrar()+"\n"+co1.mostrar());
        
        //ORDENES
        
        Orden o1 = new Orden(m1,mesa1,25,"Efectivo", "12", 6, 5,detalle);
        Orden o2 = new Orden(m2,mesa2,25,"Efectivo", "11", 6, 5,detalle2);
        
        Restaurant.listaOrdenes.add(o1);
        Restaurant.listaOrdenes.add(o2);
        System.out.println(Restaurant.listaOrdenes.toString());
        
        Plato plato1 = new Plato(11, 1500, "arroz con pollo", 1200, "Pollo, zanahoria, bainica, arroz, maiz");
        
        Bebida be1 = new Bebida(1, 1000, "Coca Cola 700 ml", 1, 700);

        Main main = new Main();
        main.setVisible(true);
                

        o1.agregarProducto(plato1);
        o1.agregarProducto(plato1);
        o1.agregarProducto(be1);
        System.out.println(Orden.listaProductos.toString());
        
        ItemPedido item = new ItemPedido(co1,"Listo",plato1);
        ItemPedido item1 = new ItemPedido(co1,"Listo",be1);
        co.setItemPedido(item);
        co.setItemPedido(item1);
        
        
        
        
        
        
      }
    
        
}
