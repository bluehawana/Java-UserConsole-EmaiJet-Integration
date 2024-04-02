package se.dsve;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import se.dsve.input.InputHelper;
import se.dsve.user.User;

import static se.dsve.service.Service.*;

public class Main {
    private static final InputHelper inputHelper = new InputHelper();

    public static void main(String[] args) throws InterruptedException, MailjetSocketTimeoutException, MailjetException {
        seedEmailAddresses();
        menu();
    }

    private static void menu() throws MailjetSocketTimeoutException, InterruptedException, MailjetException {
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. User list");
            System.out.println("4. Exit");
            int choice = inputHelper.readInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    registerNewUser();
                    break;
                case 3:
                    for (User user : users) {
                        System.out.println("Name: " + user.name() + ", Email: " + user.email());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
