package com.employeeMgmt.main.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long emp_id;

    @Column(nullable = false)
    private String emp_name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "emp_dept")
    private String department;

    public Employee() {
    }

    public Employee(String emp_name, String email, String department) {
        super();
        this.emp_name = emp_name;
        this.email = email;
        this.department = department;
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", email=" + email + ", department="
                + department + "]";

    }

}

