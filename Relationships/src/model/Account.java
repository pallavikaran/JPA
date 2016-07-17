/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;
import javax.persistence.*;
/**
 *
 * @author Administrator
 */
@Entity

public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
   /*@OneToOne
    private AccountHolder ah;*/
    float balance;
   @OneToMany(cascade= CascadeType.ALL, fetch= FetchType.EAGER,mappedBy="a")
   @JoinTable(name="ThirdParty") 
   Set<Transactions> tr=new HashSet<Transactions>();

    public Account() {
    }

    public Account(String id, float balance, Set<Transactions> tr) {
        this.id = id;
        this.balance = balance;
        this.tr = tr;
    }

    /*public Account(String id, AccountHolder ah, float balance, Set<Transactions> tr) {
        this.id = id;
        this.ah = ah;
        this.balance = balance;
        this.tr = tr;
    }

    public Account(String id, AccountHolder ah, float balance) {
        this.id = id;
        this.ah = ah;
        this.balance = balance;
    }

   
    public AccountHolder getAh() {
        return ah;
    }

    public void setAh(AccountHolder ah) {
        this.ah = ah;
    }*/

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Set<Transactions> getTr() {
        return tr;
    }

    public void setTr(Set<Transactions> tr) {
        this.tr = tr;
    }

    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "model.Account[ id=" + id + " ]";
    }
    
}
