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
        return null;
    }

    public static void login() throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        // TODO: Skriv din kod här
        // 1. Ask for email address
        // 2. Validate email address
        // 3. Generate password
        // 4. Send email with password
        // 5. Ask for code
    }

    static User getUser(String email) {
        // TODO: Skriv din kod här
        return null;
    }

    static boolean validateEmail(String email) {
        // TODO: Skriv din kod här
        return false;
    }
}
