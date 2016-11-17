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
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Producto;
import ServicioRestaurante.Restaurant;
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
        
        
        Mesa mesa1 = new Mesa(1,1,true);
        Mesa mesa2 = new Mesa(2,5,true);
        Mesa mesa3 = new Mesa(3,2,true);
        Mesa mesa4 = new Mesa(4,6,true);
        Mesa mesa5 = new Mesa(5,2,true);
        Mesa mesa6 = new Mesa(6,4,true);
        Mesa mesa7 = new Mesa(7,2,true);
        Mesa mesa8 = new Mesa(8,0,true);
        Mesa mesa9 = new Mesa(9,0,true);
        Mesa mesa10 = new Mesa(10,0,true);
        Mesa mesa11 = new Mesa(11,0,true);
        Mesa mesa12 = new Mesa(12,0,true);
        
        Restaurant.listaMesas.add(mesa1);
        Restaurant.listaMesas.add(mesa2);
        Restaurant.listaMesas.add(mesa3);
        Restaurant.listaMesas.add(mesa4);
        Restaurant.listaMesas.add(mesa5);
        Restaurant.listaMesas.add(mesa6);
        Restaurant.listaMesas.add(mesa7);
        Restaurant.listaMesas.add(mesa8);
        Restaurant.listaMesas.add(mesa9);
        Restaurant.listaMesas.add(mesa10);
        Restaurant.listaMesas.add(mesa11);
        Restaurant.listaMesas.add(mesa12);
        
        Producto produ1 = new Producto(2,12000, "Papas");
       
        
        CrearFabrica f = new CrearFabrica();
        
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "2-0724-0382", "8528-2245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "2-0734-0342", "8458-3234");
        
        Mesero m1 = f.crearMesero("Ingles", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "2-0567-0945", "9876-4567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        
        //System.out.println("Impresión de datos ingresados a \"pata\".\n"+c1.mostrar()+"\n"+c2.mostrar()+"\n"+co1.mostrar());
      
      }
    
        
}
