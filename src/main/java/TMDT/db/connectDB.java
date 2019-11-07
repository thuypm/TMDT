/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TMDT.db;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author MINH THUY
 */

/**
 *
 * @author MINH THUY
 */

public class connectDB {
 private  Statement stmt ;
    public connectDB() {
          try {
      
  String dbURL = "jdbc:sqlserver://localhost;databaseName=tmdt;user=sa;password=kochodau";
    Connection conn  = DriverManager.getConnection(dbURL);
    if (conn != null) {
    System.out.println("Connected");
    this.stmt = conn.createStatement();
}
      
   }
  catch (SQLException ex) {
     System.err.println("Cannot connect database, " + ex);
    this.stmt = null;
   };
    
    }
    
   
   public Statement getConnect(){
        
    return this.stmt;
  }
//    public static void main(String[] args) {
//       Statement stmt = new connectDB().getConnect();
//       
//    }
 
}

