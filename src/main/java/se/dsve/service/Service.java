package se.dsve.service;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import se.dsve.input.InputHelper;
import se.dsve.timer.CodeValidityTimer;
import se.dsve.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static se.dsve.email.EmailSender.*;
import static se.dsve.passwordGenerator.PasswordGenerator.generatePassword;

public class Service {
    public static List<User> users = new ArrayList<>();

    public static void seedEmailAddresses() {
        // add email addresses to emailAddresses
        users.add(new User("user1", "user1@example.com", "password1"));
        users.add(new User("user2", "user2@example.com", "password2"));
        users.add(new User("user3", "user3@example.com", "password3"));
        users.add(new User("user4", "user4@example.com", "password4"));
        users.add(new User("user5", "user5@example.com", "password5"));
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
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Enter your code: ");
        String code = scanner.nextLine();
        User newUser = new User(name, email, password);
        users.add(newUser);
        return newUser;
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
        System.out.println("Enter your code: ");
        String code = scanner.nextLine();
        User user = getUser(email);
        if (user != null && user.getPassword().equals(password)) {
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
}

