package se.dsve.passwordGenerator;

import java.security.SecureRandom;

public class PasswordGenerator {

    static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int PASSWORD_LENGTH =10;
    private static final SecureRandom random = new SecureRandom();

    public static String generatePassword() {
        // TODO: Skriv din kod här
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return password.toString();
    }
}

