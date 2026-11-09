import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileUpdateDemo {
    public static void main(String[] args) {
        try (FileWriter writer =
                     new FileWriter("application_audit.log", true)) {

            writer.write("New User Activity Recorded at: "
                    + LocalDateTime.now() + "\n");

            System.out.println("Log file updated successfully.");

        } catch (IOException e) {
            System.out.println("Error updating file: " + e.getMessage());
        }
    }
}
