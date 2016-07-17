/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import model.Book123;

/**
 *
 * @author Administrator
 */
public interface Business {
    public Book123 create(String name,int price);
}
