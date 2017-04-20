/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Echantillon;
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
public class EchantillonControllerIT {
    
    /**
     *
     */
    public EchantillonControllerIT() {
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
     * Test of getRef_Echantillon method, of class EchantillonController.
     */
    @Test
    public void testGetRef_Echantillon() {
        System.out.println("getRef_Echantillon");
        Object rowE = null;
        EchantillonController instance = new EchantillonController();
        Echantillon expResult = null;
        Echantillon result = instance.getRef_Echantillon(rowE);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
