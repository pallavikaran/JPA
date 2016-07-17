package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Account;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2013-08-31T10:04:35")
@StaticMetamodel(Transactions.class)
public class Transactions_ { 

    public static volatile SingularAttribute<Transactions, String> id;
    public static volatile SingularAttribute<Transactions, Account> a;
    public static volatile SingularAttribute<Transactions, String> type;

}