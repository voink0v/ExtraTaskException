public class NumberFormatExc {
    public static void main(String[] args) {
        try {
            int a= Integer.parseInt("sfdd");
        }catch (Exception e){
            System.out.println("ошибка "+ e);

        }

    }
}
