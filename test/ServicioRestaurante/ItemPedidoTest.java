/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRestaurante;

import Empleados.Cocinero;

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
public class ItemPedidoTest {
    
    private ItemPedido pedido;
    public ItemPedidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pedido = new ItemPedido();
    }
    
    @After
    public void tearDown() {
        pedido=null;
    }

    /**
     * Test of getCreador method, of class ItemPedido.
     */
    @Test
    public void testGetCreador() {
        Cocinero cocina = new Cocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        ItemPedido instancia = new ItemPedido();
        instancia.setCreador(cocina);
        String expResult = "Juan Perez";
        String result = instancia.getCreador().getNombreCompleto();
        assertEquals("Error en el plato.",expResult, result);
    }

    /**
     * Test of setCreador method, of class ItemPedido.
     */
    @Test
    public void testSetCreador() {
        Cocinero cocina = new Cocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        ItemPedido instancia = new ItemPedido();
        instancia.setCreador(cocina);
        Cocinero resultado = instancia.getCreador();
        assertEquals("Error en el plato.",cocina, resultado);
    }

    /**
     * Test of getEstado method, of class ItemPedido.
     */
    @Test
    public void testGetEstado() {
        Producto produ = new Producto(2,12000, "Papas");
        Cocinero cocina = new Cocinero(0, 0, "Postres", "Aguas Zarcas", "jperez24@gmail.com", "Juan Perez", "2345-5678", "83638-3455");
        ItemPedido instancia = new ItemPedido(cocina,"Listo",produ);
        String result = instancia.getEstado();
        String espero = "Listo";
        assertEquals("Error en el getProducto.",espero, result);
    }

    /**
     * Test of setEstado method, of class ItemPedido.
     */
    @Test
    public void testSetEstado() {
        Producto produ = new Producto(2,12000, "Papas");
        ItemPedido instancia = new ItemPedido();
        instancia.setProducto(produ);
        Producto resultado = instancia.getProducto();
        assertEquals("Error en el producto.",produ, resultado);
    }

    /**
     * Test of getProducto method, of class ItemPedido.
     */
    @Test
    public void testGetProducto() {
        Producto produ = new Producto(2,12000, "Papas");
        ItemPedido instancia = new ItemPedido();
        instancia.setProducto(produ);
        int expResult = 2;
        int result = instancia.getProducto().getIdProducto();
        assertEquals("Error en el producto.",expResult, result);
    }

    /**
     * Test of setProducto method, of class ItemPedido.
     */
    @Test
    public void testSetProducto() {
        Producto produ = new Producto(2,12000, "Papas");
        ItemPedido instancia = new ItemPedido();
        instancia.setProducto(produ);
        Producto resultado = instancia.getProducto();
        assertEquals("Error en el plato.",produ, resultado);
    }

    
}
