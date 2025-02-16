import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements using index
        System.out.println("First element: " + numbers[0]);

        // Loop through the array using for loop
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Enhanced for loop
        System.out.print("Using enhanced for loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Finding the length of an array
        System.out.println("Array length: " + numbers.length);
    }
}
