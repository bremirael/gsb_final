/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Visiteurmedical;
import javax.swing.table.DefaultTableModel;
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
public class VisiteurControllerIT {
    
    /**
     *
     */
    public VisiteurControllerIT() {
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
     * Test of isValidVisiteur method, of class VisiteurController.
     */
    @Test
    public void testIsValidVisiteur() {
        System.out.println("isValidVisiteur");
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String secteur = "";
        String labo = "";
        VisiteurController instance = new VisiteurController();
        boolean expResult = false;
        boolean result = instance.isValidVisiteur(nom, prenom, adresse, ville, secteur, labo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showVisiteurListInJTableByTable method, of class VisiteurController.
     */
    @Test
    public void testShowVisiteurListInJTableByTable() {
        System.out.println("showVisiteurListInJTableByTable");
        DefaultTableModel model = null;
        String maTable = "";
        VisiteurController instance = new VisiteurController();
        Object expResult = null;
        Object result = instance.showVisiteurListInJTableByTable(model, maTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomPrenomVisiteur method, of class VisiteurController.
     */
    @Test
    public void testGetNomPrenomVisiteur() {
        System.out.println("getNomPrenomVisiteur");
        Object rowV = null;
        VisiteurController instance = new VisiteurController();
        Visiteurmedical expResult = null;
        Visiteurmedical result = instance.getNomPrenomVisiteur(rowV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
