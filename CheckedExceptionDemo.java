import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("missing_file.txt");
            System.out.println("File opened successfully.");
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Handled: File not found.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
