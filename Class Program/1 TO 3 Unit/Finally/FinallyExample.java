package Finally;
class Example {
    void show() {
        try {
            System.out.println(10 / 0); // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, it always runs!");
        }
    }
}

public class FinallyExample {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.show();
    }
}
