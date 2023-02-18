import java.util.ArrayList;
import java.util.List;

public class WrongArrayElements {
    public static void main(String[] args) {
        Object x[] = new String[3];
        try {
            x[0] = new Integer(0);
        }catch (ArrayStoreException e) {
            System.out.println("ошибка " + e);


        }
    }
}
