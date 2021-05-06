package com.abhishek.doubtoverflow.Util;

import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    static public String passwordOutput(int res){
        switch (res){
            case 1 :
                return ("Password length should be"
                        + " between 8 to 15 characters");

            case 2 :
                return ("Password should not"
                        + " contain any space");

            case 3 :
                return ("Password should contain"
                        + " at least one digit(0-9)");

            case 4 :
                return ("Password should contain at "
                        + "least one special character");

            case 5 :
                return ("Password should contain at"
                        + " least one uppercase letter(A-Z)");

            case 6 :
                return ("Password should contain at"
                        + " least one lowercase letter(a-z)");

        }
        return "";
    }
    //Source -> GFG
    static public int isValidPassword(String password){
        if (!((password.length() >= 8)
                && (password.length() <= 15))) {
            return 1;
        }

        // to check space
        if (password.contains(" ")) {
            return 2;
        }

        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return 3;
            }
        }

        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return 4;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return 5;
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 90; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return 6;
            }
        }
        return 0;
    }

    static public boolean checkEditText(EditText editText){
        if(editText.getText().toString().isEmpty()){
            editText.setError("Can't Be Empty");
            return true;
        }
        return false;
    }

    //Code to check whether entered email is valid in format or not. Reference -> G.F.G
    static public boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    static public boolean isValidContactNumber(String s)
    {

        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // 1) Begins with 0 or 91
        // 2) Then contains 7 or 8 or 9.
        // 3) Then contains 9 digits
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }

}
