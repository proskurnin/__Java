import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera
{
    public static void main(String[] args) throws IOException
    {
        //Параметры программы
        int maxOncomingSpeed = 60; // km/h // Изменили значение с 30 на 60, чтобы штрафы были только за скорость более 60 km/h60
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500*2; // RUB // Увеличение штрафа в два раза. Сознательно умножаю на два, чтобы помнить исходное значение штрафа.70
        int criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        boolean isCriminalSpeed = oncomingSpeed >= criminalSpeed;
        System.out.println(isCriminalSpeed);
        if(isCriminalSpeed)
        {
            System.out.println("Вызов полиции...");
        }
        else if(oncomingSpeed > maxOncomingSpeed)
        {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade + 1; // Добавляю единицу для учёта штрафов от 61 km/h
            int fine = finePerGrade * gradesCount;
            System.out.print("Сумма штрафа: " + fine);
            System.out.println(" рублей"); // надпись "рублей" после суммы штрафа
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}