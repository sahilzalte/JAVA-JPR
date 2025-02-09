class Example {
    void divide(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Cannot divide by zero!");
        System.out.println("Result: " + (a / b));
    }
}

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            new Example().divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

// Output: Exception caught: Cannot divide by zero!


