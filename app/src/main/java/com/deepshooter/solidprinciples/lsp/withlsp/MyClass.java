package com.deepshooter.solidprinciples.lsp.withlsp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class MyClass {

    public static void main(String[] args){

        List<IDatabase> myList = new ArrayList<>();

        myList.add(new Member.LifeTimeMember("Avinash",new Date()));
        myList.add(new Member.AnnualMember("Nitin",new Date()));
        myList.add(new Member.Enquiry("Rahul"));

        for(IDatabase c : myList){
            c.addToDatabase();
        }

    }

}
