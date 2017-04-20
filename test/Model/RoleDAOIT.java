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
public class RoleDAOIT {
    
    /**
     *
     */
    public RoleDAOIT() {
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
     * Test of countAllRole method, of class RoleDAO.
     */
    @Test
    public void testCountAllRole() {
        System.out.println("countAllRole");
        RoleDAO instance = new RoleDAO();
        int expResult = 0;
        int result = instance.countAllRole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findNomRoleById method, of class RoleDAO.
     */
    @Test
    public void testFindNomRoleById() {
        System.out.println("findNomRoleById");
        int id_role = 0;
        RoleDAO instance = new RoleDAO();
        String expResult = "";
        String result = instance.findNomRoleById(id_role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findIdRoleByNom method, of class RoleDAO.
     */
    @Test
    public void testFindIdRoleByNom() {
        System.out.println("findIdRoleByNom");
        String nom_role = "";
        RoleDAO instance = new RoleDAO();
        int expResult = 0;
        int result = instance.findIdRoleByNom(nom_role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
