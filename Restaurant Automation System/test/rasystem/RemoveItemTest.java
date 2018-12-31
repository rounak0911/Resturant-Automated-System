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
public class RemoveItemTest {
    
    public RemoveItemTest() {
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
     * Test of getflag method, of class RemoveItem.
     */
    @Test
    public void testGetflag() {
        
    }

    /**
     * Test of click1 method, of class RemoveItem.
     */
    @Test
    public void testClick1() {
        
    }

    /**
     * Test of setDetails method, of class RemoveItem.
     */
    @Test
    public void testSetDetails() {
        
    }

    /**
     * Test of main method, of class RemoveItem.
     */
    @Test
    public void testMain() {
        
        int flag ; 
        RemoveItem x = new RemoveItem() ; 
        
        x.setDetails("90") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
        x.setDetails("10") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
    }
    
}
