/**
 * Created by Roman on 29.02.16.
 */
public class Load {
    public static void main(String[] args) {
        String str = "String of the text";
        String russianStr = "Русский\n\tтекст";
        char ch = str.charAt(1);

        int chCode = (int) ch;
        System.out.println(ch);
        System.out.println(chCode);
        System.out.println(russianStr);
        System.out.println((int) '€');

    }
}
