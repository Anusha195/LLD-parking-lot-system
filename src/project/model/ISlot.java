package project.model;

public interface ISlot {
    boolean isFree();
    void assignCar(Car car);
    void unassignCar();
    ICar getCar();
    int getSlotNum();
}
