/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class VisiteurDAOIT {
    
    /**
     *
     */
    public VisiteurDAOIT() {
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
     * Test of getVisiteurByNomPrenom method, of class VisiteurDAO.
     */
    @Test
    public void testGetVisiteurByNomPrenom() {
        System.out.println("getVisiteurByNomPrenom");
        String nom = "";
        String prenom = "";
        VisiteurDAO instance = new VisiteurDAO();
        Visiteurmedical expResult = null;
        Visiteurmedical result = instance.getVisiteurByNomPrenom(nom, prenom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVisiteurByIdUser method, of class VisiteurDAO.
     */
    @Test
    public void testFindVisiteurByIdUser() {
        System.out.println("findVisiteurByIdUser");
        int id_utilisateur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        Visiteurmedical expResult = null;
        Visiteurmedical result = instance.findVisiteurByIdUser(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisiteurExistByIdUser method, of class VisiteurDAO.
     */
    @Test
    public void testIsVisiteurExistByIdUser() {
        System.out.println("isVisiteurExistByIdUser");
        int id_utilisateur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        boolean expResult = false;
        boolean result = instance.isVisiteurExistByIdUser(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findVisiteurById method, of class VisiteurDAO.
     */
    @Test
    public void testFindVisiteurById() {
        System.out.println("findVisiteurById");
        int id_visiteur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        Visiteurmedical expResult = null;
        Visiteurmedical result = instance.findVisiteurById(id_visiteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNomPrenomVisiteurByIdUtilisateur method, of class VisiteurDAO.
     */
    @Test
    public void testFindNomPrenomVisiteurByIdUtilisateur() {
        System.out.println("findNomPrenomVisiteurByIdUtilisateur");
        int id_utilisateur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        String expResult = "";
        String result = instance.findNomPrenomVisiteurByIdUtilisateur(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNomPrenomVisiteurByIdVisiteur method, of class VisiteurDAO.
     */
    @Test
    public void testFindNomPrenomVisiteurByIdVisiteur() {
        System.out.println("findNomPrenomVisiteurByIdVisiteur");
        int id_visiteur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        String expResult = "";
        String result = instance.findNomPrenomVisiteurByIdVisiteur(id_visiteur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addVisiteur method, of class VisiteurDAO.
     */
    @Test
    public void testAddVisiteur() {
        System.out.println("addVisiteur");
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String secteur = "";
        String labo = "";
        int id_utilisateur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        boolean expResult = false;
        boolean result = instance.addVisiteur(nom, prenom, adresse, ville, secteur, labo, id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editVisiteur method, of class VisiteurDAO.
     */
    @Test
    public void testEditVisiteur() {
        System.out.println("editVisiteur");
        int id_visiteur = 0;
        String nom = "";
        String prenom = "";
        String adresse = "";
        String ville = "";
        String secteur = "";
        String labo = "";
        int id_utilisateur = 0;
        VisiteurDAO instance = new VisiteurDAO();
        boolean expResult = false;
        boolean result = instance.editVisiteur(id_visiteur, nom, prenom, adresse, ville, secteur, labo, id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisiteurListByTable method, of class VisiteurDAO.
     */
    @Test
    public void testGetVisiteurListByTable() {
        System.out.println("getVisiteurListByTable");
        String myColumn = "";
        VisiteurDAO instance = new VisiteurDAO();
        ArrayList<Visiteurmedical> expResult = null;
        ArrayList<Visiteurmedical> result = instance.getVisiteurListByTable(myColumn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
