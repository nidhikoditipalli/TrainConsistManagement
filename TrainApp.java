import java.util.ArrayList;
import java.util.List;

// Class definition for Train Consist Management App
public class TrainConsistApp {

    // Main method - entry point of the Java application
    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Dynamic initialization of an empty list using ArrayList
        List<String> bogieList = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + bogieList.size());

        // Program continues
        System.out.println("Program is running...");
    }
}
