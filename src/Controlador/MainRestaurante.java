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
import ServicioRestaurante.Menu;
import ServicioRestaurante.Mesa;
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
          
        
        
        //CREAR MESAS
        VistaCocinero co = new VistaCocinero();
        
        Menu menu = new Menu(0, 0); 
        Restaurant rest = new Restaurant("Dos Cielos TEC", "logo", "24741386", "algo@gmail.com", menu, co);
    
        
        /*rest.setNombre("Dos Cielos TEC");
        rest.setTelefono("24741386");
        rest.setDirLogo("logo");
        rest.setVistaCocinero(co);
        rest.setMenu(menu);
        rest.setCorreo("algo@gmail.com");*/
        
        Mesa mesa1 = new Mesa(1,3,true);
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
        
        Producto produ1 = new Producto(2,12000, "Papas");
       
        
        CrearFabrica f = new CrearFabrica();
        
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "2-0724-0382", "8528-2245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "2-0734-0342", "8458-3234");
        
        Mesero m1 = f.crearMesero("Ingles", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "2-0567-0945", "9876-4567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        Main m = new Main();
        m.setVisible(true);
        //System.out.println("Impresión de datos ingresados a \"pata\".\n"+c1.mostrar()+"\n"+c2.mostrar()+"\n"+co1.mostrar());
      
      }
    
        
}
