package com.deepshooter.solidprinciples.ocp.withoutocp;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class Program {

    public static void main(String[] args){

        Employee empJohn = new Employee(1,"John","Permanent");
        Employee empJason = new Employee(2,"Jason","Temp");



        System.out.println("Employee : "+empJohn.toString() +"  Bonus : "+empJohn.calculateBonus(100000));
        System.out.println("Employee : "+empJason.toString() +"  Bonus : "+empJason.calculateBonus(100000));

    }
}
