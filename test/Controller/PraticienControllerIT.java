/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Praticien;
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
public class PraticienControllerIT {
    
    /**
     *
     */
    public PraticienControllerIT() {
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
     * Test of AjoutPraticien method, of class PraticienController.
     */
    @Test
    public void testAjoutPraticien() {
        System.out.println("AjoutPraticien");
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String code_postal = "";
        String telephone = "";
        String secteur = "";
        PraticienController instance = new PraticienController();
        instance.AjoutPraticien(nom, prenom, adresse, ville, code_postal, telephone, secteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomPrenomPraticien method, of class PraticienController.
     */
    @Test
    public void testGetNomPrenomPraticien() {
        System.out.println("getNomPrenomPraticien");
        Object rowP = null;
        PraticienController instance = new PraticienController();
        Praticien expResult = null;
        Praticien result = instance.getNomPrenomPraticien(rowP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditPraticien method, of class PraticienController.
     */
    @Test
    public void testEditPraticien() {
        System.out.println("EditPraticien");
        String NomPrenom = "";
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String code_postal = "";
        String telephone = "";
        String secteur = "";
        PraticienController instance = new PraticienController();
        instance.EditPraticien(NomPrenom, nom, prenom, adresse, ville, code_postal, telephone, secteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeletePraticien method, of class PraticienController.
     */
    @Test
    public void testDeletePraticien() {
        System.out.println("DeletePraticien");
        String nom = "";
        PraticienController instance = new PraticienController();
        instance.DeletePraticien(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPraticienList method, of class PraticienController.
     */
    @Test
    public void testGetPraticienList() {
        System.out.println("getPraticienList");
        PraticienController instance = new PraticienController();
        ArrayList<Praticien> expResult = null;
        ArrayList<Praticien> result = instance.getPraticienList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectPraticienByNom method, of class PraticienController.
     */
    @Test
    public void testSelectPraticienByNom() {
        System.out.println("selectPraticienByNom");
        String nom = "";
        PraticienController instance = new PraticienController();
        Praticien expResult = null;
        Praticien result = instance.selectPraticienByNom(nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
