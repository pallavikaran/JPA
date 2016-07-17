package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Transactions;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-08-31T10:04:35")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> id;
    public static volatile SingularAttribute<Account, Float> balance;
    public static volatile SetAttribute<Account, Transactions> tr;

}