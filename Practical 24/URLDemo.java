import java.io.*;
import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            // Creating a URL object
            URL url = new URL("https://sahils-omega.vercel.app/index.html");

            // Displaying various URL methods
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // Returns -1 if no port is specified
            System.out.println("Default Port: " + url.getDefaultPort());
            System.out.println("File: " + url.getFile());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Ref: " + url.getRef()); // Fragment in URL

            // Opening a connection
            URLConnection connection = url.openConnection();
            connection.connect(); // Establish the connection

            // Displaying URLConnection properties
            System.out.println("\nContent Type: " + connection.getContentType());
            System.out.println("Content Length: " + connection.getContentLength());
            System.out.println("Date: " + connection.getDate());
            System.out.println("Expiration: " + connection.getExpiration());
            System.out.println("Last Modified: " + connection.getLastModified());

            // Reading content from URL
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                System.out.println("\nContent from URL:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (MalformedURLException e) {
            System.out.println("Malformed URL Error: " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
