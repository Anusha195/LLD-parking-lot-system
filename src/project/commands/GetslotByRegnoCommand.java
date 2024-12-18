package project.commands;

import project.service.ParkingLot;

public class GetslotByRegnoCommand implements ICommand {
    private ParkingLot parkingLot;

    public GetslotByRegnoCommand(ParkingLot parkingLot){
        this.parkingLot=parkingLot;
    }

    public void execute(String[] args){
        String s=args[1];
        parkingLot.slotnum_for_reg_no(s);
    }
}
