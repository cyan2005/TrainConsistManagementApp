import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC5) ===\n");

        // 1. Initialize a LinkedHashSet to store bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 3. Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // 4. Display final train formation (in insertion order)
        System.out.println("Train formation (duplicates ignored, order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nLinkedHashSet ensures uniqueness and preserves insertion order.");
    }
}