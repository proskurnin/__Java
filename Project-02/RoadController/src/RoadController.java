import core.*;
import core.Camera;

/**
 * Домашнее задание 2.2
 *
 * Данная программа открывает или не открывает шлагбаум.
 * Программа выставляет счета за проезд и нарушение скоросного режима.
 * Так же программа умеет и вызывает полицию.
 *
 * Программа вычисляет стоимость оплаты исходя из данных о типе автомобиля и его массе.
 * Стоимость проезда легкового авто с высотой до 2 м и весом до 3500 кг - 100 рублей. Автомобили выше 2 м - "грузовые".
 * Стоимость проезда грузового автомобиля 250 рублей. При наличии прицепа берется дополнительная оплата
 * в размере 200 рублей.
 *
 * Максимальная допустимая скорость движения 30 км/ч. Штраф 500 рублей за каждые 20 км/ч
 * превышения, до 160 км/ч.
 *
 * При скорости более 160 км/ч программа вызывает полицию. Также программа вызывает полицию
 * если номер автомобиля содержится в списке номеров нарушителей.
 *
 * Программа пропускает автомобили спецтранспортабез оплаты.
 *
 * Программа проверяет высоту автомобиля для возможности проезда. Автомобили ниже 4 метров могут проезжать, выше - нет.
 *
 *
 * - - - =  Доработка домашнего задания 2.2  = - - -
 *
 * Описание работы программы по шагам.
 * 1. Задаём переременные и начинаем исполнение программы.
 * 2. В моей версии программы я создаю перменную, которая отвечает за тип автомобиля. Так удобнее проверять результат.
 * 3. Дальше начинается цикл от 0 до 9, в котором мы получаем номера автомобилей и их прочие характеристики. В цикле мы
 * обрабатываем полученную информацию и выдаём результат обработки.
 * 4. Потом проверяем авто в базе данных нарушителей. Если авто там есть блокируем дорогу и вызываем полицию.
 * 5. Следующим шагом пропускаем автомобили СПЕЦТРАНСПОРТА.
 * 6. Далее проверяем высоту авто и не пропускаем высокие автомобили. (Вернул блок обратно)
 * 7. Потом устанавливаем стоимость проезда на основании типа авто. Тип авто выясняем на основании высоты и веса
 * легковой автомобиль или грузовой. Если высота машины ниже или равна максимальной высоте легкового автомобиля,
 * то машина легковая. Иначе, проверяем вес машины. Если её вес больше максимального веса легковой автомашины, то
 * машина грузовая, иначе - легковая.
 * 8. Грузовой автомобиль, может быть с прицепом. Проверка на это, тоже есть в коде. За прицеп есть доплата.
 * 9. Дальше обрабатываем скорость автомобиля. Если скорость выше прелельной, то вызываем полицию. Иначе, если скорость
 * выше максимальной допустикой, то разницу делим на шаг скорости для штрафа и умножаем на штраф за шаг. Причём
 * для того чтобы штраф начислялся сразу после превышеняи максимально допустимой скорости даже на 1 км/ч мы увеличиваем
 * частное от деления скорости превышения на шаг скорости для штрафа на единицу.
 * 10. Далее выводим информацию о необходимой оплате, которая складывается из стоимости оплаты за проезд и штрафа.
 * Стоимость оплаты за проез зависит от типа автомобиля.
 *
 *
 */

public class RoadController
{
    //Double passengerCarMaxWeight
    public static Double passengerCarMaxWeight = 3500.0; // kg
    //Integer passengerCarMaxHeight
    public static Integer passengerCarMaxHeight = 2000; // mm
    //Integer controllerMaxHeight
    public static Integer controllerMaxHeight = 3500; // mm - Изменил значение с 4000 на 3500

    //Integer passengerCarPrice
    public static Integer passengerCarPrice = 100; // RUB
    //Integer cargoCarPrice
    public static Integer cargoCarPrice = 250; // RUB
    //Integer vehicleAdditionalPrice
    public static Integer vehicleAdditionalPrice = 200; // RUB

