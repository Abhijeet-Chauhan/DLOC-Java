package com.dloc.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.user;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        user user1= new user();
        user1.setName("abhi");
        user1.setEmail("abc@mail.com");
        user1.setPassword("1234");
        user1.setGender("male");
        user1.setCity("mumbai");
        
        user user2= new user();
        user2.setName("add");
        user2.setEmail("abssc@mail.com");
        user2.setPassword("12e234");
        user2.setGender("female");
        user2.setCity("pune");
        
        Configuration cfg=new Configuration();
        cfg.configure("com/dloc/config/hibernate.cfg.xml");
        
        //create and manage session obj, heavy weight and thread safe
        SessionFactory sessionfactory = cfg.buildSessionFactory();
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        try {
        	session.save(user1);
        	session.save(user2);
        	transaction.commit();
        	System.out.println("user inserted");
        }catch(Exception e) {
        	transaction.rollback();
        	System.out.println("insertion failed");
        	e.printStackTrace();
        }
        
       try {
    	   user user=session.get(user.class,1);
           if(user!=null) {
           	System.out.println(user.getId());
           	System.out.println(user.getName());
           	System.out.println(user.getEmail());
           	System.out.println(user.getPassword());
           	System.out.println(user.getGender());
           	System.out.println(user.getCity());
           }
       }catch(Exception e) {
    	   e.printStackTrace();
       }
}
}