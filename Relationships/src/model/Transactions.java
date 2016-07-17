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

public class Transactions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String type;
    @ManyToOne
    Account a;

    public Transactions() {
    }

    public Transactions(String id, String type, Account a) {
        this.id = id;
        this.type = type;
        this.a = a;
    }

    public Account getA() {
        return a;
    }

    public void setA(Account a) {
        this.a = a;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    @Override
    public String toString() {
        return "model.Transaction[ id=" + id + " ]";
    }
    
}
