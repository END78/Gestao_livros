/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao_livros;

import java.sql.*;



/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
 
       public boolean checkUsername(String username)
    {
        Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIBLIOTECA?verifyServerCertificate=false&useSSL=true","root","casadejogos");
                }
            catch (Exception ex) 
                {
                System.out.println(ex.getMessage());
                }
        boolean checkUser = false;
        String query =  "SELECT * FROM REQUERENTE WHERE EMAIL = '" + username + "'";
            try {
                 Statement ps;
                 ResultSet rs;
        
                 ps = con.createStatement();
            
            
                 rs = ps.executeQuery(query);
            
            if(rs.next())
            {
                checkUser = true;
            }
            else 
                checkUser = false;
                }
            catch (SQLException ex) 
            {
            System.out.print(ex);
            }
         return checkUser;
    }

    
}    