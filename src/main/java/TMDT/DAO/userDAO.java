/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMDT.DAO;

/**
 *
 * @author MINH THUY
 */
import TMDT.db.connectDB;
import java.sql.Statement;
import java.sql.ResultSet;
import config.UserData;

/**
 *
 * @author MINH THUY
 */

public class userDAO {
    
        connectDB conn = new connectDB();
        Statement stmt = conn.getConnect();
       UserData user = new UserData();
      public UserData getUser(String username)
      {
         
          try{
              ResultSet rs  = stmt.executeQuery("SELECT * FROM [user] WHERE (username = '" + username +"')"  );
              if(rs.next())
              {
                  user.setUserID(rs.getString("userID"));
                   user.setUsername(rs.getString("username").replaceAll(" ", ""));
                   user.setPassword(rs.getString("password").replaceAll(" ", ""));
                   user.setAdmin(rs.getBoolean("admin"));
                   user.setAdress(rs.getString("adress"));
              }
              else
                  user = null;
                  }
             catch(Exception e){
                 System.out.println(e);
                 
             };
             System.out.println(user.getUsername());
             return user;
               
};
      public UserData addUser( UserData userForm)
      {
          try{
              ResultSet rs  = stmt.executeQuery("INSERT INTO user ( )");
              if(rs.next())
              {
                  user.setUserID(rs.getString("userID"));
                   user.setUsername(rs.getString("username").replaceAll(" ", ""));
                   user.setPassword(rs.getString("password").replaceAll(" ", ""));
                   user.setAdmin(rs.getBoolean("admin"));
                   user.setAdress(rs.getString("adress"));
              }
              else
                  user = null;
                  }
             catch(Exception e){
                 System.out.println(e);
                 
             };
             return user;
      }
 
}

