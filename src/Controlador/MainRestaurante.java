/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.CrearFabrica;
import Empleados.Mesero;
import Empleados.CrearFabrica;
import ServicioRestaurante.Detalle;
import ServicioRestaurante.Menu;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Orden;
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
      
    
    public static void main(String[] args) {
          
        Main ventana = new Main();
        ventana.setVisible(true);
        
        //CREAR MESAS
        VistaCocinero co = new VistaCocinero();
        
        //Cocinero cooker = new Cocinero(0, 0, "Frescos", "Aguas Zarcas", "algo@gmail.com", "Carlos Jose Mora", "207540123", "88664422");
        Menu menu = new Menu(0, 0); 
        
<<<<<<< HEAD
        
        Mesa mesa1 = new Mesa(1,1,true);
=======
        Restaurant.getInstance().setNombre("Dos Cielos TEC");
        Restaurant.getInstance().setTelefono("24741386");
        Restaurant.getInstance().setDirLogo("logo");
        Restaurant.getInstance().setVistaCocinero(co);
        Restaurant.getInstance().setMenu(menu);
        Restaurant.getInstance().setCorreo("algo@gmail.com");
        
        Mesa mesa1 = new Mesa(1,3,true);
>>>>>>> f4e36f1b3f3f8b7f0ac2d9e3b6f9eb1cdf63e7b0
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
        Restaurant.getInstance().setMesas(mesa1);
        Restaurant.getInstance().setMesas(mesa2);
        Restaurant.getInstance().setMesas(mesa3);
        Restaurant.getInstance().setMesas(mesa4);
        Restaurant.getInstance().setMesas(mesa5);
        Restaurant.getInstance().setMesas(mesa6);
        Restaurant.getInstance().setMesas(mesa7);
        Restaurant.getInstance().setMesas(mesa8);
        Restaurant.getInstance().setMesas(mesa9);
        Restaurant.getInstance().setMesas(mesa10);
        Restaurant.getInstance().setMesas(mesa11);
        Restaurant.getInstance().setMesas(mesa12);
        //System.out.println(rest.getMesas().size());
        
         
         
        
        Producto produ1 = new Producto(2,12000, "Papas");
        Orden.listaProductos.add(produ1);
        
        
        
        CrearFabrica f = new CrearFabrica();
        
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "2-0724-0382", "8528-2245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "2-0734-0342", "8458-3234");
        
        Mesero m1 = f.crearMesero("Ingles", "Santa Clara", "asd@hotmail.com", "Pedro Perez", "323232323", "121212121");
        
        Mesero m2 = f.crearMesero("Ingles", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "2-0567-0945", "9876-4567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        
        Detalle detalle = new Detalle();
        Detalle detalle2 = new Detalle();
        
        //System.out.println("Impresión de datos ingresados a \"pata\".\n"+c1.mostrar()+"\n"+c2.mostrar()+"\n"+co1.mostrar());
        
        //ORDENES
        
        Orden o1 = new Orden(m1,mesa1,25,"Efectivo", "12:05 pm", 6, 5,detalle);
        Orden o2 = new Orden(m2,mesa2,25,"Efectivo", "12:40 pm", 6, 5,detalle2);
        
        Restaurant.listaOrdenes.add(o1);
        Restaurant.listaOrdenes.add(o2);
        
        o1.agregarProducto(produ1);
        
        
      }
    
        
}
