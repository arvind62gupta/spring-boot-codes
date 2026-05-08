package com.code.Domains;

public class User1 {

    private int id;
    private String name;
    private String department;

    public User1(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
