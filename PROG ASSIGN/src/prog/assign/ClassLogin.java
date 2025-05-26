package com.mycompany.prog5121;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class ClassLogin{
 private String Name;
 private String Surname;
 private String Phone_number;
 private String Username;
 private String Password;
 
 public void setName(String name){
 this.Name = name;
 }
 public String getName(){
 return Name;
 }        
  public void setSurname(String surname){
 this.Surname = surname;    
 }
 public String getSurname(){
 return Surname;
 }
 public void setUserName(String username){
 this.Username = username;    
 }
 public String getUserName(){
 return Username;    
 }
 public void setPhone_number(String phone_number){   
 this.Phone_number = phone_number;   
}
 public String getPhone_number(){
 return Phone_number;
 }
public void setPassword(String password){
this.Password = password;
}
public String getPassword(){
return Password;
}
public boolean checkUserName(String username){
return this.Username.contains("_") && this.Username.length()<=5;
}
public boolean checkPassword(String password){
return this.Password.contains(this.Password.toUpperCase())&& this.Password.length()>=8 && this.Password.matches(".*[0-9].*")&& this.Password.matches(".*[!@#$%^&*?].*");
}
public boolean checkPhoneNumber(String phone_number){
return this.Phone_number.startsWith("+27")&& this.Phone_number.length()==12;
}
public String RegisterUser(String password, String username){
if(!checkUserName(username)){
System.out.println("Username does not meet requirements");
}
if(!checkPassword(password)){
System.out.print("Password does not meet requirements");
}
if(checkUserName(username) &&checkPassword(password));{
}
return"";
}

 
public boolean loginUser(String password, String username){
return this.Username.equals(username)&& this.Password.equals(password);
}
 
public String returnLoginStatus(String Username, String Password){
if(checkPassword(Password) && checkUserName(Username)){
System.out.println("Login Successful.");
System.out.println("Welcom " + getName() + " " + getSurname());
}else if(!checkPassword(Password)){
System.out.println("Login Unsuccesful");
System.out.println("Username or Password incorrect.Please try again");
}else if(!checkUserName(Username)){
System.out.println("Login Unsuccessful");
System.out.println("Username or Password incorrect.Please try again");
        }
return"";
}
//comment
}


