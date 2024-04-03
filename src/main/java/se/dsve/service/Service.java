package se.dsve.service;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import se.dsve.passwordGenerator.PasswordGenerator;
import se.dsve.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static se.dsve.email.EmailSender.*;

public class Service {
    public static List<User> users = new ArrayList<>();

    public static void seedEmailAddresses() {
        // add email addresses to emailAddresses
            users.add(new User("user1", "user1@example.com", "password1", "tempPassword1"));
            users.add(new User("user2", "user2@example.com", "password2", "tempPassword2"));
            users.add(new User("user3", "user3@example.com", "password3", "tempPassword3"));
            users.add(new User("user4", "user4@example.com",  "password4", "tempPassword4"));
            users.add(new User("hz", "bluehawanan@gmail.com", "password", "tempPassword5"));
        }

    public static User registerNewUser() throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        // TODO: Skriv din kod här
        // 1. Ask for name
        // 2. Ask for email address
        // 3. Generate password
        // 4. Send email with password
        // 5. Ask for code
        // return User object
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();
        String password = PasswordGenerator.generatePassword();
        System.out.println("A temporary password has been sent to your email.");
        EmailService.sendTemporaryPassword(email, password);
        System.out.println("Enter the temporary password sent to your email: ");
        String enteredPassword = scanner.nextLine();
        if (enteredPassword.equals(password)) {
            User newUser = new User(name, email, password, password);
            users.add(newUser);
            return newUser;
        } else {
            System.out.println("Invalid temporary password!");
            return null;
        }
    }

    public static void login() throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        // TODO: Skriv din kod här
        // 1. Ask for email address
        // 2. Validate email address
        // 3. Generate password
        // 4. Send email with password
        // 5. Ask for code
        System.out.println("Enter your email address: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        User user = getUser(email);
        if (user != null && (user.getPassword().equals(password) || user.getTemporaryPassword().equals(password))) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials!");
        }
    }



    static User getUser(String email) {
        // TODO: Skriv din kod här
        return Service.users.stream().filter(user -> user.email().equals(email)).findFirst().orElse(null);
    }

    static boolean validateEmail(String email) {
        // TODO: Skriv din kod här
        return Service.users.stream().anyMatch(user -> user.email().equals(email));
    }


    public static class EmailService {
        public static void sendTemporaryPassword(String email, String password) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
            sendEmail(email, "User", "Temporary Password", "Your temporary password is: " + password, "<h3>Your temporary password is: " + password + "</h3>");
        }
    }
}

