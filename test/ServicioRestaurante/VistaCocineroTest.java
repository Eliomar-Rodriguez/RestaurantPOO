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
public class VistaCocineroTest {
    
    private VistaCocinero vista;
    protected ArrayList<Producto> listaProductos;
    
    public VistaCocineroTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        vista = new VistaCocinero();
    }
    
    @After
    public void tearDown() {
        vista = null;
    }

    /**
     * Test of getProducto method, of class VistaCocinero.
     */
    @Test
    public void testGetProducto() {
        
        Producto produ1 = new Producto(2,12000, "Papas");
        listaProductos.add(produ1);
        VistaCocinero instancia = new VistaCocinero();
        instancia.setProducto(produ1);
        int expResult = 2;
        int result = instancia.listaProductos.get(2).getIdProducto();
        assertEquals("Error", expResult, result);
    }

    /**
     * Test of setProducto method, of class VistaCocinero.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto p = null;
        VistaCocinero instance = new VistaCocinero();
        instance.setProducto(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemPedido method, of class VistaCocinero.
     */
    @Test
    public void testGetItemPedido() {
        System.out.println("getItemPedido");
        int i = 0;
        VistaCocinero instance = new VistaCocinero();
        ItemPedido expResult = null;
        ItemPedido result = instance.getItemPedido(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemPedido method, of class VistaCocinero.
     */
    @Test
    public void testSetItemPedido() {
        System.out.println("setItemPedido");
        ItemPedido itemPedido = null;
        VistaCocinero instance = new VistaCocinero();
        instance.setItemPedido(itemPedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
