/**
 * Created by Roman on 05.01.16.
 */
public class Loader
{
    public static void main(String[] args)
    {
        Integer dimaAge = 25; // Исходное значение - 35
        Integer mishaAge = 75; // Исходное значение - 55
        Integer vasyaAge = 75; // Исходное значение - 18

        Integer oldest;
        Integer youngest;
        Integer middle;

        if(dimaAge >= mishaAge)
        {
            if(mishaAge >= vasyaAge)
            {
                oldest = dimaAge;
                middle = mishaAge;
                youngest = vasyaAge;
            }
            else if(dimaAge >= vasyaAge)
            {
                oldest = dimaAge;
                middle = vasyaAge;
                youngest = mishaAge;
            }
            else
            {
                oldest = vasyaAge;
                middle = dimaAge;
                youngest = mishaAge;
            }
        }
        else if(dimaAge >= vasyaAge)
        {
            oldest = mishaAge;
            middle = dimaAge;
            youngest = vasyaAge;
        }
        else if(mishaAge >= vasyaAge)
        {
            oldest = mishaAge;
            middle = vasyaAge;
            youngest = dimaAge;
        }
        else
        {
            oldest = vasyaAge;
            middle = mishaAge;
            youngest = dimaAge;
        }

        System.out.println("Oldest: " + oldest);
        System.out.println("Middle: " + middle);
        System.out.println("Youngest: " + youngest);
    }
}
