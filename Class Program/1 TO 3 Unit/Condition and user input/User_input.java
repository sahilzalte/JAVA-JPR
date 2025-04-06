import java.util.Scanner;

public class User_input {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter Input:");
            int input = scan.nextInt();
            System.out.println("You entered: " + input);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
