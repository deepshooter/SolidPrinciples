package com.deepshooter.solidprinciples.dip.withoutdip;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class BusinessLogicLayer {

    private DataAccessLayer DAL;

    public BusinessLogicLayer() {
        DAL = new DataAccessLayer();
    }

    public void Save(Object details){

        DAL.Save(details);
    }
}
