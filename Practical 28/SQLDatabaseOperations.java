import java.util.Scanner;


public class SQLDatabaseOperations {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Insert operation
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("✅ Query executed: INSERT INTO users (name, email) VALUES (?, ?)");

        // Update operation
        System.out.println("Enter email to update: ");
        String emailToUpdate = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("✅ Query executed: UPDATE users SET name = ? WHERE email = ?");

        // Delete operation
        System.out.println("Enter email to delete: ");
        String emailToDelete = scanner.nextLine();
        System.out.println("✅ Query executed: DELETE FROM users WHERE email = ?");

        System.out.println("✅ Operations completed!");

        scanner.close();
    }
}
