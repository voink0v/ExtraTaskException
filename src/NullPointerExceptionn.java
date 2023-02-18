public class NullPointerExceptionn {
    public static void main(String[] args) {
        int i;
        int[] nNulArray = new int[5];
        nNulArray = null;

        try {
            i = nNulArray.length;
        } catch (NullPointerException e) {
            System.out.println("Некорректное использование ссылок (обычно, когда мы вызываем метод " +
                    "объектной переменной, которая содержит пустую ссылку). " + e);
        }

    }
}
