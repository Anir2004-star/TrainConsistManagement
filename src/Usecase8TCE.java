import java.util.ArrayList;
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
public class Usecase8TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC8) ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Stream filter (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .toList();   // ✅ modern Java (Java 16+)

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nSystem ready for further processing...");
    }
}