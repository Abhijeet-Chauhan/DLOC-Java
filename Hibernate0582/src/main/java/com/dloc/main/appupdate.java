package com.dloc.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.user;

public class appupdate {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/dloc/config/hibernate.cfg.xml");
    
    SessionFactory sessionfactory = cfg.buildSessionFactory();
    Session session = sessionfactory.openSession();
    Transaction transaction = session.beginTransaction();
    
    try {
 	   user update=session.get(user.class,1);
 	   update.setCity("Banglore");
 	   session.saveOrUpdate(update);
 	   transaction.commit();
 	   System.out.println("user updated");
    }catch(Exception e) {
    	transaction.rollback();
 	   e.printStackTrace();
 	   System.out.println("failed");
    }
    
}
}
