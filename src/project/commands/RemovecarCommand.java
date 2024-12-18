package project.commands;

import project.service.ParkingLot;

public class RemovecarCommand implements ICommand {
    private ParkingLot parkingLot;

    public RemovecarCommand(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void execute(String[] args){
        int slotnum = Integer.parseInt(args[1]);
        parkingLot.removeCar(slotnum);

    }
}
