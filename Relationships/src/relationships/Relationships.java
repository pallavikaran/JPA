
package relationships;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Account;
import model.AccountHolder;

public class Relationships {
   public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("RelationshipsPU");
        EntityManager mgr=emf.createEntityManager();
        
        mgr.getTransaction().begin();
        Account ac=new Account();
        ac.setId("a1");
        ac.setBalance(10000);
        
        AccountHolder holder=new AccountHolder();
        holder.setId("h1");
        holder.setName("Anil");
        holder.setA(ac);
        
        ac.setAh(holder);
        
        mgr.persist(ac);
        mgr.persist(holder);
        
        AccountHolder h1=mgr.find(AccountHolder.class, "h1");
        Account a1=h1.getA();
        System.out.println("Balance is="+a1.getBalance());
        
        Account a2=mgr.find(Account.class, "a1");
        AccountHolder h2=a2.getAh();
        System.out.println(""+h2.getName());
     
        mgr.getTransaction().commit();
       
    }
}
