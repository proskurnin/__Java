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
        System.out.println("Все кошки созданы и их сейчас " + Cat.getCount());

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
        murzik.feed(15000.00);
        System.out.println();
        System.out.println("А, что у нас с Мурзиком? " + murzik.getStatus() + "!");
        System.out.println("После того как Мурзик взорвался кошек " + Cat.getCount());

        // Васька попьёт
        vaska.drink(2000.00);
        System.out.println();
        System.out.println("Как там Васька? " + vaska.getStatus() + "!");
        System.out.println("Кошек сейчас " + Cat.getCount());

        // Пушок ничего не делал, не ел и не пил, как он?
        System.out.println();
        System.out.println("Пушок: " + pushok.getStatus());
        System.out.println("а Пушок играет и кошек " + Cat.getCount());

        // Барсик размяукался - к беде
        Integer meowAmount = 0;
        System.out.println();
        System.out.println("Барсик замяукал:");
        do
        {
            barsik.meow();
            meowAmount = meowAmount + 1;
        }
        while (barsik.getStatus() != "Dead");
        System.out.println("Барсик мяукнул " + meowAmount + " раз и умер ((");

        // Сколько у нас кошек?
        System.out.println();
        System.out.println("Сколько у нас кошек в итоге? Их - " + Cat.getCount());
    }
}