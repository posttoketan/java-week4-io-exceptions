import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileWriteDemo {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("application_audit.log")) {

            writer.write("Application Started at: "
                    + LocalDateTime.now() + "\n");

            writer.write("User Login Successful at: "
                    + LocalDateTime.now() + "\n");

            System.out.println("Log file created successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
