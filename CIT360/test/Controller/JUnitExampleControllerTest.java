/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.JUnitExampleModel;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Suckafish
 */
public class JUnitExampleControllerTest {
    
    public JUnitExampleControllerTest() {
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
     * Test of assertEqualsExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertEqualsExample() {
        System.out.println("assertEqualsExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter = 5;
        JUnitExampleController.assertEqualsExample(jUnitExample, setter);
        
        // the result is the same as the setter
        int result = jUnitExample.getAee(); 
        // change this to make the test fail
        int expResult = 5;                  
        
        assertEquals(expResult, result);
        System.out.println("\tTest Successful!");
        
    }

    /**
     * Test of assertArrayEqualsExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertArrayEqualsExample() {
        System.out.println("assertArrayEqualsExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int[] testArray = new int[2];
        int[] failArray = new int[3];
        testArray[0] = 5;
        testArray[1] = 3;
        failArray[0] = 1;
        failArray[1] = 2;
        failArray[2] = 3;
        
        JUnitExampleController.assertArrayEqualsExample(jUnitExample, testArray);
        
        // the result is the same as the setters
        int[] result = jUnitExample.getAaee(); 
        // change this to failArray make the test fail
        int[] expResult = testArray;
        
        assertArrayEquals(expResult, result);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertFalseExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertFalseExample() {
        System.out.println("assertFalseExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter = 6500;
        JUnitExampleController.assertFalseExample(jUnitExample, setter);
        
        // the result is the same as the setter
        int result = jUnitExample.getAfe(); 
        // change this to the same as the setter make the test fail
        int expResult = 1000;                  
        
        assertFalse(expResult == result);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertNotNullExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertNotNullExample() {
        System.out.println("assertNotNullExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter = 75;
        JUnitExampleController.assertNotNullExample(jUnitExample, setter);
        
        // the result is the same as the setter
        int result = jUnitExample.getAnne();           
        
        //Change the setter to null to make this fail
        assertNotNull(result);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertNotSameExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertNotSameExample() {
        System.out.println("assertNotSameExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter = 24;
        JUnitExampleController.assertNotSameExample(jUnitExample, setter);
        
        // the result is the same as the setter
        int result = jUnitExample.getAnse(); 
        // change this to the same as the setter make the test fail
        int notSameResult = 23;                  
        
        assertNotSame(notSameResult, result);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertNullExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertNullExample() {
        System.out.println("assertNullExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        String setter = null;
        JUnitExampleController.assertNullExample(jUnitExample, setter);
        
        // the result is the same as the setter
        String result = jUnitExample.getAne();
        
        // change the setter to equal something other than null to make the test fail
        assertNull(result);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertSameExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertSameExample() {
        System.out.println("assertSameExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter1 = 5;
        int setter2 = 5;
        JUnitExampleController.assertSameExample(jUnitExample, setter1, setter2);
        
        // the result is the same as the setter
        int result1 = jUnitExample.getAse1();
        int result2 = jUnitExample.getAse2();
        
        // change one of the setters to equal something else to make this fail
        assertSame(setter1, setter2);
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertThatExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertThatExample() {
        System.out.println("assertThatExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter1 = 3;
        int setter2 = 3;
        JUnitExampleController.assertThatExample(jUnitExample, setter1, setter2);
        
        // the result is the same as the setter
        int result1 = jUnitExample.getAte1();
        int result2 = jUnitExample.getAte2();
        
        // change one of the setters to something else to make this fail
        assertThat(result1, CoreMatchers.is(result2));
        System.out.println("\tTest Successful!");
    }

    /**
     * Test of assertTrueExample method, of class JUnitExampleController.
     */
    @Test
    public void testAssertTrueExample() {
        System.out.println("assertTrueExample");
        JUnitExampleModel jUnitExample = new JUnitExampleModel();
        int setter = 12;
        JUnitExampleController.assertTrueExample(jUnitExample, setter);
        
        // the result is the same as the setter
        int result = jUnitExample.getAssertTrue();
        // change this to something else to make this fail
        int expResult = 12;
        
        assertTrue(result == expResult);
        System.out.println("\tTest Successful!");
    }
    
}
