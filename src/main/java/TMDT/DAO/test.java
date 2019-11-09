/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMDT.DAO;

import TMDT.db.connectDB;
import config.UserData;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MINH THUY
 */
public class test {
     connectDB conn = new connectDB();
     Statement stmt = conn.getConnect();
     public void lol()
     {
           try{
               ResultSet rs  = stmt.executeQuery("SELECT * FROM [user] WHERE (username = 'thuypm')"  );
                if(rs.next())
                    System.out.println(rs.getString("username"));
           }catch(Exception e)
           {
               System.out.println(e);
           }
         
     }
       public static void main(String[] args) {
         new test().lol();
    }
}
