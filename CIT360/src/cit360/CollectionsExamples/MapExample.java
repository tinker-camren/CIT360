/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.CollectionsExamples;

import cit360.CIT360;
import java.util.*;

/**
 *
 * @author tinkerc
 * 
 * Description:
 * A map collection is used when you want to map a key to a value or list of 
 * values. This showcases a few examples of maps and how to use them. 
 * 
 * For example:
 * Mapping managers and employees. Each manager is a key, and that key is 
 * associated with a list of employees
 * OR
 * Mapping zip codes to cities
 * OR
 * Mapping a list of car models which are values, to a manufacturer, which is
 * a key. 
 */
public class MapExample {
    
    HashMap exampleMap = new HashMap<>();

    public HashMap getExampleMap() {
        return exampleMap;
    }

    public void setExampleMap(HashMap mapExample) {
        this.exampleMap = mapExample;
    }
    
    public void mapFunctions() {   
        /**
        * This example maps a list of employees to the key of their manager
        */   
        System.out.println("\nExecuting mapFunctions method...");
        
        //Initialize variables
        System.out.println("Initializing variables");
        HashMap hm = new HashMap<>();
        ArrayList roscoEmployees = new ArrayList<>();
        ArrayList deborahEmployees = new ArrayList<>();
        
        //Add to lists
        System.out.println("Adding employees to lists that will be mapped to"
                + " a key in the Map collection");
        deborahEmployees.add("John Doe");
        deborahEmployees.add("Sierra Richardson");
        roscoEmployees.add("Bill Rogers");
        roscoEmployees.add("Becky Klondike");
        roscoEmployees.add("Jane Doe");
        roscoEmployees.add("Kate Ewell");
        
        //Add to hashmap
        System.out.println("Putting lists into the map with the managers "
                + "as keys");
        hm.put("Rosco Williams", deborahEmployees);
        hm.put("Deborah Heart", roscoEmployees);
        
        // Utilize the entrySet function of map to create a Set variable called  
        // setOperation which contains all the keys and values of the map
        System.out.println("Creating a set out of the map to display the "
                + "elements of the map");
        Set<Map.Entry> setOperation = hm.entrySet();

        System.out.println("Creating an output stream for the contents of the"
                + " set that was created from the Map");
        setOperation.stream().map((Map.Entry me) -> {
            System.out.print("Employees for " + me.getKey() + ":");
            return me;
        }).forEachOrdered((me) -> {
            System.out.println(me.getValue());
        });
        
        // Get the variable stored in this class and put the data from this 
        // function into it 
        System.out.println("Setting the map created in this as an attribute"
                + "of the MapExample class so that the data exists outside"
                + "of this function");
        HashMap mapExample = CIT360.getMapExample().getExampleMap();
        mapExample.putAll(hm);
    }
}
