package com.goconsult.service;

import java.util.regex.Pattern;

public class EmailHelper {
    public static boolean isValidEmailAndPresentInDb(String email) {
       if(isValidEmail(email)){
          return DbHelper.emailPresentInDb(email);
       }
       return false;
    }
    public static boolean isValidEmail(String email){
       return Pattern.compile("^(.+)@(\\S+)$")
                .matcher(email)
                .matches();
    }
}
