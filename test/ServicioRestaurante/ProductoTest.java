/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRestaurante;

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
public class ProductoTest {
    
    private Producto produ;
    public ProductoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        produ = new Producto();
    }
    
    @After
    public void tearDown() {
        produ = null;
    }

    /**
     * Test of getIdProducto method, of class Producto.
     */
    @Test
    public void testGetIdProducto() {
        
        Producto instancia = new Producto();
        instancia.setIdProducto(2);
        int expResult = 2;
        int result = instancia.getIdProducto();
        assertEquals("Error en el producto",expResult, result);
    }

    /**
     * Test of setIdProducto method, of class Producto.
     */
    @Test
    public void testSetIdProducto() {
     
        Producto instancia = new Producto();
        instancia.setIdProducto(2);
        int resultado = instancia.getIdProducto();
        assertEquals("Error",resultado, 2);
        
              
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        Producto instancia = new Producto();
        instancia.setPrecio(12000);
        int expResult = 12000;
        int result = instancia.getPrecio();
        assertEquals("Error en el precio",expResult, result);
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        Producto instancia = new Producto();
        instancia.setPrecio(12000);
        int resultado = instancia.getPrecio();
        assertEquals("Error",resultado, 12000);
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    public void testGetNombre() {
        Producto instancia = new Producto();
        instancia.setNombre("Papas");
        String expResult = "Papas";
        String result = instancia.getNombre();
        assertEquals("Error en el producto",expResult, result);
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    public void testSetNombre() {
        Producto instancia = new Producto();
        instancia.setNombre("Papas");
        String resultado = instancia.getNombre();
        assertEquals("Error",resultado, "Papas");
    }

   
    
}
