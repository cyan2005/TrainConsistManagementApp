import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainConsistAppUC7 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App (UC7) ===\n");

        // 1. Initialize a list to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // 2. Add bogies with capacities
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));

        // 3. Display unsorted list
        System.out.println("Unsorted passenger bogies:");
        passengerBogies.forEach(System.out::println);

        // 4. Sort by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 5. Display sorted list
        System.out.println("\nPassenger bogies sorted by capacity (ascending):");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nComparator allows custom sorting based on business logic.");
    }
}