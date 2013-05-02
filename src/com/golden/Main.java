package com.golden;

import java.sql.SQLException;

import com.golden.dao.UserDAO;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
//      Acceuil a=new Acceuil();
//      a.show();
      System.out.println(UserDAO.getInstance().getUsers());

  }



}
