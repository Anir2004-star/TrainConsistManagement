import java.util.ArrayList;
import java.util.List;

// Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " | Cargo: " + cargo;
    }
}

// Main Class
public class Usecase12TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC12) ===");

        // Step 1: Create goods bogies list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Display bogies
        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // Step 3: Safety check using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.getType().equals("Cylindrical") ||
                                b.getCargo().equals("Petroleum")
                );

        // Step 4: Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is UNSAFE ❌");
        }

        System.out.println("\nSystem ready for further processing...");
    }
}