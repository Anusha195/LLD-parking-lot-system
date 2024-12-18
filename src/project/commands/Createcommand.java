package project.commands;
import project.service.ParkingLot;

public class Createcommand implements ICommand{
    private ParkingLot parkingLot;

    public Createcommand(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }
    public void execute(String[] args){
        int capacity =Integer.parseInt(args[1]);
        parkingLot.create(capacity);
    }   
}
