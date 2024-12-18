package project.service;
import project.exceptions.*;
import java.util.HashMap;
import java.util.Map;

import project.model.*;;

public class ParkingLot implements IParkingLot{
    private int capacity;
    private HashMap<Integer, ParkingTicket> slots;
    private double hourlyRate = 10.0; 
    private long totalEarnings = 0;

    public ParkingLot(){
        this.slots=new HashMap<>();
    }
    private int findAvailableSlot() {
        for (int i = 1; i <= capacity; i++) {
            if (!slots.containsKey(i)) return i;
        }
        throw new ParkingLotException("No available slots.");
    }
    public void create(int capacity){
        if(capacity<=0) throw new ParkingLotException("Invalid capacity provided.");
        this.capacity=capacity;
        System.out.println("Created a parking lot with " + capacity + " slots");
    }
    public void parkCar(Car car) {
        if (slots.size() >= capacity) {
            throw new ParkingLotException("Sorry, parking lot is full");
        }
        int slot = findAvailableSlot();
        slots.put(slot, new ParkingTicket(car));
        System.out.println("Allocated slot number: " + slot);
    }
    public void removeCar(int slotnum){
        if(!slots.containsKey(slotnum)) throw new ParkingLotException("Sorry there is no car in this slot check once again");
        ParkingTicket ticket=slots.remove(slotnum);
        Long fees=ticket.calculateFees(hourlyRate);
        totalEarnings+=fees;
        System.out.println("The slot "+slotnum+" is free.Parkingfee : "+fees);
    }
    public void status(){
        System.out.println("S.No  RegistrationNo  Color");
        slots.forEach((slot,ticket)->System.out.println(slot +" "+ticket.getCar().getRegno()+" "+ticket.getCar().getColor()));
    }
    public void totalAvailableSlots(){
        System.out.println("Available numof slots are " + (capacity-slots.size()));
    }
    public void listAllcars() {
        slots.forEach((slot, ticket) -> System.out.println(
                "Slot " + slot + ": " + ticket.getCar().getRegno()));
    }
    public void displayEarnings(){
        System.out.println("Total earnings are "+totalEarnings);
    }
    public void updateCapacity(int newCapacity){
        if(newCapacity < slots.size()) throw new ParkingLotException("cannot reduce capacity below currently occupied slots");
        this.capacity=newCapacity;
        System.out.println("Upadated the capacity to "+newCapacity);
    }
    public void slotnum_for_reg_no(String reg_no){
        Integer k=null;
        for (Map.Entry<Integer, ParkingTicket> entry : slots.entrySet()) {
            if (entry.getValue().getCar().getRegno().equals(reg_no)) {
                k = entry.getKey();
                break;
            }
        }
        System.out.println("The slotnum for the reg_no "+reg_no+" is "+k);
    }
}
