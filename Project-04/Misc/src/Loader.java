/**
 * Created by Roman on 17.02.16.
 */
public class Loader {
    public static void main(String[] args) {
        double a = 1660.0, b = 100.0, c = a/b;
        System.out.println(c);

        double d = 2.4 * 0.1;
        System.out.println(d);

        System.out.println();
        System.out.println("Byte MAX = " + Byte.MAX_VALUE);
        System.out.println("Byte MIN = " + Byte.MIN_VALUE);

        System.out.println();
        System.out.println("Integer MAX = " + Integer.MAX_VALUE);
        System.out.println("Integer MIN = " + Integer.MIN_VALUE);

        System.out.println();
        System.out.println("Double MAX = " + Double.MAX_VALUE);
        System.out.println("Double MIN = " + Double.MIN_VALUE);

        System.out.println();
        System.out.println("Short MAX = " + Short.MAX_VALUE);
        System.out.println("Short MIN = " + Short.MIN_VALUE);

        System.out.println();
        System.out.println("Long MAX = " + Long.MAX_VALUE);
        System.out.println("Long MIN = " + Long.MIN_VALUE);

        System.out.println();
        System.out.println("Float MAX = " + Float.MAX_VALUE);
        System.out.println("Float MIN = " + Float.MIN_VALUE);
    }
}
