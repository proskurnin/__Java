import java.io.*;

public class Cat implements Serializable
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

    public Cat(Cat other)
    {
        this.other = other;
        return other;
    }

    // Метод к ПЕРВОМУ способу создания копии
    public void createTwin(Double weight)
    {
        this.weight = weight;
        originWeight = weight;
    }

    public static Cat createClone(Cat donor) throws IOException, ClassNotFoundException
    {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous = new ObjectOutputStream(baos);

        //сохраняем состояние кота Мурзика в поток и закрываем его(поток)
        ous.writeObject(donor);
        ous.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);

        //создаём кота для опытов и инициализируем его состояние Мурзика
        Cat cloneCat = (Cat) ois.readObject();
        count = count + 1;
        return cloneCat;
    }

    public void meow()
    {
//        System.out.println("Meow");
        weight = changeWeight(-1.0);
    }

    public void feed(Double amount)
    {
        weight = changeWeight(amount);
    }

    public void drink(Double amount)
    {
        weight = changeWeight(amount);
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