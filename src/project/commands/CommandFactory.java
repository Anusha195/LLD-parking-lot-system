package project.commands;

import java.util.*;
import project.service.*;

public class CommandFactory {
    private final Map<String, ICommand> commands = new HashMap<>();

    public CommandFactory(ParkingLot parkingLot) {
        commands.put("create_parking_lot", new Createcommand(parkingLot));
        commands.put("park", new ParkcarCommand(parkingLot));
        commands.put("remove", new RemovecarCommand(parkingLot));
        commands.put("status", new StatusCommand(parkingLot));
        commands.put("update_capacity", new UpdateCapacityCommand(parkingLot));
        commands.put("exit", new ExitCommand());
        commands.put("display_earnings", new DisplayEarningsCommand(parkingLot));
        commands.put("list_all_cars", new ListallcarsCommand(parkingLot));
        commands.put("Total_available_slots", new TotalavailableslotsCommand(parkingLot));
        commands.put("slotnum_for_reg_no", new GetslotByRegnoCommand(parkingLot));
    }

    public void executeCommand(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];
        if (commands.containsKey(command)) {
            commands.get(command).execute(parts);
        } else {
            System.out.println("Invalid command: " + command);
        }
    }
}
