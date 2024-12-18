package project.service;
import project.model.*;

public interface IParkingLot {
    void create(int capacity);
    void parkCar(Car car);
    void removeCar(int slotnum);
    void status();
    void totalAvailableSlots();
    void listAllcars();
    void displayEarnings();
    void updateCapacity(int newCapacity);
    void slotnum_for_reg_no(String reg_no);
}
