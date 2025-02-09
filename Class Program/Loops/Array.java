public class Array {
    public static void main(String[] args) {
        int[] marks = { 1, 2, 3, 4, 5 };
        // First Method To Print Array ELement (Not Recomended)
        System.out.print(marks[0] + " ");// <-- Array Starts With 0
        System.out.print(marks[1] + " ");
        System.out.print(marks[2] + " ");
        System.out.print(marks[3] + " ");
        System.out.println(marks[4]);

        System.out.println("---------");
        // Secoud Method To Print Array ELement (Recomended)
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        // Change Array Element Value :
        marks[1] = 8;

        System.out.println(marks[1]);

    }

}
