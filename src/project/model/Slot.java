package project.model;

public class Slot implements ISlot{
    private int slotnum;
    private Car car;
    public Slot(final int slotnum){
        this.slotnum=slotnum;
    }
    public int getSlotNum(){
        return slotnum;
    }
    public Car getCar(){
        return car;
    }
    public boolean isFree(){
        return car==null;
    }
    public void assignCar(Car car){
        this.car=car;
    }
    public void unassignCar(){
        this.car=null;
    }
}
