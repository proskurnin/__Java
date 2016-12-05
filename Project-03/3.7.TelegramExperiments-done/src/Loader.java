import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.telegram.api.requests.TLRequestAuthSignUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 19.01.16.
 */
public class Loader
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 36323, "ca688cb673d620106617da01181c853a");

        System.out.println("Please, type phone number:");
        String phoneNumber = reader.readLine().trim();

        AuthCheckedPhone checkedPhone = bridge.authCheckPhone(phoneNumber);
        if (checkedPhone.isRegistered() == false)
        {
            System.out.println("Phone number is NOT REGISTERED!");
            if (checkedPhone.isInvited() == true)
            {
                System.out.println("Phone number is INVITED!");
            }
            else
            {
                System.out.println("Phone number is NOT INVITED.");
            }
            System.out.println("Please REGISTERED!");
        }
        else
        {
            System.out.println("Phone number is REGISTERED!");
            AuthSentCode sentCode = bridge.authSendCode(phoneNumber);
            System.out.println(sentCode.getPhoneCodeHash());

            System.out.println("Please, type secret code:");
            String secretCode = reader.readLine().trim();

            AuthAuthorization singIn = bridge.authSignIn(secretCode);
            System.out.println("First name: " + singIn.getUser().getFirstName());
            System.out.println("Last name: " + singIn.getUser().getLastName());
            System.exit(0);
        }
    }
}