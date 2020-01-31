public class P54 {
    public static void show() {
        throw new NullPointerException("Hello");
    }
    public static void main(String[] args) {
        try {
            show();
        }
    catch(ArithmeticException e) {
        System.out.println("B");
    }
    }
}