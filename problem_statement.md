***Automated Parking Lot System

**Introduction
The Automated Parking Lot System is a software application that manages a parking lot of configurable capacity. It facilitates the allocation of parking slots, calculates parking fees, provides real-time status updates, and supports dynamic capacity adjustments. The system is designed to operate without human intervention and ensures compliance with regulatory requirements

**Features
1. Parking Lot Creation
•	Command: create_parking_lot <capacity>
•	Description: Initializes a parking lot with the specified number of slots.
•	Output:
 Created a parking lot with <capacity> slots.
2. Parking a Car
•	Command: park <registration_number> <color>
•	Description: Allocates the nearest available parking slot to the car and issues a parking ticket.
•	Output:
	Allocated slot number: <slot_number>
	If full: Sorry, parking lot is full.
3. Removing a Car
•	Command: remove <slot_number>
•	Description: Frees the specified parking slot and calculates the parking fee based on the duration.
•	Output:
	Slot number <slot_number> is free. Parking fee: ₹<fee>

4. Parking Lot Status
•	Command: status
•	Description: Displays the current status of the parking lot, including slot number, registration number, and car color.

•	Output               
                          S.No  RegistrationNo  Color
1  AH-01-SU-4534  White
2  SH-02-AU-9245  White
3  SU-67-AH-8589  Green
5. Total Available Slots
•	Command: total_available_slots
•	Description: Displays the number of currently available slots.
•	Output:
	Available slots: <count>

6. Parking Fee Earnings
•	Command: display_earnings
•	Description: Displays the total earnings from parking fees.
•	Output:
	Total earnings: ₹<amount>

7. Update Parking Lot Capacity
•	Command: update_capacity <new_capacity>
•	Description: Updates the parking lot capacity dynamically.
•	Output:
	If successful: Updated capacity to <new_capacity>
	If unsuccessful: Cannot reduce capacity below currently occupied slots.
8. Find Slot by Registration Number
•	Command: slot_number_for_registration_number <registration_number>
•	Description: Retrieves the slot number for the car with the specified registration number.
•	Output:
	If found: The slotnum for the reg_no  is  <slotnum>
	If not found : The slotnum for the reg_no  is  null

9. Exit the System
•	Command: exit
•	Description: Terminates the parking lot system gracefully.
•	Output:
	Exiting Parking Lot System. Goodbye!

10. Parking Fee Calculation
•	Rate: ₹10 per hour.
•	Logic: Fees are calculated based on the time the car was parked. Parking duration is rounded to the nearest hour.

**Example Interaction
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

$Enter Command: display_earnings
Total earnings are 10

$Enter Command: update_capacity 4 
Error: cannot reduce capacity below currently occupied slots

$Enter Command: update_capacity 10
Upadated the capacity to 10

$Enter Command: slotnum_for_reg_no US-01-AH-7467
The slotnum for the US-01-AH-7467 is 4

$Enter Command: exit
Exiting Parking Lot System. Goodbye!

**System Design
Modules
1.	Main Module:
	Handles user input and delegates commands to the system.
2.	Parking Lot Service:
	Manages parking lot operations like parking, leaving, and updating capacity.
3.	Command Processor:
	Processes user commands and invokes the appropriate service methods.
4.	Car and Ticket Models:
	Represents the car and ticket entities used in the system.
5.	Exception Handling:
	Handles errors such as invalid commands, full parking lot, or invalid slot numbers.

**Extensibility
This system is designed to be extensible. Future enhancements may include:
1.	Dynamic Pricing Models: Add support for variable pricing rates based on time of day or vehicle type.
2.	Multiple Parking Lots: Manage multiple parking lots from a single system.
3.	Integration with Payment Gateways: Allow customers to pay parking fees online.
4.	Reservation System: Enable users to reserve slots in advance.
5.	Vehicle Type Management: Support for different types of vehicles like bikes, trucks, etc.

**Conclusion
The Automated Parking Lot System simplifies parking management by automating ticketing, tracking, and fee calculation. Its dynamic features and extensibility make it a robust solution for modern parking requirements.

