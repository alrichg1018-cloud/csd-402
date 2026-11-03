
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random random = new Random();

        try {
            // Create the file if it does not exist,
            // or append if it already exists.
            FileWriter writer = new FileWriter(fileName, true);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100) + 1;
                writer.write(number + " ");
            }

            writer.close();

            // Reopen the file and display its contents.
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("Contents of data.file:");

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
