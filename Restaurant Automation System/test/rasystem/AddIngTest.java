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
public class AddIngTest {
    
    public AddIngTest() {
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
     * Test of getflag method, of class AddIng.
     */
    @Test
    public void testGetflag() {
        
    }

    /**
     * Test of click1 method, of class AddIng.
     */
    @Test
    public void testClick1() {
       
    }

    /**
     * Test of setDetails method, of class AddIng.
     */
    @Test
    public void testSetDetails() {
        
    }

    /**
     * Test of checkinput method, of class AddIng.
     */
    @Test
    public void testCheckinput() {
        
    }

    /**
     * Test of main method, of class AddIng.
     */
    @Test
    public void testMain() {
        
        int flag ; 
        AddIng x = new AddIng() ; 
        
        x.setDetails("1","Chicken","100","500") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
        x.setDetails("111","Chicken","100","500") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
        x.setDetails("","Chicken","100","500") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
        x.setDetails("","","100","500") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
        
        x.setDetails("","","100","") ; 
        x.click1();
        flag = x.getflag() ; 
        assertEquals(1,flag) ;
    }
    
}
