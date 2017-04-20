/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Medicament;
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
public class MedicamentControllerIT {
    
    /**
     *
     */
    public MedicamentControllerIT() {
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
     * Test of AjoutMedicament method, of class MedicamentController.
     */
    @Test
    public void testAjoutMedicament() {
        System.out.println("AjoutMedicament");
        String denomination = "";
        String laboratoire = "";
        String quantite = "";
        MedicamentController instance = new MedicamentController();
        instance.AjoutMedicament(denomination, laboratoire, quantite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditMedicament method, of class MedicamentController.
     */
    @Test
    public void testEditMedicament() {
        System.out.println("EditMedicament");
        String denominationAvant = "";
        String denomination = "";
        String laboratoire = "";
        String quantite = "";
        MedicamentController instance = new MedicamentController();
        instance.EditMedicament(denominationAvant, denomination, laboratoire, quantite);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteMedicament method, of class MedicamentController.
     */
    @Test
    public void testDeleteMedicament() {
        System.out.println("DeleteMedicament");
        String denomination = "";
        MedicamentController instance = new MedicamentController();
        instance.DeleteMedicament(denomination);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicamentList method, of class MedicamentController.
     */
    @Test
    public void testGetMedicamentList() {
        System.out.println("getMedicamentList");
        MedicamentController instance = new MedicamentController();
        ArrayList<Medicament> expResult = null;
        ArrayList<Medicament> result = instance.getMedicamentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectMedicamentByDenomination method, of class MedicamentController.
     */
    @Test
    public void testSelectMedicamentByDenomination() {
        System.out.println("selectMedicamentByDenomination");
        String denomination = "";
        MedicamentController instance = new MedicamentController();
        Medicament expResult = null;
        Medicament result = instance.selectMedicamentByDenomination(denomination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDenominationById method, of class MedicamentController.
     * @throws java.lang.Exception
     */
    @Test
    public void testShowDenominationById() throws Exception {
        System.out.println("showDenominationById");
        int id = 0;
        MedicamentController instance = new MedicamentController();
        Medicament expResult = null;
        Medicament result = instance.showDenominationById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
