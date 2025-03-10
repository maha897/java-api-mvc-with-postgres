package com.booleanuk.api;

public class Employee {
    private int id;
    private String name;
    private String jobName;
    private String salaryGrade;
    private String department;

    public Employee(int id, String name, String jobName, String salaryGrade, String department){
        this.id = id;
        this.name = name;
        this.jobName = jobName;
        this.salaryGrade = salaryGrade;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobName() {
        return jobName;
    }

    public String getSalaryGrade() {
        return salaryGrade;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(int id){
        this.id = id;
    }

    public String toString() {
        String str = "";
        str += id + " - ";
        str += name + " - ";
        str += jobName + " - ";
        str += salaryGrade + " - ";
        str += department;

        return str;
    }
}
