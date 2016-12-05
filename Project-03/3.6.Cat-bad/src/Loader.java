import java.io.*;

public class Loader
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Cat murzik = new Cat();
        Cat pushok = new Cat();

        // ПЕРВЫЙ способ создания копии (по материалам урока)
        pushok.createTwin(murzik.getWeight());

        // ВТОРОЙ способ создания копии (подсмотрено в Интернете)
        Cat vaska = Cat.createClone(murzik);

        System.out.println("Вес Мурзика: " + murzik.getWeight());
        System.out.println("Вес Пушка: " + pushok.getWeight());
        System.out.println("Вес Васьки: " + vaska.getWeight());

        System.out.println();
        System.out.println("Перекармливаем Мурзика!");
        murzik.feed(100000.0);
        System.out.print("Замяукиваем Ваську ... ");
        vaska.meow(10000.0);

        System.out.println();
        System.out.println("Статус Мурзика: " + murzik.getStatus());
        System.out.println("Статус Пушка: " + pushok.getStatus());
        System.out.println("Статус Васьки: " + vaska.getStatus());
    }
}