
public class Loader
{
    public static void main(String[] args)
    {
        //Ингредиенты в наличии
        Integer milkAmount = 500; // ml - молоко (первоначальное условие = 200)
        Integer powderAmount = 500; // g - мука (первоначальное условие = 5)
        Integer eggsCount = 5; // items - яйца (первоначальное условие = 3)
        Integer sugarAmount = 100; // g - сахар (первоначальное условие = 5)
        Integer oilAmount = 30; // ml - масло (первоначальное условие = 30)
        Integer appleCount = 2; // items - яблоки (первоначальное условие = 8)
        //При первоначальных условиях ни одно требуемое блюдо мы не можем приготовить по рецептуре

        //Рецепт блинов
        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        Integer powderAmountPancakes = 400; // g - требуемое количество муки для блинов
        Integer sugarAmountPancakes = 10; // g - требуемое количество сахара для блинов
        Integer milkAmountPancakes = 1000; // ml - требуемое количество молока для блинов
        Integer oilAmountPancakes = 30; // ml - требуемое количество масла для блинов
        if (powderAmount >= powderAmountPancakes && sugarAmount >= sugarAmountPancakes && milkAmount >= milkAmountPancakes && oilAmount >= oilAmountPancakes)
        {
            System.out.println("Можем испечь блины!");
        }
        else
        {
            System.out.println("Для того чтобы испечь блины нам не хватает:");
            if (powderAmount < powderAmountPancakes)
            {
                System.out.println("- " + (powderAmountPancakes - powderAmount) + " грамм муки");
            }
            if (sugarAmount < sugarAmountPancakes)
            {
                System.out.println("- " + (sugarAmountPancakes-sugarAmount) + " грамм сахара");
            }
            if (milkAmount < milkAmountPancakes)
            {
                System.out.println("- " + (milkAmountPancakes-milkAmount) + " мл молока");
            }
            if (oilAmount < oilAmountPancakes)
            {
                System.out.println("- " + (oilAmountPancakes-oilAmount) + " мл масла");
            }
        }

        //Рецепт омлета
        //milk - 300 ml, powder - 5 g, eggs - 5
        System.out.println(); // для пробела перед блоком с омлетом
        Integer milkAmountOmelette = 300; // ml - требуемое количество молока для омлета
        Integer powderAmountOmelette = 5; // g - требуемое количество муки для омлета
        Integer eggsCountOmelette = 5; // items - требуемое количество яиц для омлета
        if (milkAmount >= milkAmountOmelette && powderAmount >= powderAmountOmelette && eggsCount >= eggsCountOmelette)
        {
            System.out.println("Можем приготовить омлет!");
        }
        else
        {
            System.out.println("Для того чтобы приготовить омлет нам не хватает:");
            if (milkAmount < milkAmountOmelette)
            {
                System.out.println("- " + (milkAmountOmelette - milkAmount) + " мл молока");
            }
            if (powderAmount < powderAmountOmelette)
            {
                System.out.println("- " + (powderAmountOmelette-powderAmount) + " грамм муки");
            }
            if (eggsCount < eggsCountOmelette)
            {
                System.out.println("- " + (eggsCountOmelette-eggsCount) + " шт яиц");
            }
        }

        //Рецепт яблочного пирога
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        System.out.println(); // для пробела перед блоком с пирогом
        Integer appleCountApplePie = 3; // items - требуемое количество яблок для пирога
        Integer milkAmountApplePie = 100; // ml - требуемое количество молока для пирога
        Integer powderAmountApplePie = 300; // g - требуемое количество муки для пирога
        Integer eggsCountApplePie = 4; // items - требуемое количество яий для пирога
        if (appleCount >= appleCountApplePie && milkAmount >= milkAmountApplePie && powderAmount >= 300 && eggsCount >= 4)
        {
            System.out.println("Можем испечь яблочный пирог!");
        }
        else
        {
            System.out.println("Для того чтобы испечь яблочный пирог нам не хватает:");
            if (appleCount < appleCountApplePie)
            {
                System.out.println("- " + (appleCountApplePie - appleCount) + " шт яблок");
            }
            if (milkAmount < milkAmountApplePie)
            {
                System.out.println("- " + (milkAmountApplePie-milkAmount) + " мл молока");
            }
            if (powderAmount < powderAmountApplePie)
            {
                System.out.println("- " + (powderAmountApplePie-powderAmount) + " грамм муки");
            }
            if (eggsCount < eggsCountApplePie)
            {
                System.out.println("- " + (eggsCountApplePie-eggsCount) + " шт яиц");
            }
        }
    }
}