package com.dloc.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dloc.entities.Employee;
import com.dloc.entities.Project;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("com/dloc/config/hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee e1 = new Employee();
        e1.setEid(111);
        e1.setEname("Abhi");

        Employee e2 = new Employee();
        e2.setEid(222);
        e2.setEname("Karan");

        Project p1 = new Project();
        p1.setPid(123);
        p1.setPname("XYZ");

        Project p2 = new Project();
        p2.setPid(124);
        p2.setPname("ABC");

        Project p3 = new Project();
        p3.setPid(125);
        p3.setPname("LMN");

        List<Employee> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);

        List<Project> list2 = new ArrayList<>();
        list2.add(p1);
        list2.add(p2);
        list2.add(p3);

        e1.setProjects(list2);
        e2.setProjects(list2);
        p1.setEmployees(list1);

        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        session.save(p3);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("Inserted successfully");
        
        
    }
}
