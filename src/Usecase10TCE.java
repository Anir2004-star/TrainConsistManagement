import java.util.ArrayList;
import java.util.List;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " | Capacity: " + capacity;
    }
}

// Main Class
public class Usecase10TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC10) ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Display bogies
        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // Step 3: Calculate total seats using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.getCapacity())     // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // Step 4: Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nSystem ready for further processing...");
    }
}