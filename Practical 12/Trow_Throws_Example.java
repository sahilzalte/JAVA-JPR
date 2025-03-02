import java.io.IOException;

public class Trow_Throws_Example {
    public static void main(String[] args) {
        // Example of throw
        try {
            checkAge(15); // This will throw an exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Example of throws
        try {
            checkFile(); // This method declares an exception
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method using throw (throws exception if age < 18)
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be 18 or older.");
        }
        System.out.println("Access granted!");
    }

    // Method using throws (declares IOException)
    static void checkFile() throws IOException {
        throw new IOException("File not found!");
    }
}
