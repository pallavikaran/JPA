
package relationships;

import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Account;
import model.Transactions;

public class Test {
    public static void main(String []as)
    {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("RelationshipsPU");
        EntityManager mgr=emf.createEntityManager();
        
        mgr.getTransaction().begin();
        Account az=mgr.find(Account.class, "a1");
       Set<Transactions> tsz=az.getTr();
        
        for(Transactions temp:tsz)
        {
            System.out.println(""+temp.getType());
        }
        mgr.getTransaction().commit();
    }
}
