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
