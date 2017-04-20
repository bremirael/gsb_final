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
public class UtilisateurIT {
    
    /**
     *
     */
    public UtilisateurIT() {
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
     * Test of getId_utilisateur method, of class Utilisateur.
     */
    @Test
    public void testGetId_utilisateur() {
        System.out.println("getId_utilisateur");
        Utilisateur instance = new Utilisateur();
        int expResult = 0;
        int result = instance.getId_utilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_utilisateur method, of class Utilisateur.
     */
    @Test
    public void testSetId_utilisateur() {
        System.out.println("setId_utilisateur");
        int id_utilisateur = 0;
        Utilisateur instance = new Utilisateur();
        instance.setId_utilisateur(id_utilisateur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Utilisateur.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Utilisateur.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Utilisateur instance = new Utilisateur();
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Utilisateur.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Utilisateur.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Utilisateur instance = new Utilisateur();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Utilisateur.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Utilisateur.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Utilisateur instance = new Utilisateur();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_role method, of class Utilisateur.
     */
    @Test
    public void testGetId_role() {
        System.out.println("getId_role");
        Utilisateur instance = new Utilisateur();
        int expResult = 0;
        int result = instance.getId_role();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_role method, of class Utilisateur.
     */
    @Test
    public void testSetId_role() {
        System.out.println("setId_role");
        int id_role = 0;
        Utilisateur instance = new Utilisateur();
        instance.setId_role(id_role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
