public abstract class For_each_loop {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5 };

        // Classical way to iterate an array

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Modern Method for each loop 
        System.err.println();
        for (int Value : marks) {
            System.out.println(Value);
        }

    }
}
