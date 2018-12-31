/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rasystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class InventoryTest {
    
    public InventoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getflag method, of class Inventory.
     */
    @Test
    public void testGetflag() {
        
    }

    /**
     * Test of click1 method, of class Inventory.
     */
    @Test
    public void testClick1() {        
    }

    /**
     * Test of main method, of class Inventory.
     */
    @Test
    public void testMain() {
        
        int flag;
        Inventory x = new Inventory();
        
        x.setDetails("stock0") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ; 
        
        x.setDetails("VendorOrder") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ; 
    }
    
}
