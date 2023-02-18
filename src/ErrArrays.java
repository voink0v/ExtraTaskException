public class ErrArrays {

    public static void main(String[] args) {

        try {
            int[] arrays = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }

    }
}
