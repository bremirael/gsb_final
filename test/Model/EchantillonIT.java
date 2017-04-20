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
public class EchantillonIT {
    
    /**
     *
     */
    public EchantillonIT() {
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
     * Test of getId_echantillon method, of class Echantillon.
     */
    @Test
    public void testGetId_echantillon() {
        System.out.println("getId_echantillon");
        Echantillon instance = new Echantillon();
        int expResult = 0;
        int result = instance.getId_echantillon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_echantillon method, of class Echantillon.
     */
    @Test
    public void testSetId_echantillon() {
        System.out.println("setId_echantillon");
        int id_echantillon = 0;
        Echantillon instance = new Echantillon();
        instance.setId_echantillon(id_echantillon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRef_echantillon method, of class Echantillon.
     */
    @Test
    public void testGetRef_echantillon() {
        System.out.println("getRef_echantillon");
        Echantillon instance = new Echantillon();
        String expResult = "";
        String result = instance.getRef_echantillon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRef_echantillon method, of class Echantillon.
     */
    @Test
    public void testSetRef_echantillon() {
        System.out.println("setRef_echantillon");
        String ref_echantillon = "";
        Echantillon instance = new Echantillon();
        instance.setRef_echantillon(ref_echantillon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
