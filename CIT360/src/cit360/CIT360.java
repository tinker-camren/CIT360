/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

import cit360.CollectionsExamples.ListExample;
import cit360.CollectionsExamples.MapExample;
import cit360.CollectionsExamples.QueueExample;
import cit360.CollectionsExamples.ViewListExample;
import cit360.CollectionsExamples.ViewMapExample;

/**
 *
 * @author tinkerc
 */
public class CIT360 {

    static ListExample listExample = new ListExample();
    static MapExample mapExample = new MapExample();
    static QueueExample queueExample = new QueueExample();

    public static ListExample getListExample() {
        return listExample;
    }

    public void setListExample(ListExample listExample) {
        this.listExample = listExample;
    }

    public static MapExample getMapExample() {
        return mapExample;
    }

    public void setMapExample(MapExample mapExample) {
        this.mapExample = mapExample;
    }

    public static QueueExample getQueueExample() {
        return queueExample;
    }

    public void setQueueExample(QueueExample queueExample) {
        this.queueExample = queueExample;
    }
    
    public static void main(String[] args) {
        
        //List collections examples        
        ViewListExample.viewListExamples();
        ViewMapExample.viewMapExamples();
    }
    
}
