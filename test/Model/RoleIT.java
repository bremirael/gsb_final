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
public class RoleIT {
    
    /**
     *
     */
    public RoleIT() {
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
     * Test of getId_role method, of class Role.
     */
    @Test
    public void testGetId_role() {
        System.out.println("getId_role");
        Role instance = new Role();
        int expResult = 0;
        int result = instance.getId_role();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_role method, of class Role.
     */
    @Test
    public void testSetId_role() {
        System.out.println("setId_role");
        int id_role = 0;
        Role instance = new Role();
        instance.setId_role(id_role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom_role method, of class Role.
     */
    @Test
    public void testGetNom_role() {
        System.out.println("getNom_role");
        Role instance = new Role();
        String expResult = "";
        String result = instance.getNom_role();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom_role method, of class Role.
     */
    @Test
    public void testSetNom_role() {
        System.out.println("setNom_role");
        String nom_role = "";
        Role instance = new Role();
        instance.setNom_role(nom_role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
