/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author passpass
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Controller.BCryptIT.class, Controller.ComposeControllerIT.class, Controller.EchantillonControllerIT.class, Controller.RapportControllerIT.class, Controller.VisiteurControllerIT.class, Controller.PraticienControllerIT.class, Controller.MedicamentControllerIT.class, Controller.UtilisateurControllerIT.class, Controller.RoleControllerIT.class, Controller.MysqlConnectionIT.class})
public class ControllerITSuite {

    /**
     *
     * @throws Exception
     */
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     *
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
    }
    
}
