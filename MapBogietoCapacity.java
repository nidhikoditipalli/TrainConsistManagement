import java.util.HashMap;
import java.util.Map;

// Class definition for Train Consist Management Application
public class TrainConsistUC6 {

    // Main method - Entry point of the Java application
    public static void main(String[] args) {

        // Step 1: Create HashMap for bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogie capacities using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Step 3: Iterate through the map using entrySet()
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(
                "Bogie: " + entry.getKey() +
                " | Capacity: " + entry.getValue()
            );
        }

        // Program continues
        System.out.println("\nProgram continues...");
    }
}
