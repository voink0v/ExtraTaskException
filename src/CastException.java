public class CastException {

    public static void main(String[] args) {

        Object ch = new Character('*');
        try {
            System.out.println((Byte) (ch));
        } catch (ClassCastException e){
           System.out.println("ошибка " +e.getMessage());
           System.err.println("ошибка " +e.getMessage());

        }

    }
}
