/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Helpers.ExampleHelper;
import Hibernate.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author tinkerc
 */
@Named(value = "productController")
@SessionScoped
public class ProductController implements Serializable {
    int startID;
    int endID;
    DataModel productNames;
    ExampleHelper helper;
    private int recordCount = 1000000;
    private int pageSize = 10;
    
    private Product current;
    private int selectedItemIndex;

    /**
     * Creates a new instance of ProductController
     */
    public ProductController() {
        helper = new ExampleHelper();
        startID = 940000;
        endID = 990000;
    }
    
    public ProductController(int startID, int endID) {
        helper = new ExampleHelper();
        this.startID = startID;
        this.endID = endID;
    }
    
    public Product getSelected() {
        if (current == null) {
            current = new Product();
            selectedItemIndex = -1;
        }
        return current;
    }
    
    public DataModel getProductNames() {
        if (productNames == null) {
            productNames = new ListDataModel(helper.getProductNames(startID, endID));
        }
        return productNames;
    }
    
    void recreateModel() {
        productNames = null;
    }
    
    
     public boolean isHasNextPage() {
        if (endID + pageSize <= recordCount) {
            return true;
        }
        return false;
    }

    public boolean isHasPreviousPage() {
        if (startID-pageSize > 0) {
            return true;
        }
        return false;
    }

    public String next() {
        startID = endID+1;
        endID = endID + pageSize;
        recreateModel();
        return "index";
    }

    public String previous() {
        startID = startID - pageSize;
        endID = endID - pageSize;
        recreateModel();
        return "index";
    }

    public int getPageSize() {
        return pageSize;
    }

    public String prepareView(){
        current = (Product) getProductNames().getRowData();
        return "browse";
    }
    public String prepareList(){
        recreateModel();
        return "index";
    }
    
}
