package com.deepshooter.solidprinciples.ocp.withocp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class Program {

    public static void main(String[] args){

        Employee empJohn = new PermanentEmployee(1,"John");
        Employee empJason = new TemporaryEmployee(2,"Jason");

        System.out.println("Employee : "+empJohn.toString() +"  Bonus : "+empJohn.calculateBonus(100000));
        System.out.println("Employee : "+empJason.toString() +"  Bonus : "+empJason.calculateBonus(150000));

    }
}
