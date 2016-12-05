
public class Loader
{
    public static void main(String[] args)
    {
        Cat murzik = new Cat();
        Cat vaska = new Cat();
        Cat barsik = new Cat();
        Cat pushok = new Cat();
        Cat dimchik = new Cat();
        Cat busya = new Cat();
        Cat chernish = new Cat();

        System.out.println("Вес Мурзика: " + murzik.getWeight());
        System.out.println("Вес Васьки: " + vaska.getWeight());
        System.out.println("Вес Барсика: " + barsik.getWeight());
        System.out.println("Вес Пушка: " + pushok.getWeight());
        System.out.println("Вес Дымчика: " + dimchik.getWeight());
        System.out.println("Вес Буси: " + busya.getWeight());
        System.out.println("Вес Черныша: " + chernish.getWeight());

        // Кошки кушают и пьют
        murzik.feed(2635.51);
        vaska.drink(2946.11);
        barsik.feed(1874.24);
        dimchik.drink(3057.16);
        busya.feed(2965.91);
        chernish.drink(1104.83);

        // Что у нас с весом кошек?
        System.out.println();
        System.out.println("Вес Мурзика: " + murzik.getWeight());
        System.out.println("Вес Васьки: " + vaska.getWeight());
        System.out.println("Вес Барсика: " + barsik.getWeight());
        System.out.println("Вес Пушка: " + pushok.getWeight());
        System.out.println("Вес Дымчика: " + dimchik.getWeight());
        System.out.println("Вес Буси: " + busya.getWeight());
        System.out.println("Вес Черныша: " + chernish.getWeight());

        // Сейчас Мурзик скушает большую котлету!
        // Что с ним будет?
        murzik.feed(9000.00);
        System.out.println();
        System.out.println("А, что у нас с Мурзиком? " + murzik.getStatus() + "!");

        // Васька попьёт
        vaska.drink(2000.00);
        System.out.println();
        System.out.println("Как там Васька? " + vaska.getStatus() + "!");

        // Пушок ничего не делал, не ел и не пил, как он?
        System.out.println();
        System.out.println("Пушок: " + pushok.getStatus());

        // Барсик размяукался - к беде
        Integer meowAmount = 0;
        System.out.println();
        System.out.println("Барсик замяукал:");
        do {
            barsik.meow();
            meowAmount = meowAmount + 1;
        }
        while (barsik.getStatus() != "Dead");
        System.out.println("Барсик мяукнул " + meowAmount + " раз!");
        System.out.println("Барсик " + barsik.getStatus() + " ((");
    }
}