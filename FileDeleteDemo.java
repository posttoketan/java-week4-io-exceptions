import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class FileDeleteDemo {
    public static void main(String[] args) {
        Path filePath = Path.of("application_audit.log");

        try {
            boolean deleted = Files.deleteIfExists(filePath);

            if (deleted) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File does not exist.");
            }

        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}
