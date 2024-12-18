package project.model;
import java.time.LocalDateTime;

public class ParkingTicket {
    private Car car;
    private LocalDateTime startTime;

    public ParkingTicket(Car car){
        this.car=car;
        this.startTime=LocalDateTime.now();
    }
    public Car getCar() {
        return car;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public long calculateFees(double hourlyRate) {
        LocalDateTime now = LocalDateTime.now();
        long hoursParked = java.time.Duration.between(startTime, now).toHours();
        return (hoursParked > 0 ? hoursParked : 1) * (long) hourlyRate; 
    }
}
