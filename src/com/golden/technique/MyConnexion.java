package com.golden.technique;

import java.sql.*;
/**
 *
 * @author Mohamed
 */
public class MyConnexion {
    private String user="root";
    private String pass="" ;
    private String url="jdbc:mysql://localhost/thegoldenquestion" ;
    //"jdbc:oracle:thin:@//localhost/xe"
    private String driver= "com.mysql.jdbc.Driver";
    //"oracle.jdbc.driver.OracleDriver"
    private Connection cn;
    private static MyConnexion instanceCn;
     
    private MyConnexion() 
            throws ClassNotFoundException, SQLException{
        
        System.out.println("Chargement du Driever");
        Class.forName(driver);
        System.out.println("Driver chargé avec succès");
        cn=DriverManager.getConnection(url, user, pass);
        System.out.println("Connexion établie.");
            }
        public static MyConnexion getInstance() 
                throws ClassNotFoundException, SQLException{
        if(instanceCn==null)
            instanceCn=new MyConnexion();
        return instanceCn;
    }
    
    
    
      public Connection getCn() {
        return cn;
    }
    
    
}