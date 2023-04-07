package mainpackage;

import java.util.Scanner;

public class Users {
    String name,username,password, email;
    public Users(String name,String username,String password, String email) {

        this.name=name;
        this.username=username;
        this.password=password;
        this.email=email;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        //Check that name has only letters
        this.name = name;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        // Input for password
        System.out.println("Please enter a password:");
        Scanner passwordInput = new Scanner(System.in);
        password = passwordInput.nextLine();

        //Check if password is strong
        while (!passwordIsValid(password)){
            System.out.println("Password Must Have: \n1) At least one Upper case letter\n2) At least one Lower case letter\n"
                    + "3) At least one Digit\n4) At least one Special character\n5) More than 8 characters");
            passwordInput = new Scanner(System.in);
            password = passwordInput.nextLine();
        }
        this.password = password;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    // Methods
    public boolean login(String username, String password) {
        // Check if user exists
        if (userExists(username, password)){
            return true;
        }else{
            return false;
        }
    }
    public void logout() {


    }

    public boolean userExists(String username, String password){
        // Search credentials in a database or file
        return true;
    }

    public boolean passwordIsValid(String password){
        final int MIN_PASSWORD_LENGTH = 8;

        // Check for password's length
        if(password.length() < MIN_PASSWORD_LENGTH){
            return false;
        }

        //Check if password has at least 1 Upper, 1 Lower case character, 1 Digit and 1 Special character.
        String specialChars = "!@#$%&*()_+=-|<>?{}[]~ ";

         boolean hasUpperChar = false;
         boolean hasLowerChar = false;
         boolean hasDigit = false;
         boolean hasSpecialChar = false;

         if (password.contains(specialChars)){
             hasSpecialChar = true;
         }

         for(char c: password.toCharArray()){
             if (Character.isUpperCase(c)){
                 hasUpperChar = true;
             }else if (Character.isLowerCase(c)){
                 hasLowerChar = true;
             }else if (Character.isDigit(c)) {
                 hasDigit = true;
             }
         }
         return hasUpperChar && hasLowerChar && hasDigit && hasSpecialChar;
    }
}
