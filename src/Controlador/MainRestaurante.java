/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Empleados.Cliente;
import Empleados.Cocinero;
import Empleados.Mesero;
import Empleados.CrearFabrica;
import ServicioRestaurante.Bebida;
import ServicioRestaurante.Detalle;
import ServicioRestaurante.Direccion;
import ServicioRestaurante.Menu;
import ServicioRestaurante.Mesa;
import ServicioRestaurante.Plato;
import ServicioRestaurante.Restaurant;
import ServicioRestaurante.VistaCocinero;
import Vistas.Main;

/**
 *
 * @author Extreme pc
 */
public class MainRestaurante {
    
    public static Restaurant rest = null;
      
    
    public static void main(String[] args) {
          
        
        
        
        VistaCocinero co = new VistaCocinero();
        
        CrearFabrica f = new CrearFabrica();
        
        Direccion dir = new Direccion("Alajuela", "San Carlos", "Florencia", "TEC Santa Clara");
        
        Menu menu = new Menu(0, 0); 

        rest = new Restaurant("Dos Cielos TEC", "logo", "24741386", "algo@gmail.com", menu, co,dir);
        /*
        ====================================================================================
        ====    Creación de mesas y su agregacion a la lista de mesas del restaurant    ====
        ====================================================================================
        */
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
       
        /*
        ================================================================
        ======     Creación de clientes, meseros y cocineros     =======
        ================================================================
        
        */       
        Cliente c1 = f.crearCliente(0, "Jose Carlos Rodriguez Arrieta", "207240382", "85282245");
        Cliente c2 = f.crearCliente(0, "Eliomar Rodriguez Arguedas", "207340342", "84583234");
        
        Mesero m1 = f.crearMesero("Ingles, Ruso, Español", "Aguas Zarcas", "rodriguez.elio.97@gmail.com", "Eliomar Rodriguez Arguedas", "207680623", "88965412");     
        Mesero m2 = f.crearMesero("Ingles, Frances, Español", "Los Chiles", "asd@hotmail.com", "Tulio Lopez", "205670945", "98764567");
        
        Cocinero co1 = f.creaCocinero(0, 0, "Postres", "Ciudad Quesada", "rodriguez.elio.97@gmail.com", "Jose Mauricio Rojas", "205500965", "86551217");
        rest.agregarEmpleado(m1);
        rest.agregarEmpleado(co1);
        rest.agregarEmpleado(m2);        
        /*
        ================================================================
        =========       Creación de platos y bebidas        ============
        ================================================================
        */
        Plato plato1 = new Plato(001, 1450, "arroz con pollo", 299, "pollo, zanahoria, bainica, arroz, maiz");
        Plato plato2 = new Plato(002, 1700, "arroz con carne", 600, "arroz, carne de cerdo, olores");
        Plato plato3 = new Plato(003, 500, "arroz", 250, "arroz");
        Plato plato4 = new Plato(004, 500, "frijoles negros", 500, "frijoles");
        Plato plato5 = new Plato(005, 1500, "arroz cantones",750, "arroz, pollo, olores, carne de cerdo");
        Plato plato6 = new Plato(006, 1500, "sopa maggy", 800, "arroz, papas,huevo duro, fideos");
        
        Bebida bebida1 = new Bebida(1, 1000, "Coca Cola", "Gaseosa", 600);
        Bebida bebida2 = new Bebida(2, 1000, "Batido de fresa","Fresco natural", 450);
        Bebida bebida3 = new Bebida(3, 800, "Fresco de cas", "Fresco natural", 400);
        Bebida bebida4 = new Bebida(4, 800, "Fresco de limon", "Fresco natural", 400);
        Bebida bebida5 = new Bebida(5, 1000, "Fanta", "Gaseosa", 600);
        Bebida bebida6 = new Bebida(6, 700, "Cafe", "Cafe", 300);
        
        /*
        ================================================================
        =========           Creación de detalle             ============
        ================================================================
        
        */
        Detalle detalle1 = new Detalle(4, plato6);
        
        //Orden o1 = new Orden(m1,mesa1,25,"Efectivo", "12", 6, 5,detalle1);
        
        //Orden o2 = new Orden(m2,mesa2,25,"Efectivo", "11", 6, 5,detalle1);

        Main main = new Main();
        main.setVisible(true);
                

        //o1.agregarProducto(plato1);

        //o2.agregarProducto(produ2);
        //System.out.println(Orden.listaProductos.toString());
                
        //Restaurant.listaOrdenes.add(o1);
        //Restaurant.listaOrdenes.add(o2);
        System.out.println(Restaurant.listaOrdenes.toString());       

      }
    
        
}
