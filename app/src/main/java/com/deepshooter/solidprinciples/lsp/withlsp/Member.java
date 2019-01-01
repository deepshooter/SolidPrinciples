package com.deepshooter.solidprinciples.lsp.withlsp;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by avinashmishra on 28/12/18.
 */


public abstract class Member implements IDatabase,IBooking {

    String name;
    String memberType;
    Date startDate;
    Date endDate;

    public Member(String name) {
        this.name = name;
    }

    public static class LifeTimeMember extends Member {


        public LifeTimeMember(String name,Date mStartDate) {
            super(name);
            this.memberType = "LifeTime";
            this.startDate = mStartDate;

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.startDate);
            calendar.add(Calendar.YEAR,70);
            this.endDate = calendar.getTime();

        }

        @Override
        public void addToDatabase() {
            System.out.println("Added the LifeTime Member info to DB");
        }

        @Override
        public void MakeBooking() {

            System.out.println("Court is Booked for the LifeTime Member");
        }
    }


    public static class AnnualMember extends Member {


        public AnnualMember(String name,Date mStartDate) {
            super(name);

            this.memberType = "Annual";
            this.startDate = mStartDate;

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.startDate);
            calendar.add(Calendar.YEAR,1);
            this.endDate = calendar.getTime();



        }

        @Override
        public void addToDatabase() {
            System.out.println("Added the Annual Member info to DB");
        }

        @Override
        public void MakeBooking() {

            System.out.println("Court is Booked for the Annual Member");
        }
    }

    public static class Enquiry implements IDatabase {


        public Enquiry(String name) {

        }

        @Override
        public void addToDatabase() {
            System.out.println("Added the Enquiry info to DB");
        }

    }

}
