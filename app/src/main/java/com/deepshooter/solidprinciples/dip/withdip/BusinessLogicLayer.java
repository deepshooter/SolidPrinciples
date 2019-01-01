package com.deepshooter.solidprinciples.dip.withdip;

/**
 * Created by avinashmishra on 28/12/18.
 */

public class BusinessLogicLayer {

    private IRepositoryLayer DAL;

    public BusinessLogicLayer(IRepositoryLayer repositoryLayer) {
        DAL = repositoryLayer;
    }

    public void Save(Object details){
        DAL.Save(details);
    }

}
