/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioRestaurante;

import Empleados.Cliente;
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
public class ClienteTest {
    
    private Cliente cliente;
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cliente = new Cliente();
    }
    
    @After
    public void tearDown() {
        cliente = null;
    }

    /**
     * Test of getVisitasRealizadas method, of class Cliente.
     */
    @Test
    public void testGetVisitasRealizadas() {
        Cliente instancia = new Cliente();
        instancia.setVisitasRealizadas(2);
        int expResult = 2;
        int result = instancia.getVisitasRealizadas();
        assertEquals("Error en el producto",expResult, result);
    }

    /**
     * Test of setVisitasRealizadas method, of class Cliente.
     */
    @Test
    public void testSetVisitasRealizadas() {
        Cliente instancia = new Cliente();
        instancia.setVisitasRealizadas(2);
        int resultado = instancia.getVisitasRealizadas();
        assertEquals("Error",resultado, 2);
    }

    
    
}
