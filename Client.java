import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // এখানে System.in ব্যবহার করুন
        Scanner scanner = new Scanner(System.in); 
        
        try {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // newline consume করার জন্য
            
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = scanner.nextInt();

            // সার্ভারের সাথে কানেক্ট (পোর্ট একই রাখবেন)
            Socket socket = new Socket("localhost", 5000); 
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            
            writer.println(id + "," + name + "," + marks);
            System.out.println("Data sent successfully.");
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}