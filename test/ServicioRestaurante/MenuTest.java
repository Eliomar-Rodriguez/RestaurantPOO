/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRestaurante;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Extreme pc
 */
public class MenuTest {
    protected ArrayList<Producto> listaProductos;
    private Menu menu;
    public MenuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        menu = new Menu();
    }
    
    @After
    public void tearDown() {
        menu= null;
    }

    /**
     * Test of agregarProducto method, of class Menu.
     */
    @Test
    public void testAgregarProducto() {
        Menu me1 = new Menu();
        Producto produ = new Producto(2,12000, "Papas");
        listaProductos.add(produ);
        me1.agregarProducto(produ);
        int idP = 2;
        int result = me1.buscarProducto(idP).getIdProducto();
        assertEquals(idP, result);
        
    }

    /**
     * Test of borrarProducto method, of class Menu.
     */
    @Test
    public void testBorrarProducto() {  
        int idP = 2;
        Menu instance = new Menu();
        instance.borrarProducto(idP);
        
    }

    /**
     * Test of buscarProducto method, of class Menu.
     */
    @Test
    public void testBuscarProducto() {
        System.out.println("buscarProducto");
        int idP = 0;
        Menu instance = new Menu();
        Producto expResult = null;
        Producto result = instance.buscarProducto(idP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
