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
public class UtilisateurDAOIT {
    
    /**
     *
     */
    public UtilisateurDAOIT() {
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
     * Test of getIdUtilisateurByLogin method, of class UtilisateurDAO.
     */
    @Test
    public void testGetIdUtilisateurByLogin() {
        System.out.println("getIdUtilisateurByLogin");
        String login = "";
        UtilisateurDAO instance = new UtilisateurDAO();
        int expResult = 0;
        int result = instance.getIdUtilisateurByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdmin method, of class UtilisateurDAO.
     */
    @Test
    public void testIsAdmin() {
        System.out.println("isAdmin");
        int id_utilisateur = 0;
        UtilisateurDAO instance = new UtilisateurDAO();
        int expResult = 0;
        int result = instance.isAdmin(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLoginValid method, of class UtilisateurDAO.
     */
    @Test
    public void testIsLoginValid() {
        System.out.println("isLoginValid");
        String monlogin = "";
        UtilisateurDAO instance = new UtilisateurDAO();
        boolean expResult = false;
        boolean result = instance.isLoginValid(monlogin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserById method, of class UtilisateurDAO.
     */
    @Test
    public void testGetUserById() {
        System.out.println("getUserById");
        int id_utilisateur = 0;
        UtilisateurDAO instance = new UtilisateurDAO();
        Utilisateur expResult = null;
        Utilisateur result = instance.getUserById(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserExistById method, of class UtilisateurDAO.
     */
    @Test
    public void testIsUserExistById() {
        System.out.println("isUserExistById");
        int id_utilisateur = 0;
        UtilisateurDAO instance = new UtilisateurDAO();
        boolean expResult = false;
        boolean result = instance.isUserExistById(id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserByLogin method, of class UtilisateurDAO.
     */
    @Test
    public void testGetUserByLogin() {
        System.out.println("getUserByLogin");
        String login = "";
        UtilisateurDAO instance = new UtilisateurDAO();
        Utilisateur expResult = null;
        Utilisateur result = instance.getUserByLogin(login);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserById method, of class UtilisateurDAO.
     */
    @Test
    public void testDeleteUserById() {
        System.out.println("deleteUserById");
        int id_utilisateur = 0;
        UtilisateurDAO instance = new UtilisateurDAO();
        instance.deleteUserById(id_utilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserListByTable method, of class UtilisateurDAO.
     */
    @Test
    public void testGetUserListByTable() {
        System.out.println("getUserListByTable");
        String maTable = "";
        UtilisateurDAO instance = new UtilisateurDAO();
        ArrayList<Utilisateur> expResult = null;
        ArrayList<Utilisateur> result = instance.getUserListByTable(maTable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class UtilisateurDAO.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        UtilisateurDAO instance = new UtilisateurDAO();
        ArrayList<Utilisateur> expResult = null;
        ArrayList<Utilisateur> result = instance.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UtilisateurDAO.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        String login = "";
        String password = "";
        String email = "";
        String role = "";
        UtilisateurDAO instance = new UtilisateurDAO();
        boolean expResult = false;
        boolean result = instance.addUser(login, password, email, role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editUser method, of class UtilisateurDAO.
     */
    @Test
    public void testEditUser() {
        System.out.println("editUser");
        String login = "";
        String password = "";
        String email = "";
        String role = "";
        int id_utilisateur = 0;
        UtilisateurDAO instance = new UtilisateurDAO();
        boolean expResult = false;
        boolean result = instance.editUser(login, password, email, role, id_utilisateur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
