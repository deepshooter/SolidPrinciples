package com.deepshooter.solidprinciples.srp.withoutsrp;

import com.deepshooter.solidprinciples.srp.User;

public class UserSettingService {

    public void changeEmail(User user) {

        if (checkAccess(user)) {
            //Grant option to change
        }
    }

    public boolean checkAccess(User user) {
        //Verify if the user is valid.
        return true;
    }
}