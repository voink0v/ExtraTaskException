import java.util.Scanner;

public class SelfException {
    public static void main(String[] args) {

        try {
            System.out.println(age());
        } catch (AgeException e) {
            System.out.println("ошибка возраста " + e);
        }


    }

    public static int age() throws AgeException {


        Scanner sc = new Scanner(System.in);
// первый вариант
        //int x = 0;
//        while (true) {
//            try {
//                x = Integer.parseInt(sc.nextLine());
//                System.out.println("Вы ввели: " + x);
//                break;
//            } catch (Exception e) {
//                System.out.println("Вы ввели не число. Введите число");
//            }
//
//        }

        //второй вариант
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        boolean b = true;
        while (b) {


            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;

            } else {
                System.out.println("введите число");
                scanner.nextLine();

            }

        }


        if (x > 18) {
            throw new AgeException();

        }
        return x;
    }

}

class AgeException extends Exception {


}

