import java.util.Arrays;

public class ArraysException {
    public static void main(String[] args) {
        int[] arrays = new int[2];

            for (int i = 0; i < 10; i++) {

                try {
                    arrays[i] = 1;
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println(Arrays.toString(arrays));
                    break;
                }

            }

        }


    }
