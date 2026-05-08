package com.code.Domains;

public class Department {

    private String id;
    private String deptName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department(String id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }
}
