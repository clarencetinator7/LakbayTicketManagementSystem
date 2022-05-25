/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilityClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author clare
 */
public class SQLBasic {
    
    // Connect database code
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public void sqlConnect()
    {
        
        try {
           String url1 = "jdbc:mysql://localhost:3306/ticket_demo";
           String user = "root";
           String password = "Cj06032002";
           
           con = DriverManager.getConnection(url1, user, password);
           if(con != null)
           {
               System.out.println("Connected to the database.");
           }
           
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
    
}
