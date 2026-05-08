package com.code.Domains;


public class Employee {
    private Integer id;
    private String Fname;
    private String Lname;

    private Integer sal;

    private Integer year;

    public Employee(Integer id, String fname, String lname, Integer sal) {
        this.id = id;
        Fname = fname;
        Lname = lname;
        this.sal = sal;
    }

    public Employee(Integer id, String fname, String lname, Integer sal, Integer year) {
        this.id = id;
        Fname = fname;
        Lname = lname;
        this.sal = sal;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", sal=" + sal +
                ", year=" + year +
                '}';
    }
}
