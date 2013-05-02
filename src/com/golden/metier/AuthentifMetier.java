package com.golden.metier;

import com.golden.dao.UserDAO;
import com.golden.entities.User;
import java.sql.SQLException;
import java.util.Iterator;

/**
 *
 * @author Mohamed
 */
public class AuthentifMetier {
private boolean access;

    public boolean verifyAccess(String id,String question,String reponseV,String reponseF1,String reponseF2,String reponseF3) throws ClassNotFoundException, SQLException
            {

       Iterator<User> it=UserDAO.getInstance().
               getUsers().iterator();
        while(it.hasNext())
        {
             User user=it.next();
             if(user.getId().equals(id)
            	&&user.getQuestion().equals(question)
            	&&user.getReponseV().equals(reponseV)
            	&&user.getReponseF1().equals(reponseF1)
            	&&user.getReponseF2().equals(reponseF2)
                &&user.getReponseF3().equals(reponseF3))
                access=true;
                }



        return access;
    }
}
