import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Custom Bogie class
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Method to display bogie details
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

// Main class
public class TrainConsistUC7 {

    // Main method - Entry point
    public static void main(String[] args) {

        // Step 1: Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies with capacities
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Sort bogies using Comparator based on capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by seating capacity:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Program continues
        System.out.println("\nProgram continues...");
    }
}
