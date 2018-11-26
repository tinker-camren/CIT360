/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Hibernate.NewHibernateUtil;
import Hibernate.Product;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author tinkerc
 */
public class ExampleHelper {
    Session session = null;
    
    public ExampleHelper() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List getProductNames(int startID, int endID) {
    List<Product> productList = null;
    try {
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Product as product");
        productList = (List<Product>) q.list();
        System.out.println(productList);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return productList;
    }

}
