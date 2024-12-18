
import project.commands.CommandFactory;
import project.service.ParkingLot;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(); // Correct instantiation of ParkingLot
        CommandFactory commandFactory = new CommandFactory(parkingLot);

        System.out.println("Welcome to the Automated Parking Lot System!");
        System.out.println("Type 'exit' to terminate the system.");
        while (true) {
            System.out.print("Enter Command: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Parking Lot System. Goodbye!");
                break;
            }
            try {
                commandFactory.executeCommand(input);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
