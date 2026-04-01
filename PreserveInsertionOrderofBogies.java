import java.util.LinkedHashSet;

// Class definition for Train Consist Management Application
public class TrainConsistUC5 {

    // Main method - Entry point of the Java application
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Attach bogies to the train
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // Duplicate

        // Step 4: Display final formation order
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);
    }
}
