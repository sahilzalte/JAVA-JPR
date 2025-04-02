import java.sql.*;
import java.util.Scanner;

public class SQLiteDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:DummyDatabase.db"; // Path to your database file

        try {
            // Load SQLite JDBC Driver
            Class.forName("org.sqlite.JDBC");

            // Establish connection
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Connected to DummyDatabase.db!");

            // Create Scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Get user details
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            // Insert user data
            String insertQuery = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("User added successfully!");

            // Retrieve and display all users
            String selectQuery = "SELECT * FROM users";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("\nUser Records:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email"));
            }

            // Close resources
            rs.close();
            pstmt.close();
            stmt.close();
            conn.close();
            scanner.close();
            System.out.println("\nDatabase connection closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
