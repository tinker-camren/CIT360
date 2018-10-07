/*
 * 
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
 * NOTE: This isn't being used at the moment
 */
public class DataStorage {
    ListExample listExample = new ListExample();
    MapExample mapExample = new MapExample();
    QueueExample queueExample = new QueueExample();
    
    public void newTest() {
        //List collections examples
        ViewListExample.viewListExamples();
        ViewMapExample.viewMapExamples();
    }
    
    public ListExample getListExample() {
        return listExample;
    }

    public void setListExample(ListExample listExample) {
        this.listExample = listExample;
    }

    public MapExample getMapExample() {
        return mapExample;
    }

    public void setMapExample(MapExample mapExample) {
        this.mapExample = mapExample;
    }

    public QueueExample getQueueExample() {
        return queueExample;
    }

    public void setQueueExample(QueueExample queueExample) {
        this.queueExample = queueExample;
    }
    
    
}
