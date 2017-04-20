/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.security.SecureRandom;
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
public class BCryptIT {
    
    /**
     *
     */
    public BCryptIT() {
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
     * Test of crypt_raw method, of class BCrypt.
     */
    @Test
    public void testCrypt_raw() {
        System.out.println("crypt_raw");
        byte[] password = null;
        byte[] salt = null;
        int log_rounds = 0;
        int[] cdata = null;
        BCrypt instance = new BCrypt();
        byte[] expResult = null;
        byte[] result = instance.crypt_raw(password, salt, log_rounds, cdata);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashpw method, of class BCrypt.
     */
    @Test
    public void testHashpw() {
        System.out.println("hashpw");
        String password = "";
        String salt = "";
        String expResult = "";
        String result = BCrypt.hashpw(password, salt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gensalt method, of class BCrypt.
     */
    @Test
    public void testGensalt_int_SecureRandom() {
        System.out.println("gensalt");
        int log_rounds = 0;
        SecureRandom random = null;
        String expResult = "";
        String result = BCrypt.gensalt(log_rounds, random);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gensalt method, of class BCrypt.
     */
    @Test
    public void testGensalt_int() {
        System.out.println("gensalt");
        int log_rounds = 0;
        String expResult = "";
        String result = BCrypt.gensalt(log_rounds);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gensalt method, of class BCrypt.
     */
    @Test
    public void testGensalt_0args() {
        System.out.println("gensalt");
        String expResult = "";
        String result = BCrypt.gensalt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkpw method, of class BCrypt.
     */
    @Test
    public void testCheckpw() {
        System.out.println("checkpw");
        String plaintext = "";
        String hashed = "";
        boolean expResult = false;
        boolean result = BCrypt.checkpw(plaintext, hashed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