    //Integer maxOncomingSpeed
    public static Integer maxOncomingSpeed = 60; // km/h - Изменил скорость с 30 на 60
    //Integer speedFineGrade
    public static Integer speedFineGrade = 20; // km/h
    //Integer finePerGrade
    public static Integer finePerGrade = 500; // RUB
    //Integer criminalSpeed
    public static Integer criminalSpeed = 160; // km/h

    public static void main(String[] args)
    {
        //String typeCar
        String typeCar; // Создаём переменную тип автомобиля, чтобы проверять точность результатов
        //Integer i
        for(Integer i = 0; i < 10; i++)
        {
            //Переменная car? Тип у неё должен быть Integet. Но её тип, как я понимаю задан не в этом коде.
            //Тут получается, что мы создаём переменную car с типом Car. Для меня это пока не особо понятно.
            Car car = Camera.getNextCar();
            System.out.println(car);
            System.out.println("Скорость: " + Camera.getCarSpeed(car) + " км/ч");

            /**
             * Проверка на наличие номера в списке номеров нарушителей
             */
            //Boolean policeCalled
            Boolean policeCalled = false;
            //String criminalNumber
            for(String criminalNumber : Police.getCriminalNumbers())
            {
                //String carNumber
                String carNumber = car.getNumber();
                if(carNumber.equals(criminalNumber)) {
                    if(car.isSpecial()) {
                        System.out.println("Угнанный СПЕЦТРАНСПОРТ!");
                        // Вывод пометки о том, что угнанный автомобиль является СПЕЦТРАНСПОРТОМ
                    }
                    Police.call("автомобиль нарушителя с номером " + carNumber);
                    blockWay("не двигайтесь с места! За вами уже выехали!");
                    break;
                }
            }
            if(Police.wasCalled()) {
                continue;
            }

            /**
             * Пропускаем автомобили спецтранспорта
             */
            if(car.isSpecial()) {
                openWay();
                continue;
            }

            /**
             * Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
             */
            //Integer carHeight
            Integer carHeight = car.getHeight();
            //Integer price
            Integer price = 0;

            if(carHeight > controllerMaxHeight)
            {
                blockWay("высота вашего ТС превышает высоту пропускного пункта!");
                continue;
            }

            if(carHeight > passengerCarMaxHeight)
            {
                //Double weight
                Double weight = WeightMeter.getWeight(car);
                //Грузовой автомобиль
                if(weight > passengerCarMaxWeight)
                {
                    typeCar = "Грузовой автомобиль";
                    price = cargoCarPrice;
                    if(car.hasVehicle()) {
                        typeCar = "Грузовой автомобиль c прицепом";
                        price = price + vehicleAdditionalPrice;
                    }
                }
                //Легковой автомобиль
                else {
                    typeCar = "Легковой автомобиль";
                    price = passengerCarPrice;
                }
            }
            else {
                typeCar = "Легковой автомобиль";
                price = passengerCarPrice;
            }

            System.out.println("Тип автомобиля: " + typeCar);

            /**
             * Проверка скорости подъезда и выставление штрафа
             */
            //Integer carSpeed
            Integer carSpeed = Camera.getCarSpeed(car);
            if(carSpeed > criminalSpeed)
            {
                Police.call("cкорость автомобиля - " + carSpeed + " км/ч, номер - " + car.getNumber());
                blockWay("вы значительно превысили скорость. Ожидайте полицию!");
                continue;
            }
            else if(carSpeed > maxOncomingSpeed)
            {
                //Integer overSpeed
                Integer overSpeed = carSpeed - maxOncomingSpeed;
                //Integer totalFine
                Integer totalFine = finePerGrade * (1 + overSpeed / speedFineGrade);
                System.out.println("Вы превысили скорость! Штраф: " + totalFine + " руб.");
                price = price + totalFine;
            }

            /**
             * Отображение суммы к оплате
             */
            System.out.println("Общая сумма к оплате: " + price + " руб. " );
        }

    }

    /**
     * Открытие шлагбаума
     */
    public static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    //String reason
    public static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}