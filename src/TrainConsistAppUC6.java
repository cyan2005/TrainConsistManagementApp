import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppUC6 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC6) ===\n");

        // 1. Initialize a HashMap to store bogie-capacity information
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 2. Insert bogie capacities (key = bogie name, value = capacity)
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 36);

        // 3. Iterate over the map and display bogie capacities
        System.out.println("Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        System.out.println("\nHashMap enables fast lookup and mapping of bogie properties.");
    }
}