/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import cit360.CIT360;
import Model.MapExample;

/**
 *
 * @author tinkerc
 */
public class ViewMapExample {
    public static void viewMapExamples() {
        MapExample mapExample = CIT360.getMapExample(); 
        
        mapExample.mapFunctions();
        String testKey = "Deborah Heart";
        System.out.println(mapExample.getExampleMap().get(testKey));
    }
}
