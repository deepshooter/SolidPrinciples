package com.deepshooter.solidprinciples.ocp.withoutocp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class Employee {

    public int id;
    public String name;
    public String employeeType;


    public Employee() {

    }

    public Employee(int id, String name, String employeeType) {
        this.id = id;
        this.name = name;
        this.employeeType = employeeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double calculateBonus(double salary) {

        if (this.employeeType.equalsIgnoreCase("Permanent"))
            return salary * .1;
        else
            return salary * .05;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
