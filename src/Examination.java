import java.io.IOException;

public class Examination {
    public static void main(String[] args) {


        try {
            int a = 0;
            int b = 7 / a;
            System.out.println("Correct, i can do it");
        } catch (ArithmeticException e) {
            System.out.println("Sorry, it's " + e);
        }

        try {
            int a = 0;
            int b = 7 / a;
            System.out.println("Correct, i can do it");
        } catch (ArithmeticException e) {
            System.out.println("Sorry, it's " + e);
        } catch (ArrayStoreException e1) {
            System.out.println("Sorry, it's " + e1);
        }

        try {
            int[] a = new int[6];
            a[7] = 10;
            System.out.println(a[7]);
        } catch (ArrayIndexOutOfBoundsException|Error e2){
        System.out.println("Sorry,now it's " + e2);
    }
}
}

