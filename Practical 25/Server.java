import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Creating a server socket that listens on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for a client...");

            // Accepting client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Input and Output streams for communication
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Reading message from client
            String message = input.readLine();
            System.out.println("Client: " + message);

            // Sending response to client
            output.println("Hello, Client! Message received.");

            // Closing resources
            input.close();
            output.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
