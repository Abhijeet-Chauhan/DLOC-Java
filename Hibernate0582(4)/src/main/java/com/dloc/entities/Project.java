package com.dloc.entities;

import java.util.List;
import javax.persistence.*;

@Entity
public class Project {
    @Id
    private int pid;
    private String pname;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    // Getters and Setters
    public int getPid() { return pid; }
    public void setPid(int pid) { this.pid = pid; }

    public String getPname() { return pname; }
    public void setPname(String pname) { this.pname = pname; }

    public List<Employee> getEmployees() { return employees; }
    public void setEmployees(List<Employee> employees) { this.employees = employees; }
}
