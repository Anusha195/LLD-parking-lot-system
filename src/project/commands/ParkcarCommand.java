package project.commands;
import project.model.*;
import project.service.ParkingLot;

public class ParkcarCommand implements ICommand{
    private ParkingLot parkingLot;
    public ParkcarCommand(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }
    public void execute(String[] args){
        String Regno=args[1];
        String color=args[2];
        Car car=new Car(Regno , color);
        parkingLot.parkCar(car);
    }
}
