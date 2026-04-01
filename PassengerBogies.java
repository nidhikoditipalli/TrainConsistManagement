import java.util.ArrayList;

// Class definition for Train Consist Management Application
public class TrainConsistUC2 {

    // Main method - Entry point of the Java application
    public static void main(String[] args) {

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Print list after insertion
        System.out.println("Passenger Bogies after insertion:");
        System.out.println(passengerBogies);

        // Step 4: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 5: Check existence of Sleeper
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does not exist.");
        }

        // Step 6: Print final list state
        System.out.println("\nFinal list of passenger bogies:");
        System.out.println(passengerBogies);

        // Program continues
        System.out.println("\nProgram continues...");
    }
}
