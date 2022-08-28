import java.util.regex.Pattern;

public class Homework29 {
    public static void main(String[] args) {
        String text = "1234 qae 4567 pou 5e6t ";
        String a = text.substring(0, 5);
        String b = text.substring(9, 13);
        System.out.println("It's look like" + a.concat(b));


        System.out.println(text.replace("a", "*"));

        String q = text.substring(5,8) + text.substring(14,17);
        System.out.println("Letters:" +q.toUpperCase());


        if (text.equalsIgnoreCase("abcd")) {
            System.out.println("Soderzit");
        } else {
            System.out.println(" Ne soderzit");

            System.out.println(text.startsWith("5555"));


        }

    }
}

