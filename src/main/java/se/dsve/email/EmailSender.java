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
        Dotenv dotenv = Dotenv.load();
        MailjetClient client = new MailjetClient(
                dotenv.get("MJ_APIKEY_PUBLIC"),
                dotenv.get("MJ_APIKEY_PRIVATE"),
                new ClientOptions("v3.1")
        );
        MailjetRequest request;
        MailjetResponse response;
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", dotenv.get("FROM_EMAIL"))
                                        .put("Name", dotenv.get("FROM_NAME")))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", toEmail)
                                                .put("Name", toName)))
                                .put(Emailv31.Message.SUBJECT, subject)
                                .put(Emailv31.Message.TEXTPART, textPart)
                                .put(Emailv31.Message.HTMLPART, content)
                                .put(Emailv31.Message.CUSTOMID, "AppGettingStartedTest")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }

    public static void verifyEmail(String toEmail, String toName, String verifyPassword) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
        String subject = "Verify your email";
        String textPart = "Your verification code is: " + verifyPassword;
        String content = "<h3>Your verification code is: " + verifyPassword + "</h3>";
        sendEmail(toEmail, toName, subject, textPart, content);
    }

    public static void verifySignIn(String toEmail, String toName, String generatedPassword) throws MailjetException, MailjetSocketTimeoutException, InterruptedException {
        List<String> usernames = Arrays.asList("user1", "user2", "user3", "user4", "user5");
        if (usernames.contains(toName)) {
            Dotenv dotenv = Dotenv.load();
            toEmail = dotenv.get("USER_EMAIL");
            String subject = "Login Code";
            String textPart = "Your login code is: ";
            String content = "<h1>Your login code is: " + generatedPassword + "</h1>";
            sendEmail(toEmail, toName, subject, textPart, content);
        }
    }
}