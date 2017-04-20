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
public class MedicamentIT {
    
    /**
     *
     */
    public MedicamentIT() {
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
     * Test of getId_medicament method, of class Medicament.
     */
    @Test
    public void testGetId_medicament() {
        System.out.println("getId_medicament");
        Medicament instance = new Medicament();
        int expResult = 0;
        int result = instance.getId_medicament();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_medicament method, of class Medicament.
     */
    @Test
    public void testSetId_medicament() {
        System.out.println("setId_medicament");
        int id_medicament = 0;
        Medicament instance = new Medicament();
        instance.setId_medicament(id_medicament);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDenomination method, of class Medicament.
     */
    @Test
    public void testGetDenomination() {
        System.out.println("getDenomination");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getDenomination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDenomination method, of class Medicament.
     */
    @Test
    public void testSetDenomination() {
        System.out.println("setDenomination");
        String denomination = "";
        Medicament instance = new Medicament();
        instance.setDenomination(denomination);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLaboratoire method, of class Medicament.
     */
    @Test
    public void testGetLaboratoire() {
        System.out.println("getLaboratoire");
        Medicament instance = new Medicament();
        String expResult = "";
        String result = instance.getLaboratoire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLaboratoire method, of class Medicament.
     */
    @Test
    public void testSetLaboratoire() {
        System.out.println("setLaboratoire");
        String laboratoire = "";
        Medicament instance = new Medicament();
        instance.setLaboratoire(laboratoire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantiteStock method, of class Medicament.
     */
    @Test
    public void testGetQuantiteStock() {
        System.out.println("getQuantiteStock");
        Medicament instance = new Medicament();
        int expResult = 0;
        int result = instance.getQuantiteStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantiteStock method, of class Medicament.
     */
    @Test
    public void testSetQuantiteStock() {
        System.out.println("setQuantiteStock");
        int quantiteStock = 0;
        Medicament instance = new Medicament();
        instance.setQuantiteStock(quantiteStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
