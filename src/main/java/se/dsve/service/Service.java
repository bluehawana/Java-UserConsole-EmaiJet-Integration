package se.dsve.service;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import se.dsve.input.InputHelper;
import se.dsve.timer.CodeValidityTimer;
import se.dsve.user.User;

import java.util.ArrayList;
import java.util.List;

import static se.dsve.email.EmailSender.verifyEmail;
import static se.dsve.email.EmailSender.verifySignIn;
import static se.dsve.passwordGenerator.PasswordGenerator.generatePassword;

public class Service {
    public static List<User> users = new ArrayList<>();

    public static void seedEmailAddresses() {
        // add email addresses to emailAddresses
        users.add(new User("user1", "user1@example.com"));
        users.add(new User("user2", "user2@example.com"));
        users.add(new User("user3", "user3@example.com"));
        users.add(new User("user4", "user4@example.com"));
        users.add(new User("user5", "user5@example.com"));
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
        String name = InputHelper.readString();
        System.out.println("Enter your email address: ");
        String email = InputHelper.readString();
        if (validateEmail(email)) {
            String password = generatePassword();
            sendTemporaryPassword(email, password);
            System.out.println("A temporary password has been sent to your email.");
            System.out.println("Enter the temporary password sent to your email: ");
            String enteredPassword = InputHelper.readString();
            if (enteredPassword.equals(password)) {
                User user = new User(name, email);
                users.add(user);
                return user;
            } else {
                System.out.println("Invalid temporary password!");
            }
        } else {
            System.out.println("Invalid email address.");
        }
        return null;
    }

    public static void login() throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        // TODO: Skriv din kod här
        // 1. Ask for email address
        // 2. Validate email address
        // 3. Generate password
        // 4. Send email with password
        // 5. Ask for code
        System.out.println("Enter your email address: ");
        String email = InputHelper.readString();
        if (validateEmail(email)) {
            String password = generatePassword();
            verifySignIn(email, email, password);
            System.out.println("Enter the code sent to your email: ");
            String code = InputHelper.readString();
            if (CodeValidityTimer.isCodeValid(code)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid code.");
            }
        } else {
            System.out.println("Invalid email address.");
        }
    }

    static User getUser(String email) {
        for (User user : users) {
            if (user.email().equals(email)) {
                return user;
            }
        }
        return null;
    }

    static boolean validateEmail(String email) {
        // TODO: Skriv din kod här
        for (User user : users) {
            if (user.email().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public static void sendTemporaryPassword(String email, String password) throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        verifyEmail(email, email, password);
    }
    }

