package com.deepshooter.solidprinciples.ocp.withocp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class PermanentEmployee extends Employee {

    public PermanentEmployee() {
    }

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public double calculateBonus(double salary) {
        return salary * .1;
    }

}
