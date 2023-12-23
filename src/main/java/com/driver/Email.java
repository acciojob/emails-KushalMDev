package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(password.equals(oldPassword)){
            if(newPassword.length()==8 &&  helper(newPassword)){
                password=newPassword;
            }
        }
    }

    private boolean helper(String newPassword) {
        int cnt=0;
        for(char c:newPassword.toCharArray()){
            if(c>=65 && c<=90){
                cnt++;
            }
            else if(c>=97 && c<=122){
                cnt++;
            }
            else if(Character.isDigit(c)){
                cnt++;
            }
            else if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || c=='*')
            {
                cnt++;
            }
           
        }
        if(cnt>=4)return true;
        return false;
    }
    
}
