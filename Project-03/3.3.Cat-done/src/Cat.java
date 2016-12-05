
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double catFood;

    private Double minWeight;
    private Double maxWeight;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catFood = 0.0;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void wc()
    {
        weight = weight - 100;
        System.out.println("cat go to WC");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        catFood = catFood + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        catFood = catFood + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double getCatFood() {
        return catFood;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}