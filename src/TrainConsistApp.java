import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {
        // 1. Welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize an empty list to hold bogies
        List<String> trainConsist = new ArrayList<>();

        // 3. Display initial bogie count
        System.out.println("Initializing train consist...");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4. Program continues
        System.out.println("Train consist is ready for further operations.");
    }
}