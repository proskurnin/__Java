import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera
{
    public static void main(String[] args) throws IOException
    {
        //Параметры программы
        Integer maxOncomingSpeed = 60; // km/h // Изменили значение с 30 на 60, чтобы штрафы были только за скорость более 60 km/h60
        Integer speedFineGrade = 20; // km/h
        Integer finePerGrade = 500*2; // RUB // Увеличение штрафа в два раза. Сознательно умножаю на два, чтобы помнить исходное значение штрафа.70
        Integer criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        Integer oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        Boolean isCriminalSpeed = oncomingSpeed >= criminalSpeed;
        System.out.println(isCriminalSpeed);
        if(isCriminalSpeed)
        {
            System.out.println("Вызов полиции...");
        }
        else if(oncomingSpeed > maxOncomingSpeed)
        {
            Integer overSpeed = oncomingSpeed - maxOncomingSpeed;
            Integer gradesCount = overSpeed / speedFineGrade + 1; // Добавляю единицу для учёта штрафов от 61 km/h
            Integer fine = finePerGrade * gradesCount;
            System.out.print("Сумма штрафа: " + fine);
            System.out.println(" рублей"); // надпись "рублей" после суммы штрафа
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}