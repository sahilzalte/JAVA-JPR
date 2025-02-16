import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<Integer> vec = new Vector<>();

        // Adding elements
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        // Displaying Vector elements
        System.out.println("Vector elements: " + vec);

        // Accessing an element using get()
        System.out.println("Element at index 2: " + vec.get(2));

        // Removing an element
        vec.remove(3); // Removes element at index 3
        System.out.println("After removal: " + vec);

        // Checking if an element exists
        System.out.println("Contains 20? " + vec.contains(20));

        // Getting the size of the vector
        System.out.println("Vector size: " + vec.size());

        // Using a loop to iterate
        System.out.print("Vector elements using loop: ");
        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + " ");
        }
        System.out.println();
    }
}
