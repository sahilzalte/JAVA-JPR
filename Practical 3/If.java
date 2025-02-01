
import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double sal = sc.nextDouble();

        if (sal >= 500000) {
            System.out.println("Please pay tax !");
        }
        System.out.println("Thank you!");
        sc.close();
    }
}