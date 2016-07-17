/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Account;
import model.Transactions;
import sun.dyn.MemberName;

/**
 *
 * @author Administrator
 */
public class OneToManyDemo {
    public static void main(String []args)
    {
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("RelationshipsPU");
        EntityManager mgr=emf.createEntityManager();
        
        mgr.getTransaction().begin();
        
        Account a1=new Account();
        a1.setId("a1");
        a1.setBalance(10000);
        mgr.persist(a1);
        Transactions t1=new Transactions();
        t1.setId("t1");
        t1.setType("Debit");
        t1.setA(a1);
        a1.getTr().add(t1);
        //mgr.persist(t1);
        
        Transactions t2=new Transactions();
        t2.setId("t2");
        t2.setType("Debit");
        t2.setA(a1);
        a1.getTr().add(t2);
        //mgr.persist(t2);
       //mgr.remove(a1);
        
        mgr.getTransaction().commit();
        mgr.close();
        
    }
}
