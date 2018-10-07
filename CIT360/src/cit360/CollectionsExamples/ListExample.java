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
 */
public class ListExample {
    List exampleList = new ArrayList<>();
    LinkedList lList = new LinkedList<>();
    
    //This is how you add to a list without a setter
    public static void addToList() {
        System.out.println("Executing addToList method...");
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Yellow");
        listStrings.add("Brown");
        listStrings.add("Blue");
        listStrings.add("Cyan");
        listStrings.add("Black");
        System.out.println("Created the listStrings List and added"
                + " the following elements:\n" + listStrings);
    }
    
    // This is an example of getting a variable from a class and adding
    // to it. The data is then preserved in that class and can be referenced
    // from another class. It can be done with many collection types and not
    // just lists.
    public List setListItems() {
        System.out.println("\nExecuting setListItems method...");
        List setList = CIT360.getListExample().getExampleList();
        setList.add("Purple");
        setList.add("Green");
        setList.add("Yellow");
        setList.add("Magenta");
        setList.add("Teal");
        //setListItems().add(setList);
        System.out.println("Created the ExampleList List at the beginning of"
                + " this instance and added the following elements:\n" + getExampleList());
        return setList;
    }
    
    // I can now manipulate the exampleList variable using other functions
    // within the same class, or outside of this class. 
    // This example is a simple sort operator that sorts alphabetically
    public List sortListItems() {
        System.out.println("\nExecuting sortListItems method...");
        List listItems = CIT360.getListExample().getExampleList();
        System.out.println("Sorting the list alphabetically...");
        Collections.sort(listItems);
        System.out.println("What the list looks like after it's sorted: \n"
                            + listItems);
        return listItems;
    }
   
    public List linkedList() {
        System.out.println("\nExecuting linkedList method...");
        // Getting the linked list
        LinkedList lList =  CIT360.getListExample().getlList();
        // Adding some more data
        lList.add("Object1");
        lList.add("Object2");
        lList.add("Object3");
        lList.add("Object4");
        System.out.println("Casted the exampleList List to a LinkedList"
                + " and added more data.\n"
                + "This is what the linked list looks like: " + lList);
        System.out.println("Here is what each index of the list contains: ");
        for (int i = 0; i < lList.size(); i++) {
            System.out.println("Index " + i + ": " + lList.get(i));
        }
        return lList;
    }

    public List getExampleList() {
        return exampleList;
    }

    public void setExampleList(List exampleList) {
        this.exampleList = exampleList;
    }

    public LinkedList getlList() {
        return lList;
    }

    public void setlList(LinkedList lList) {
        this.lList = lList;
    }
    

    
}
