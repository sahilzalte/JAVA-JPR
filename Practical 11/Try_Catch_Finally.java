public class Try_Catch_Finally {
    public static void main(String[] args) {
        // Try-Catch Example (ArithmeticException)
        try {
            int result = 10 / 0; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        // Try-Catch-Finally Example
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]); // Accessing out-of-bounds index
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
