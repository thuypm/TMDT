/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMDT.model;

import TMDT.DAO.userDAO;
import config.UserData;

/**
 *
 * @author MINH THUY
 */
public class userModel {
    
 public UserData getUser(String username)
    {
       return new userDAO().getUser(username);
     
    }
    public UserData checkUser(String username, String password)
    {
        UserData user = new userDAO().getUser(username);
        if(user == null)
            return null;
        else
            if((user.getPassword()).equals(password))
                return user;
            else 
            return  null;
    }
    public Boolean addUser(UserData  userForm)
            {
              int update = new userDAO().addUser(userForm);
              if(update == 0)
                       return false;
             else
                  return true;
                
            }
}
