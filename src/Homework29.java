import java.util.regex.Pattern;

public class Homework29 {
    public static void main(String[] args) {
        String text = "1234 qwe 4567 pou 5e6t ";
        String a = text.substring(0,5);
        String b = text.substring(9,13);
        System.out.println("It's look like" + a.concat(b));

    }
}
