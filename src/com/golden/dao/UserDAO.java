package com.golden.dao;

import java.sql.*;

import com.golden.entities.User;
import com.golden.technique.MyConnexion;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Moussi
 */
public class UserDAO {
    private static UserDAO instanceDAOUser;
    private Statement stmt;
    List<User> l=new ArrayList<User>();
    
    private UserDAO() throws ClassNotFoundException, SQLException{
        stmt=MyConnexion.getInstance().getCn().createStatement();
               
    }
    public static UserDAO getInstance() throws ClassNotFoundException, SQLException{
        if(instanceDAOUser==null)
        instanceDAOUser=new UserDAO();
        return instanceDAOUser;
        
    }
    
    public List<User> getUsers() throws SQLException{
        ResultSet rs=stmt.executeQuery("select * from question");
        
        while(rs.next())
        {User u=new User
                (rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6));
        l.add(u);
            
        }
        return l;
    }
    
}
