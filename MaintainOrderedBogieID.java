import java.util.LinkedList;

// Class definition for Train Consist Management Application
public class TrainConsistUC4 {

    // Main method - Entry point of the Java application
    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies using addFirst() and addLast()
        trainConsist.addFirst("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Step 3: Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Step 4: Remove the first bogie
        trainConsist.removeFirst();

        // Step 5: Remove the last bogie
        trainConsist.removeLast();

        // Step 6: Display final ordered train consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);
    }
}
