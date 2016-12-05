import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 01.03.16.
 */

public class Loader
{
    public static void main(String[] args) throws IOException {

        System.out.print("Введите фамилию, имя и отчество: ");
        String fullName = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        fullName.trim();
        System.out.println();

        // ФАМИЛИЯ
        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        String secondName, firstName, middleName;
        int startCut = 0, finishCut;

        if (fullName.indexOf(" ", startCut + 1) == -1)
        {
            finishCut = fullName.length();
        }
        else
        {
            finishCut = fullName.indexOf(" ", startCut + 1);
        }
        secondName = fullName.substring(startCut, finishCut).trim();
        System.out.println("Фамилия: " + secondName);


        // ИМЯ
        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        startCut = finishCut;
        if (fullName.indexOf(" ", startCut + 1) == -1)
        {
            finishCut = fullName.length();
        }
        else
        {
            finishCut = fullName.indexOf(" ", startCut + 1);
        }
        firstName = fullName.substring(startCut, finishCut).trim();
        System.out.println("Имя: " + firstName);


        // ОТЧЕСТВО
        // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        startCut = finishCut;
        if (fullName.indexOf(" ", startCut + 1) == -1)
        {
            finishCut = fullName.length();
        }
        else
        {
            finishCut = fullName.indexOf(" ", startCut + 1);
        }
        middleName = fullName.substring(startCut, finishCut).trim();
        System.out.println("Отчество: " + middleName);

    }
}
