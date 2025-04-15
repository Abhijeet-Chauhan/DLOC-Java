package com.dloc.entities;

import java.util.List;
import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int eid;
    private String ename;

    @ManyToMany
    @JoinTable(
        name = "emp_proj",
        joinColumns = @JoinColumn(name = "EMPID"),
        inverseJoinColumns = @JoinColumn(name = "PROID")
    )
    private List<Project> projects;

    // Getters and Setters
    public int getEid() { return eid; }
    public void setEid(int eid) { this.eid = eid; }

    public String getEname() { return ename; }
    public void setEname(String ename) { this.ename = ename; }

    public List<Project> getProjects() { return projects; }
    public void setProjects(List<Project> projects) { this.projects = projects; }
}
