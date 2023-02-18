import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b =0;


        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("деление на нуль");
        }

    }


}

