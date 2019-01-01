package com.deepshooter.solidprinciples.srp.withsrp;

import com.deepshooter.solidprinciples.srp.User;

public class UserSettingService
{
  public void changeEmail(User user)
  {
    if(SecurityService.checkAccess(user))
    {
       //Grant option to change
    }
  }
}