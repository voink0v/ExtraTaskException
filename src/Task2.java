import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();


        try {


            while (true) {

                System.out.println("введите число");
                list.add(Integer.parseInt(scanner.nextLine()));


            }


        } catch (Exception e) {

            for (Integer integer : list) {


                System.out.println(integer);

            }
        }
    }
}


