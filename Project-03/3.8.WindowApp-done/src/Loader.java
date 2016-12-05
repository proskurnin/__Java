import javax.swing.*;

/**
 * Created by Roman on 04.01.16.
 */
public class Loader
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        int width = 800;
        int height = 600;
        frame.setSize(width, height); // Установка размера окна 800х600
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setLocationRelativeTo(null); // Размещение окна по центру экрана
        frame.setVisible(true);
        System.out.println("Some text here!");
    }
}
