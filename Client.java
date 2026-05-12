import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.private_in);
        
        try {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();

            // Connect to server
            Socket socket = new Socket("localhost", 5000);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            
            // Send formatted data
            writer.println(id + "," + name + "," + marks);
            
            System.out.println("Data sent successfully.");
            socket.close();
        } catch (IOException e) {
            System.out.println("Client Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}