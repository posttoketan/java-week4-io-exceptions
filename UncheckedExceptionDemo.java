public class UncheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Handled: Division by zero.");
        }

        try {
            String name = null;
            System.out.println(name.length());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled.");
        }
    }
}
