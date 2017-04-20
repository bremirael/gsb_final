/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
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
public class UtilisateurListIT {
    
    /**
     *
     */
    public UtilisateurListIT() {
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
     * Test of main method, of class UtilisateurList.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UtilisateurList.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserBox method, of class UtilisateurList.
     */
    @Test
    public void testGetUserBox() {
        System.out.println("getUserBox");
        UtilisateurList instance = new UtilisateurList();
        JComboBox<String> expResult = null;
        JComboBox<String> result = instance.getUserBox();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserBox method, of class UtilisateurList.
     */
    @Test
    public void testSetUserBox() {
        System.out.println("setUserBox");
        JComboBox<String> UserBox = null;
        UtilisateurList instance = new UtilisateurList();
        instance.setUserBox(UserBox);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRecherche method, of class UtilisateurList.
     */
    @Test
    public void testGetRecherche() {
        System.out.println("getRecherche");
        UtilisateurList instance = new UtilisateurList();
        JTextField expResult = null;
        JTextField result = instance.getRecherche();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRecherche method, of class UtilisateurList.
     */
    @Test
    public void testSetRecherche() {
        System.out.println("setRecherche");
        JTextField recherche = null;
        UtilisateurList instance = new UtilisateurList();
        instance.setRecherche(recherche);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisiTable method, of class UtilisateurList.
     */
    @Test
    public void testGetVisiTable() {
        System.out.println("getVisiTable");
        UtilisateurList instance = new UtilisateurList();
        JTable expResult = null;
        JTable result = instance.getVisiTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisiTable method, of class UtilisateurList.
     */
    @Test
    public void testSetVisiTable() {
        System.out.println("setVisiTable");
        JTable visiTable = null;
        UtilisateurList instance = new UtilisateurList();
        instance.setVisiTable(visiTable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
