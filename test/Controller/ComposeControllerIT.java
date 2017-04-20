/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Compose;
import java.util.ArrayList;
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
public class ComposeControllerIT {
    
    /**
     *
     */
    public ComposeControllerIT() {
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
     * Test of getComposeList method, of class ComposeController.
     */
    @Test
    public void testGetComposeList() {
        System.out.println("getComposeList");
        int id_echantillon = 0;
        ComposeController instance = new ComposeController();
        ArrayList<Compose> expResult = null;
        ArrayList<Compose> result = instance.getComposeList(id_echantillon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
