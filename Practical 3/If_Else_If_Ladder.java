import java.util.Scanner;

public class If_Else_If_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Percentage:");
        double perc = sc.nextDouble();

        if (perc >= 90) {

            System.out.println("Job Assured!");
        } else if (perc >= 75) {

            System.out.println("Prepare a bit more");
        } else if (perc >= 50) {

            System.out.println("Work Hard!");
        } else if (perc >= 40) {

            System.out.println("You are a good student we don't deserve you");
        } else if (perc >= 0) {

            System.out.println("You are Fail!");
        } else {
            
            System.out.println("Enter Valid Data");
        }
        sc.close();
    }
}
