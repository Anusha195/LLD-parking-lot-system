package project.commands;

import project.service.ParkingLot;

public class DisplayEarningsCommand implements ICommand {
    private ParkingLot parkingLot;

    public DisplayEarningsCommand(ParkingLot parkingLot){
        this.parkingLot =parkingLot;

    }

    public void execute(String[] args){
        parkingLot.displayEarnings();
    }
    
}
