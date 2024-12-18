package project.commands;

import project.service.ParkingLot;

public class TotalavailableslotsCommand implements ICommand{
    private ParkingLot parkingLot;
    public TotalavailableslotsCommand(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public void execute(String[] args){
        parkingLot.totalAvailableSlots();
    }
}
