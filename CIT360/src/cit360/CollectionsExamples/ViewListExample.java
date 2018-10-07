/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.CollectionsExamples;

import cit360.CIT360;

/**
 *
 * @author tinkerc
 */
public class ViewListExample {
    public static void viewListExamples() {
        // Calls the addToList function to showcase how you add to a list 
        // collection without using getters and setters
        ListExample.addToList();

        //Creates a new object that contains the functions of the ListExample class
        ListExample setList = CIT360.getListExample(); 
        // This calls a function that showcases how you use a getter to add 
        // to a list variable and displays the results to the console
        setList.setListItems();
        
        //Showcases how you can sort a list
        setList.sortListItems();
        
        // Creates a linked list, adds to the list, and
        // shows what's located at each index of the list
        setList.linkedList();
    }
}
