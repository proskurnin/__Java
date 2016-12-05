
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    private static Integer count = 0;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count = count + 1;
    }

    public static Integer getCount()
    {
        return count;
    }

    public void meow()
    {
        if (weight < minWeight || weight > maxWeight)
        {
            System.out.printf("Он больше не мяукнет (");
        }
        else
        {
//          System.out.println("Meow");
            changeWeight(-1.0);
        }
    }

    public void feed(Double amount)
    {
        if (weight < minWeight || weight > maxWeight)
        {
            System.out.printf("Не кого кормить (");
        }
        else
        {
            changeWeight(amount);
        }
    }

    public void drink(Double amount)
    {
        if (weight < minWeight || weight > maxWeight)
        {
            System.out.printf("Не кого поить (");
        }
        else
        {
            changeWeight(amount);
        }
    }

    public Double changeWeight(Double amount)
    {
        weight = weight + amount;
        if(weight > maxWeight || weight < minWeight)
        {
            count = count - 1;
        }
        return weight;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight)
        {
            return "Dead";
        }
        else if(weight > maxWeight)
        {
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else
        {
            return "Playing";
        }
    }
}