/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author passpass
 */
public class ComposeIT {
    
    /**
     *
     */
    public ComposeIT() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getQuantite method, of class Compose.
     */
    @Test
    public void testGetQuantite() {
        System.out.println("getQuantite");
        Compose instance = new Compose();
        int expResult = 0;
        int result = instance.getQuantite();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantite method, of class Compose.
     */
    @Test
    public void testSetQuantite() {
        System.out.println("setQuantite");
        int quantite = 0;
        Compose instance = new Compose();
        instance.setQuantite(quantite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_medicament method, of class Compose.
     */
    @Test
    public void testGetId_medicament() {
        System.out.println("getId_medicament");
        Compose instance = new Compose();
        int expResult = 0;
        int result = instance.getId_medicament();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_medicament method, of class Compose.
     */
    @Test
    public void testSetId_medicament() {
        System.out.println("setId_medicament");
        int id_medicament = 0;
        Compose instance = new Compose();
        instance.setId_medicament(id_medicament);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_echantillon method, of class Compose.
     */
    @Test
    public void testGetId_echantillon() {
        System.out.println("getId_echantillon");
        Compose instance = new Compose();
        int expResult = 0;
        int result = instance.getId_echantillon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_echantillon method, of class Compose.
     */
    @Test
    public void testSetId_echantillon() {
        System.out.println("setId_echantillon");
        int id_echantillon = 0;
        Compose instance = new Compose();
        instance.setId_echantillon(id_echantillon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
