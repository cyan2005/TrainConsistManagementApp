import java.util.LinkedList;

public class TrainConsistAppUC4 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC4) ===\n");

        // 1. Initialize a LinkedList for ordered bogie IDs
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial train consist: " + trainConsist);

        // 3. Insert a Pantry Car at position 2 (index starts at 0)
        trainConsist.add(2, "Pantry Car");
        System.out.println("After adding Pantry Car at position 2: " + trainConsist);

        // 4. Remove the first and last bogie
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard
        System.out.println("After removing first and last bogies: " + trainConsist);

        // 5. Display final ordered train consist
        System.out.println("Final ordered train consist: " + trainConsist);

        System.out.println("\nTrain consist maintained with physical sequence using LinkedList.");
    }
}