import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Roman on 27.02.16.
 */
public class Load {
    public static void main(String[] args) throws IOException {
        int maxContainersInTruck = 12;
        int maxBoxesInContainer = 27;
        int numberOfContainers;
        int numberOfTrucks;

        System.out.print("Введите число ящиков: ");
        int numberOfBoxes = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        if (numberOfBoxes % maxBoxesInContainer == 0) {
            numberOfContainers = numberOfBoxes / maxBoxesInContainer;
        } else {
            numberOfContainers = numberOfBoxes / maxBoxesInContainer + 1;
        }

        if (numberOfContainers % maxContainersInTruck == 0) {
            numberOfTrucks = numberOfContainers / maxContainersInTruck;
        } else {
            numberOfTrucks = numberOfContainers / maxContainersInTruck + 1;
        }

        System.out.println();
        System.out.println("Ящиков: " + numberOfBoxes);
        System.out.println("Контейнеров: " + numberOfContainers);
        System.out.println("Грузовиков: " + numberOfTrucks);
        System.out.println();

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < numberOfTrucks) {
            i++;
            System.out.println("Грузовик " + i + ":");
            {
                while (j < numberOfContainers) {
                    j++;
                    System.out.println("   Контейнер " + j + ":");
                    while (k < numberOfBoxes) {
                        k++;
                        System.out.println("      Ящик " + k);
                        if (k % maxBoxesInContainer == 0) {
                            break;
                        }
                    }
                    if (j % maxContainersInTruck == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("ИТОГО");
        System.out.println("----------------");
        System.out.println("Ящиков: " + numberOfBoxes);
        System.out.println("Контейнеров: " + numberOfContainers);
        System.out.println("Грузовиков: " + numberOfTrucks);
    }
}
