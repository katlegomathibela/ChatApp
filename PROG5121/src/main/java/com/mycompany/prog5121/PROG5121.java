

package com.mycompany.prog5121;
import java.util.Scanner;

public class PROG5121 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Scanner get = new Scanner(System.in);
         ClassLogin use = new ClassLogin();
         
         System.out.println("****USER REGISTRATION****");
         System.out.println("Enter your name: ");
         String name = get.nextLine();
         use.setName(name);
         
         System.out.println("Enter your surname: ");
         String surname = get.nextLine();
         use.setSurname(surname);
         
         System.out.println("Enter your phone number: ");
         String phone_number = get.nextLine();
         use.setPhone_number(phone_number);
         if(use.checkPhoneNumber(phone_number)){
          System.out.println("Phone number captured successfully");
         }while(!use.checkPhoneNumber(phone_number));
          System.out.println("Phone number does not contain international code or is incorrectly formatted ");
         System.out.print("Enter your Phone number");
         phone_number = input.nextLine();
         use.setPhone_number(phone_number);
         
         System.out.println("Enter your username");
         String username = get.nextLine();
         use.setUserName(username);
         if(use.checkUserName(username)){
         System.out.println("Username successfully captured.");
         }else{
         System.out.println("Username is incorrectly formated, please ensure that your username contains an underscore and is no more than five characters long in lenghth.");
         }
         System.out.println("Enter your password: ");
         String password = get.nextLine();
         use.setPassword(password);
         if(use.checkPassword(password)){
        System.out.println("Password successfully captured");
         }else{
         System.out.println("Password is incorrectly formatted; please ensure that password contains at least eight characters, a capital letter, a number, and a special character.");
         }
         
         System.out.println(use.RegisterUser(password,username));
        
         System.out.println("*****USER LOGIN*****");
         System.out.print("Username: ");
         String LoginUsername = input.nextLine();         
    
         System.out.print("Password: ");
         String LoginPassword = input.nextLine();
         
         if(use.loginUser(password, username)){
         use.returnLoginStatus(username, password);
         }else{
          System.out.print("Username or Password incorrect, please try again");
         }
         while(!use.loginUser(LoginPassword, LoginUsername)){
         System.out.print("Username:  ");
        LoginUsername = input.nextLine();
         
        System.out.print("Password: ");
        LoginPassword = input.nextLine();
        if(use.loginUser(LoginPassword, LoginUsername)){
            use.returnLoginStatus(username, password);
        }
         }
         
    }
         
         
         
         }