package com.dloc.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.student;

public class PaginationDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
    cfg.configure("com/dloc/config/hibernate.cfg.xml");

    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    
    Query<student> query = session.createQuery("from student");

    query.setFirstResult(3);  // Skip first 3 records
    query.setMaxResults(10);  // Get next 10 records

    List<student> students = query.list();
    for (student student : students) {
        System.out.println(student.getName());
    }
    session.close();
}
}
