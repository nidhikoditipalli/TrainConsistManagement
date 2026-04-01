import java.util.HashSet;

// Class definition for Train Consist Management Application
public class TrainConsistUC3 {

    // Main method - Entry point of the Java application
    public static void main(String[] args) {

        // Step 1: Create HashSet for storing unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIDs.add("B101");
        bogieIDs.add("B102");
        bogieIDs.add("B103");
        bogieIDs.add("B101"); // Duplicate
        bogieIDs.add("B102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs in the Train:");
        System.out.println(bogieIDs);

        // Program continues
        System.out.println("\nProgram continues...");
    }
}
