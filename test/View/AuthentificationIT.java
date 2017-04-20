/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
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
public class AuthentificationIT {
    
    /**
     *
     */
    public AuthentificationIT() {
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
     * Test of main method, of class Authentification.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Authentification.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAjoutUtilisateurBTN method, of class Authentification.
     */
    @Test
    public void testGetAjoutUtilisateurBTN() {
        System.out.println("getAjoutUtilisateurBTN");
        Authentification instance = new Authentification();
        JButton expResult = null;
        JButton result = instance.getAjoutUtilisateurBTN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAjoutUtilisateurBTN method, of class Authentification.
     */
    @Test
    public void testSetAjoutUtilisateurBTN() {
        System.out.println("setAjoutUtilisateurBTN");
        JButton AjoutUtilisateurBTN = null;
        Authentification instance = new Authentification();
        instance.setAjoutUtilisateurBTN(AjoutUtilisateurBTN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class Authentification.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        Authentification instance = new Authentification();
        JButton expResult = null;
        JButton result = instance.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserList method, of class Authentification.
     */
    @Test
    public void testSetUserList() {
        System.out.println("setUserList");
        JButton UserList = null;
        Authentification instance = new Authentification();
        instance.setUserList(UserList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnexionBTN method, of class Authentification.
     */
    @Test
    public void testGetConnexionBTN() {
        System.out.println("getConnexionBTN");
        Authentification instance = new Authentification();
        JButton expResult = null;
        JButton result = instance.getConnexionBTN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnexionBTN method, of class Authentification.
     */
    @Test
    public void testSetConnexionBTN() {
        System.out.println("setConnexionBTN");
        JButton connexionBTN = null;
        Authentification instance = new Authentification();
        instance.setConnexionBTN(connexionBTN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelAuthentification method, of class Authentification.
     */
    @Test
    public void testGetLabelAuthentification() {
        System.out.println("getLabelAuthentification");
        Authentification instance = new Authentification();
        JLabel expResult = null;
        JLabel result = instance.getLabelAuthentification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelAuthentification method, of class Authentification.
     */
    @Test
    public void testSetLabelAuthentification() {
        System.out.println("setLabelAuthentification");
        JLabel labelAuthentification = null;
        Authentification instance = new Authentification();
        instance.setLabelAuthentification(labelAuthentification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelLogin method, of class Authentification.
     */
    @Test
    public void testGetLabelLogin() {
        System.out.println("getLabelLogin");
        Authentification instance = new Authentification();
        JLabel expResult = null;
        JLabel result = instance.getLabelLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelLogin method, of class Authentification.
     */
    @Test
    public void testSetLabelLogin() {
        System.out.println("setLabelLogin");
        JLabel labelLogin = null;
        Authentification instance = new Authentification();
        instance.setLabelLogin(labelLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabelPassword method, of class Authentification.
     */
    @Test
    public void testGetLabelPassword() {
        System.out.println("getLabelPassword");
        Authentification instance = new Authentification();
        JLabel expResult = null;
        JLabel result = instance.getLabelPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelPassword method, of class Authentification.
     */
    @Test
    public void testSetLabelPassword() {
        System.out.println("setLabelPassword");
        JLabel labelPassword = null;
        Authentification instance = new Authentification();
        instance.setLabelPassword(labelPassword);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Authentification.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Authentification instance = new Authentification();
        JTextField expResult = null;
        JTextField result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sModifUtilisateurBTNetLogin method, of class Authentification.
     */
    @Test
    public void testSModifUtilisateurBTNetLogin() {
        System.out.println("sModifUtilisateurBTNetLogin");
        JTextField login = null;
        Authentification instance = new Authentification();
        instance.sModifUtilisateurBTNetLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Authentification.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Authentification instance = new Authentification();
        JTextField expResult = null;
        JTextField result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Authentification.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        JTextField password = null;
        Authentification instance = new Authentification();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModifUtilisateurBTN method, of class Authentification.
     */
    @Test
    public void testGetModifUtilisateurBTN() {
        System.out.println("getModifUtilisateurBTN");
        Authentification instance = new Authentification();
        JButton expResult = null;
        JButton result = instance.getModifUtilisateurBTN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModifUtilisateurBTN method, of class Authentification.
     */
    @Test
    public void testSetModifUtilisateurBTN() {
        System.out.println("setModifUtilisateurBTN");
        JButton ModifUtilisateurBTN = null;
        Authentification instance = new Authentification();
        instance.setModifUtilisateurBTN(ModifUtilisateurBTN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
