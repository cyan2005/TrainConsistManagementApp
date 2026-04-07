import java.util.ArrayList;
import java.util.List;

public class TrainConsistAppUC2 {

    public static void main(String[] args) {
        // 1. Welcome message
        System.out.println("=== Train Consist Management App (UC2) ===\n");

        // 2. Initialize an empty ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 3. Add bogies to the train
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 4. Display bogies after insertion
        System.out.println("Passenger bogies after addition: " + passengerBogies);

        // 5. Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Passenger bogies after removing AC Chair: " + passengerBogies);

        // 6. Check if Sleeper bogie exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie does not exist in the train.");
        }

        // 7. Final list state
        System.out.println("Final passenger bogies: " + passengerBogies);

        System.out.println("\nTrain consist is ready for further operations.");
    }
}