/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestao_livros;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author danielpires
 */
public class EncryptPass 
{
    /*public String encrypt(String password)
    {   
        String en_pass = null;
        
        try {
                
                MessageDigest md = MessageDigest.getInstance("MD5");
                
                md.update(password.getBytes());
                
                byte[] bytes = md.digest();
                
                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                     {
                        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                     }
                
                en_pass = sb.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
    
        return en_pass;
    }*/
    public String hashPassword(String plainTextPassword)
    {
        return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
    }
    
    
    public boolean checkPass(String plainPassword, String hashedPassword) 
    {
        if (BCrypt.checkpw(plainPassword, hashedPassword))
                return true;
        else
                return false;
    }
}