/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SAHAN
 */
public class DBconnect {
    
    public static Connection connect(){
    
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/erp","root","");
        } 
        catch (Exception e) {
            
            System.out.println(e);
        }
        return con;
    }
    
}
