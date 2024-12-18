## Problem Statement: Automated Parking Lot System
You own a parking lot that can hold up to 'n' cars at any given point in time. Each slot is given a number starting from 1 and increases sequentially with increasing distance from the entry point. You want to create an automated ticketing system to allow customers to use the parking lot without human intervention.

## When a car enters the parking lot:

1. A ticket is issued to the driver.
2. The ticket documents the registration number (number plate) and color of the car.
3. An available parking slot is allocated to the car, prioritized by the slot nearest to the entry point.
4. It is assumed that customers always park their cars in the allocated slot.
When a car exits the parking lot, the customer returns the ticket, and the system marks the slot as available. The system calculates the parking fee based on the duration the car was parked. The parking fee is set at ₹10 per hour.

## Government Regulations
The system should provide the following features:

* Find registration numbers of all cars of a particular color.
* Find the slot number in which a car with a given registration number is parked.
* Find all slot numbers where cars of a particular color are parked.
* Display total available slots in the parking lot.
* Calculate and display total earnings from parking fees.
* List all parked cars with their slot number, registration number, and color.
* Update the parking lot capacity dynamically (e.g., increase or decrease slots as needed).


### Example: Interactive
Assuming a parking lot with 6 slots, the following commands should be run in
sequence by typing them in at a prompt and should produce output as described
below the command. Note that `exit` terminates the process and returns control to
the shell.


Welcome to the Automated Parking Lot System!
Type 'exit' to terminate the system.
$Enter Command: create_parking_lot 5  
Created a parking lot with 5 slots  

$Enter Command: park AH-01-SU-4534 White  
Allocated slot number: 1  

$Enter Command: park SH-02-AU-9245 White  
Allocated slot number: 2  

$Enter Command: park US-02-HA-2201 Black  
Allocated slot number: 3  

$Enter Command: park US-01-AH-7467 Red  
Allocated slot number: 4  

$Enter Command: park HA-01-US-2762 Blue  
Allocated slot number: 5    

$Enter Command: remove 3  
The slot 3 is free. Parkingfee : 10 

$Enter Command: status  
S.No  RegistrationNo  Color
1 AH-01-SU-4534 White
2 SH-02-AU-9245 White
4 US-01-AH-7467 Red
5 HA-01-US-2762 Blue 

$ park AH-01-SU-4543 White  
Allocated slot number: 3  

$ park AH-12-SU-9999 White  
Sorry, parking lot is full  

$Total_available_slots
Available numof slots are 0

$Enter Command: list_all_cars
Slot 1: AH-01-SU-4534
Slot 2: SH-02-AU-9245
Slot 3: AH-01-SU-4543
Slot 4: US-01-AH-7467
Slot 5: HA-01-US-2762

$Enter Command: display_earnings
Total earnings are 10

$Enter Command: update_capacity 4 
Error: cannot reduce capacity below currently occupied slots

$Enter Command: update_capacity 10
Upadated the capacity to 10

$Enter Command: exit
Exiting Parking Lot System. Goodbye!