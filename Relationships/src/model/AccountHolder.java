/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Administrator
 */
@Entity
public class AccountHolder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String name;
    @OneToOne
    Account a;

    public AccountHolder(String id, String name, Account a) {
        this.id = id;
        this.name = name;
        this.a = a;
    }
    
    public AccountHolder() {
    }

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   
    @Override
    public String toString() {
        return "model.AccountHolder[ id=" + id + " ]";
    }
    
}
