/**
 * Created by Roman on 05.01.16.
 */
public class Loader
{
    public static void main(String[] args)
    {
        Integer moneyAmount = 20000; // Наличие денег
        Boolean hasPreviousVisa = true; // Наличие предыдущей визы
        Boolean hasConviction = false; // Наличие судимости

        if((moneyAmount > 45000 || hasPreviousVisa) && !hasConviction)
        {
            System.out.println("Visa should be granted");
        }
        else
        {
            System.out.println("Vasa cannot be granted");
        }
    }
}
