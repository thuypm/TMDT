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
        UserData user = new userDAO().getUser(username);
        if(user == null)
            return null;
        else
            return user;
     
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
    public UserData addUser(UserData  userForm)
            {
                UserData user = new userDAO().addUser(userForm);
     return null;
                
            }
}
