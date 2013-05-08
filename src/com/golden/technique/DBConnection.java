package com.golden.technique;

import java.sql.*;
/**
 *
 * @author Mohamed
 */
public class DBConnection {
    private String user="root";
    private String pass="" ;
    private String url="jdbc:mysql://localhost/thegoldenquestion" ;
    private String driver= "com.mysql.jdbc.Driver";
    private Connection cn;
    private static DBConnection instanceCn;
     
    private DBConnection() 
            throws ClassNotFoundException, SQLException{
        Class.forName(driver);
        cn=DriverManager.getConnection(url, user, pass);
            }
        public static DBConnection getInstance() 
                throws ClassNotFoundException, SQLException{
        if(instanceCn==null)
            instanceCn=new DBConnection();
        return instanceCn;
    }
    
    
    
      public Connection getCn() {
        return cn;
    }    
    
}