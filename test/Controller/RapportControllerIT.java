/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Rapportdevisite;
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
public class RapportControllerIT {
    
    /**
     *
     */
    public RapportControllerIT() {
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
     * Test of getRapportdevisiteList method, of class RapportController.
     */
    @Test
    public void testGetRapportdevisiteList() {
        System.out.println("getRapportdevisiteList");
        RapportController instance = new RapportController();
        ArrayList<Rapportdevisite> expResult = null;
        ArrayList<Rapportdevisite> result = instance.getRapportdevisiteList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRapportdevisiteListByDateASC method, of class RapportController.
     */
    @Test
    public void testGetRapportdevisiteListByDateASC() {
        System.out.println("getRapportdevisiteListByDateASC");
        RapportController instance = new RapportController();
        ArrayList<Rapportdevisite> expResult = null;
        ArrayList<Rapportdevisite> result = instance.getRapportdevisiteListByDateASC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertId method, of class RapportController.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsertId() throws Exception {
        System.out.println("insertId");
        RapportController instance = new RapportController();
        int expResult = 0;
        int result = instance.insertId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisiteurId method, of class RapportController.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetVisiteurId() throws Exception {
        System.out.println("getVisiteurId");
        int id_utilisateur = 0;
        RapportController instance = new RapportController();
        int expResult = 0;
        int result = instance.getVisiteurId(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
