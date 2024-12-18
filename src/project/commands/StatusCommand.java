package project.commands;
import project.service.*;

public class StatusCommand implements ICommand{
    private ParkingLot parkingLot;

    public StatusCommand(ParkingLot parkingLot){
        this.parkingLot = parkingLot;
    }

    public void execute(String[] args){
        parkingLot.status();
    }
}
