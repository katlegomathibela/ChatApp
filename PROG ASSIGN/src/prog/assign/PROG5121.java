package prog.assign;

import com.mycompany.prog5121.ClassLogin;
import com.mycompany.prog5121.ClassLogin;
import javax.swing.JOptionPane;

public class PROG5121 {

    public static void main(String[] args) {
        ClassLogin use = new ClassLogin();

        String name = JOptionPane.showInputDialog(null, "Enter your name:");
        use.setName(name);

        String surname = JOptionPane.showInputDialog(null, "Enter your surname:");
        use.setSurname(surname);

        // Phone number validation loop
        String phoneNumber;
        do {
            phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number (must start with +27 and be 12 characters):");
             use.setPhone_number(phoneNumber);
            if (!use.checkPhoneNumber(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone number does not contain international code or is incorrectly formatted.");
            }
        } while (!use.checkPhoneNumber(phoneNumber));
       
        JOptionPane.showMessageDialog(null, "Phone number captured successfully");

        // Username validation loop
        String username;
        do {
            username = JOptionPane.showInputDialog(null, "Enter your username (must contain underscore and be at least 5 characters long):");
            use.setUserName(username);
            if (!use.checkUserName(username)) {
                JOptionPane.showMessageDialog(null, "Username is incorrectly formatted. Please ensure that your username contains an underscore and is at least five characters long.");
            }
        } while (!use.checkUserName(username));
       
        JOptionPane.showMessageDialog(null, "Username successfully captured.");

        // Password validation loop
        String password;
        do {
            password = JOptionPane.showInputDialog(null, "Enter your password (minimum 8 characters, with at least one uppercase letter, one number, and one special character):");
             use.setPassword(password);
            if (!use.checkPassword(password)) {
            JOptionPane.showMessageDialog(null, "Password successfully captured.");     
            }
        } while (use.checkPassword(password));
       
       
JOptionPane.showMessageDialog(null, "Password is incorrectly formatted; please ensure it contains at least eight characters, a capital letter, a number, and a special character.");
        // Register user
        String registrationMessage = use.RegisterUser(password, username);
        JOptionPane.showMessageDialog(null, registrationMessage);

        // User login
        JOptionPane.showMessageDialog(null, "***** USER LOGIN *****");

        boolean loggedIn = false;
        while (!loggedIn) {
            String loginUsername = JOptionPane.showInputDialog(null, "Username:");
            String loginPassword = JOptionPane.showInputDialog(null, "Password:");

            if (use.loginUser(loginPassword, loginUsername)) {  // Make sure parameter order matches your method
                use.returnLoginStatus(loginUsername, loginPassword);
                loggedIn = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password incorrect, please try again.");
            }
        }
    }
}

         