
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter Number :");
            int b = scan.nextInt();
            System.out.println("Enter Number is : " + b);
        } catch (Exception e) {
            System.out.println("Error !!! Enter only integer " + e.getMessage

            
            
            
            ());
        }
    }
}
