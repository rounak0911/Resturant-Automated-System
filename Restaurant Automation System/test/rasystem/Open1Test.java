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
public class Open1Test {

    public Open1Test() {
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
     * Test of checkinput method, of class Open1.
     */
    @Test
    public void testCheckinput() {
       
    }

    /**
     * Test of main method, of class Open1.
     */
    @Test
    public void testMain() {
     
     int flag ;      
     Open1 x = new Open1();     
     
     x.setDetails("shm", "123456");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ; 
     
     x.setDetails("sh", "123456");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ;
     
     x.setDetails("shm", "1234");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ;
     
     x.setDetails("", "");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ;
     
     x.setDetails("shm", "");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ;
     
     x.setDetails("", "123");
     x.click();      
     flag = x.getflag() ; 
     assertEquals(1,flag) ;
    }

}
