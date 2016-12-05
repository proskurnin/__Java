public class Cat implements Cloneable
{
    private Double weight = 0.0;
    private Double originWeight = 0.0;
    private Double minWeight = 100.0;
    private Double maxWeight = 9000.0;
    private static Integer count = 0;

    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(Double weight)
    {
        this.weight = weight;
        this.originWeight = weight;
        if (!notlife(weight))
        {
            count++;
            System.out.println(" ... + cat");
        }
        else
        {
            System.out.println(" ... - cat it is not living!");
        }
    }

    public static Cat getKitten()
    {
        Double kittenWeight = 100.0 + 100.0 * Math.random();
        Cat kitten = new Cat(kittenWeight);
        return kitten;
    }

    public Cat(Cat other)
    {
        this(other.getWeight());
        this.originWeight = other.originWeight;
    }

    public Cat createClone()
    {
        return new Cat(this);
    }

    public static Cat createClone(Cat donor)
    {
        return new Cat(donor);
    }

    public static Integer getCount()
    {
        return count;
    }

    public void meow()
    {
        Double myau = 1.0;
        meow(myau);
    }

    private Boolean notlife(Double weight)
    {
        return (weight < minWeight || weight > maxWeight);
    }

    public void meow(Double myau)
    {
        if (notlife(weight))
        {
            System.out.println(" ... cat cannot say meow (");
        }
        else
        {
//          System.out.println("Meow");
            changeWeight(-myau);
        }
    }

    public void feed(Double amount)
    {
        if (notlife(weight))
        {
            System.out.println(" ... cat cannot say eat (");
        }
        else
        {
            changeWeight(amount);
        }
    }

    public void drink(Double amount)
    {
        if (notlife(weight))
        {
            System.out.println(" ... cat cannot drink (");
        }
        else
        {
            changeWeight(amount);
        }
    }

    private Double changeWeight(Double amount)
    {
        weight = weight + amount;
        if(notlife(weight))
        {
            count--;
            System.out.println(" ... - cat");
        }
        return weight;
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getOriginWeight()
    {
        return originWeight;
    }

    public Double getMinWeight()
    {
        return minWeight;
    }

    public Double getMaxWeight()
    {
        return maxWeight;
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