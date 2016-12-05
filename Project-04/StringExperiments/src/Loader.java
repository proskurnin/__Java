import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException {
        System.out.print("Введите заработок Васи: ");
        int moneyVasy = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.print("Введите заработок Пети: ");
        int moneyPetya = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.print("Введите заработок Маши: ");
        int moneyMasha = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        String text = "Вася заработал " + moneyVasy +  " рублей, Петя - " + moneyPetya + " рублей, а Маша - " + moneyMasha + " рублей";
        System.out.println();
        System.out.println(text);

        int startCut = text.indexOf("тал")+3;
        int finishCut = text.indexOf("руб");

        String moneyVasyaString = text.substring(startCut, finishCut);
        int moneyVasyaFromString = Integer.parseInt(moneyVasyaString.trim());

        startCut = text.lastIndexOf("-")+1;
        finishCut = text.lastIndexOf("руб");

        String moneyMashaString = text.substring(startCut, finishCut);
        int moneyMashaFromString = Integer.parseInt(moneyMashaString.trim());

//        System.out.println();
//        System.out.println("Строка " + moneyVasyaString);
//        System.out.println("Строка " + moneyMashaString);
//
//        System.out.println();
//        System.out.println(moneyVasyaFromString);
//        System.out.println(moneyMashaFromString);

        String and;
        if (moneyVasyaFromString > moneyMashaFromString)
        {
            and = " и Вася заработал бОльшую часть!";
        }
        else if (moneyVasyaFromString < moneyMashaFromString)
        {
            and = " и Маша заработала бОльшую часть!";
        }
        else
        {
            and = " и они молодцы!";
        }

        int moneySum;
        moneySum = moneyVasyaFromString + moneyMashaFromString;
        System.out.println();
        System.out.println("Суммарыный заработок Васи и Маши " + moneySum + " рублей" + and);
    }
}