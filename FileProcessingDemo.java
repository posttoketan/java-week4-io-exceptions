import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessingDemo {
    public static void main(String[] args) {

        String fileName = "employee_records.txt";

        // Writing data
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Employee ID: 101\n");
            writer.write("Employee Name: Ketan Das\n");
            writer.write("Department: Java Development\n");

            System.out.println("Employee data written successfully.");

        } catch (IOException e) {
            System.out.println("Writing Error: " + e.getMessage());
        }

        // Appending data
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("Status: Active\n");

            System.out.println("Employee data updated successfully.");

        } catch (IOException e) {
            System.out.println("Update Error: " + e.getMessage());
        }

        // Reading data
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;
            System.out.println("\nEmployee Records:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Reading Error: " + e.getMessage());
        }
    }
}
