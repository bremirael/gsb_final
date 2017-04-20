/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
public class UtilisateurControllerIT {
    
    /**
     *
     */
    public UtilisateurControllerIT() {
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
     * Test of isValidUser method, of class UtilisateurController.
     */
    @Test
    public void testIsValidUser() {
        System.out.println("isValidUser");
        String login = "";
        String password = "";
        String email = "";
        int role = 0;
        UtilisateurController instance = new UtilisateurController();
        boolean expResult = false;
        boolean result = instance.isValidUser(login, password, email, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUserNoMdp method, of class UtilisateurController.
     */
    @Test
    public void testIsValidUserNoMdp() {
        System.out.println("isValidUserNoMdp");
        String login = "";
        String email = "";
        int role = 0;
        UtilisateurController instance = new UtilisateurController();
        boolean expResult = false;
        boolean result = instance.isValidUserNoMdp(login, email, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifEmail method, of class UtilisateurController.
     */
    @Test
    public void testVerifEmail() {
        System.out.println("verifEmail");
        String email = "";
        UtilisateurController instance = new UtilisateurController();
        boolean expResult = false;
        boolean result = instance.verifEmail(email);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showUserListInJTable method, of class UtilisateurController.
     */
    @Test
    public void testShowUserListInJTable() {
        System.out.println("showUserListInJTable");
        DefaultTableModel model = null;
        UtilisateurController instance = new UtilisateurController();
        instance.showUserListInJTable(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showUserListInJTableByTable method, of class UtilisateurController.
     */
    @Test
    public void testShowUserListInJTableByTable() {
        System.out.println("showUserListInJTableByTable");
        DefaultTableModel model = null;
        String maTable = "";
        UtilisateurController instance = new UtilisateurController();
        Object expResult = null;
        Object result = instance.showUserListInJTableByTable(model, maTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
