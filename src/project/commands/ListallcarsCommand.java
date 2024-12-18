package project.commands;

import project.service.ParkingLot;

public class ListallcarsCommand implements ICommand {
    private ParkingLot parkingLot;

    public ListallcarsCommand(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }
    public void execute(String[] args){
        parkingLot.listAllcars();
    }
}
