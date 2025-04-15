package com.dloc.main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.employee;

public class App 
{
    public static void main( String[] args )
    {
        
        Configuration cfg=new Configuration();
        cfg.configure("com/dloc/config/hibernate.cfg.xml");
        
        //create and manage session obj, heavy weight and thread safe
        SessionFactory sessionfactory = cfg.buildSessionFactory();
        Session session = sessionfactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        employee emp1=new employee();
        emp1.setEno(111);
        emp1.setEname("abhi");
        emp1.setEsal(87979);
        emp1.setEaddr("mumbai");
        
//        employee emp2=new employee();
//        emp2.setEno(222);
//        emp2.setEname("abc");
//        emp2.setEsal(86000);
//        emp2.setEaddr("pune");
        employee emp_key = new employee();
		emp_key.setEno(111);
		emp_key.setEname("abhi");
		employee emp = session.get(employee.class, emp_key);
		
		if(emp!=null) {
			System.out.println("Employee Details");
			System.out.println("----------------");
			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getEsal());
			System.out.println(emp.getEaddr());
		} else {
			System.out.println("Employee not found.");

        session.save(emp1);
//        session.save(emp2);
        
        transaction.commit();
        System.out.println("employee inserted");
       
		
		}
		
    }}