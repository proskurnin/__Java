import java.util.Scanner;

public class Loader implements Cloneable
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner in = new Scanner(System.in);
        Double newWeigth = 0.0;
        System.out.print("Введите вес Буси: ");
        if(in.hasNextDouble())
        {
            newWeigth = in.nextDouble();


            System.out.println();

            System.out.print("Создаём Бусю");
            Cat busya = new Cat(newWeigth);
            System.out.println("Вес Буси (вес вводили сами): " + busya.getWeight());
            System.out.print("Создаём Черныша");
            Cat chernish = new Cat();
            System.out.println("Вес Черныша (вес задаётся рандомом): " + chernish.getWeight());
            System.out.print("Создаём Мелкого");
            Cat melkii = Cat.getKitten();
            System.out.println("Вес Мелкого (создаём котёнка): " + melkii.getWeight());
            System.out.print("Создаём Ваську");
            Cat vaska = busya.createClone();
            System.out.println("Вес Васьки (копия с Буси): " + vaska.getWeight());
            System.out.print("Создаём Пушка");
            Cat pushok = Cat.createClone(chernish);
            System.out.println("Вес Пушка (копия с Черныша): " + pushok.getWeight());
            System.out.println();
            System.out.println("Кошек: " + Cat.getCount());


            System.out.println();
            System.out.println();

            System.out.print("Перекармливаем Черныша!");
            chernish.feed(10000.0);
            System.out.print("Замяукиваем Ваську!");
            vaska.meow(10000.0);
            System.out.println("Поим на 400 г. Пушка!");
            pushok.feed(400.0);


            System.out.println();
            System.out.println();

            System.out.println("Статус Буси: " + busya.getStatus());
            System.out.println("Статус Черныша: " + chernish.getStatus());
            System.out.println("Статус Мелкго: " + melkii.getStatus());
            System.out.println("Статус Васьки: " + vaska.getStatus());
            System.out.println("Статус Пушка: " + pushok.getStatus());
            System.out.println();
            System.out.println("Кошек: " + Cat.getCount());

        }
        else
        {
            System.out.println("Вы ввели не верное число");
        }
    }
}