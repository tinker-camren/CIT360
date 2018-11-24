/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.JUnitExampleModel;
import java.lang.reflect.Array;

/**
 *
 * @author tinkerc
 */
public class JUnitExampleController {
    public static void assertEqualsExample(JUnitExampleModel jUnitExample, int setter) {
        jUnitExample.setAee(setter);
    }
    
    public static void assertArrayEqualsExample(JUnitExampleModel jUnitExample, int[] testArray ) {
        jUnitExample.setAaee(testArray);
    }
    
    public static void assertFalseExample(JUnitExampleModel jUnitExample, int setter) {
        jUnitExample.setAfe(setter);
    }
    
    public static void assertNotNullExample(JUnitExampleModel jUnitExample, int setter) {
        jUnitExample.setAnne(setter);
    }
    
    public static void assertNotSameExample(JUnitExampleModel jUnitExample, int setter) {
        jUnitExample.setAnse(setter);
    }
    
    public static void assertNullExample(JUnitExampleModel jUnitExample, String setter) {
        jUnitExample.setAne(setter);
    }
    
    public static void assertSameExample(JUnitExampleModel jUnitExample, int setter1, int setter2) {
        jUnitExample.setAse1(setter1);
        jUnitExample.setAse2(setter2);
    }
    
    public static void assertThatExample(JUnitExampleModel jUnitExample, int setter1, int setter2) {
        jUnitExample.setAse1(setter1);
        jUnitExample.setAse2(setter2);
    }
    
    public static void assertTrueExample(JUnitExampleModel jUnitExample, int setter) {
        jUnitExample.setAssertTrue(setter);
    }
}
