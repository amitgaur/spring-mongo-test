package com.amitgaur.sample.app.util;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/17/13
 * Time: 9:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class PasswordUtil {


    public static String generatePassword(String password) {
        return BCrypt.hashpw(password,BCrypt.gensalt());

    }
    public boolean validate(String password, String hashed) {
        return BCrypt.checkpw(password, hashed)                  ;
    }
}
