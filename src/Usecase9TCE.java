import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
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
public class Usecase9TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC9) ===");

        // Step 1: Create list (reuse UC7/UC8)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56));

        // Step 2: Display original list
        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Group by bogie type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Step 4: Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (String type : groupedBogies.keySet()) {
            System.out.println("\n" + type + ":");
            for (Bogie b : groupedBogies.get(type)) {
                System.out.println(b);
            }
        }

        System.out.println("\nSystem ready for further processing...");
    }
}