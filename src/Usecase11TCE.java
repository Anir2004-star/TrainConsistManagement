import java.util.Scanner;
import java.util.regex.Pattern;

// Main Class
public class Usecase11TCE {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC11) ===");

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Validate using Pattern
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // Step 4: Display result
        if (isTrainValid) {
            System.out.println("Train ID is VALID ✅");
        } else {
            System.out.println("Train ID is INVALID ❌");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID ✅");
        } else {
            System.out.println("Cargo Code is INVALID ❌");
        }

        System.out.println("\nSystem ready for further processing...");
        sc.close();
    }
}