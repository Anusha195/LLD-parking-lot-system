package project.commands;

import project.service.ParkingLot;

public class UpdateCapacityCommand implements ICommand{
    private ParkingLot parkingLot;

    public UpdateCapacityCommand(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public void execute(String[] args){
        int newcapacity=Integer.parseInt(args[1]);
        parkingLot.updateCapacity(newcapacity);
    }
}
