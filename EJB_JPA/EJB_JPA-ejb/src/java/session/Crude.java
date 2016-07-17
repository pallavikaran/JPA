/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import model.Book123;
import javax.persistence.PersistenceContext;
/**
 *
 * @author Administrator
 */
@Stateless

public class Crude implements Business{
@PersistenceContext(unitName="EJB_JPA-ejbPU")
EntityManager mgr;
    @Override
    public Book123 create(String name, int price) 
    {
        Book123 java=new Book123();
        java.setName(name);
        java.setPrice(price);
        mgr.persist(java);
        return java;
    }
}