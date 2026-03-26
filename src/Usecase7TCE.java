import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    @Override
    public String toString() {
        return name + " | Capacity: " + capacity;
    }
}

// Main Class
public class Usecase7TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC7) ===");

        // Step 1: Create List
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 3: Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 4: Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 5: Display after sorting
        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem ready for further processing...");
    }
}