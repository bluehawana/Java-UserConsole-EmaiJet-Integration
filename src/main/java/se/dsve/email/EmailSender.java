package se.dsve.email;


import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import io.github.cdimascio.dotenv.Dotenv;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class EmailSender {

    public static void sendEmail(String toEmail, String toName, String subject, String textPart, String content) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
        // TODO: Skriv din kod här
        // 1. Ladda in .env filen
        // 2. Hämta ut API nycklar och email inställningar
        // 3. Skapa en Mailjet klient
        // 4. Skapa en Mailjet request
        // 5. Skicka email
        // 6. Skriv ut status och data
    }

    public static void verifyEmail(String toEmail, String toName, String verifyPassword) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
        // TODO: Skriv din kod här
        // Skicka email med verifieringskod via sendEmail metoden
        Throwable exception = new Throwable();
        throw new MailjetException("Error");
    }

    public static void verifySignIn(String toEmail, String toName, String generatedPassword) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
        // TODO: Skriv din kod här
        // Skicka email med inloggningskod via sendEmail metoden
        // Om toName finns i en lista med användarnamn, använd TO_EMAIL från .env filen
        List<String> usernames = Arrays.asList("user1", "user2", "user3", "user4", "user5");
        Throwable exception = new Throwable();
        throw new MailjetException("Error");
    }
}
