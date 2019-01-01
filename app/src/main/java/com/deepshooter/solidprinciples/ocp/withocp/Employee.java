package com.deepshooter.solidprinciples.ocp.withocp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public abstract class Employee {

    public int id;
    public String name;


    public Employee() {

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    public  abstract double calculateBonus(double salary) ;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
