import java.io.File;

public class AssignmentTwo {
    public static void partFive() {
        System.out.println("Part Five: Ride operation and visitor management");

        Employee operator = new Employee("Liam Williams", 35, "5 Martin Place, Sydney, NSW 2000", "E789", "caretaker");

        Ride ride = new Ride("Roller Coaster", true, operator, 3);  

        Visitor visitor1 = new Visitor("Charlotte Johnson", 25, "57 Pitt Street, Sydney, NSW 2000", "V456", "Annual Pass for Amusement Parks");
        Visitor visitor2 = new Visitor("Jackson Davis", 22, "33 Macquarie Street, Circular Quay, Sydney, NSW 2000", "V202", "General admission ticket");
        Visitor visitor3 = new Visitor("Ava Brown", 28, "12 Crown Street, Surry Hills, Sydney, NSW 2010", "V303", "VIP ticket");
        Visitor visitor4 = new Visitor("Ethan Thompson", 40, "42 Acacia Street, Bondi Beach, NSW 2026", "V404", "One-day Pass");
        Visitor visitor5 = new Visitor("Liam Murphy", 18, "105 Ocean Boulevard, Gold Coast, QLD 4217", "V505", "VIP");
        Visitor visitor6 = new Visitor("Sophia Green", 32, "78 King Street, Melbourne, VIC 3000", "V606", "Annual Pass");
        Visitor visitor7 = new Visitor("Olivia Taylor", 24, "29 Collins Street, Melbourne, VIC 3000", "V707", "VIP");
        Visitor visitor8 = new Visitor("Mason Harris", 35, "56 Queens Road, Melbourne, VIC 3000", "V808", "One-Day Pass");
        Visitor visitor9 = new Visitor("Lucas Wilson", 30, "16 High Street, Melbourne, VIC 3000", "V909", "General Admission");
        Visitor visitor10 = new Visitor("Aiden Clark", 28, "100 Swanston Street, Melbourne, VIC 3000", "V1010", "VIP");

        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        System.out.println("All tourists in the queue：");
        ride.printQueue();

        ride.runOneCycle();

        System.out.println("Visitors in the queue after the cycle has run：");
        ride.printQueue();

        System.out.println("All visitors in history：");
        ride.printRideHistory();
    }

     public static void partSix() {
        System.out.println("Part Six: Export ride history");

        Employee operator = new Employee("Max Harrison", 30, "32 George Street, The Rocks, Sydney, NSW 2000", "E123", "Driver");

        Ride rollerCoaster = new Ride("Roller Coaster", true, operator, 5);

        Visitor v1 = new Visitor("Charlotte Johnson", 25, "57 Pitt Street, Sydney, NSW 2000", "V456", "Annual Pass for Amusement Parks");
        Visitor v2 = new Visitor("Jackson Davis", 22, "33 Macquarie Street, Circular Quay, Sydney, NSW 2000", "V202", "general admission ticket");
        Visitor v3 = new Visitor("Ava Brown", 28, "12 Crown Street, Surry Hills, Sydney, NSW 2010", "V303", "VIP ticket");
        Visitor v4 = new Visitor("Ethan Thompson", 40, "42 Acacia Street, Bondi Beach, New South Wales, 2026", "V404", "One-day Pass");
        Visitor v5 = new Visitor("Liam Murphy", 18, "105 Ocean Boulevard, Gold Coast, Queensland, 4217", "V505", "VIP");

        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);
         String filename = "ride_history.txt";
         rollerCoaster.exportRideHistory(filename);
        System.out.println("Before exporting ride history:");
        rollerCoaster.printRideHistory();

        
    }
    public static void partSeven() {
        System.out.println("Part Seven: Import ride history");

        // Create a new Ride
        Employee operator = new Employee("Max Harrison", 30, "32 George Street, The Rocks, Sydney, NSW 2000", "E123", "Driver");
        Ride rollerCoaster = new Ride("Roller Coaster", true, operator, 5);

        // Import ride history from the file
        String filename = "ride_history.txt";
        rollerCoaster.importRideHistory(filename);

        System.out.println("After importing ride history:");
        rollerCoaster.printRideHistory();
    }

    public static void main(String[] args) {
//        System.out.println("Part IV B: Sort visitors by name and ticket number");
//
//        Employee operator = new Employee("Liam Williams", 35, "5 Martin Place, Sydney, NSW 2000", "E789", "caretaker");
//        Ride ride = new Ride("Roller Coaster", true, operator, 0 );
//
//        Visitor visitor1 = new Visitor("Charlotte Johnson", 25, "57 Pitt Street, Sydney, NSW 2000", "V456", "Annual Pass for Amusement Parks");
//        Visitor visitor2 = new Visitor("Jackson Davis", 22, "33 Macquarie Street, Circular Quay, Sydney, NSW 2000", "V202", "general admission ticket");
//        Visitor visitor3 = new Visitor("Ava Brown", 28, "12 Crown Street, Surry Hills, Sydney, NSW 2010", "V303", "VIP ticket");
//        Visitor visitor4 = new Visitor("Ethan Thompson", 40, "42 Acacia Street, Bondi Beach, New South Wales, 2026", "V404", "One-day Pass");
//        Visitor visitor5 = new Visitor("Liam Murphy", 18, "105 Ocean Boulevard, Gold Coast, Queensland, 4217", "V505", "VIP");
//
//        ride.addVisitorToHistory(visitor1);
//        ride.addVisitorToHistory(visitor2);
//        ride.addVisitorToHistory(visitor3);
//        ride.addVisitorToHistory(visitor4);
//        ride.addVisitorToHistory(visitor5);
//
//        System.out.println("Historical records of the original rides:");
//        ride.printRideHistory();
//
//        ride.sortRideHistory();
//
//        System.out.println("\nSorted ride history:");
//        ride.printRideHistory();
//
//        System.out.println("\nPart III: Creating Employee and Visitor Objects and Displaying Their Information");
//
//        Employee employee = new Employee("Max Harrison", 30, "32 George Street, The Rocks, Sydney, NSW 2000", "E123", "Driver");
//        System.out.println("employees: " + employee.getName() + ", positions: " + employee.getPosition());
//
//        Visitor visitor = new Visitor("Charlotte Johnson", 25, "57 Pitt Street, Sydney, NSW 2000", "V456", "Annual Pass for Amusement Parks");
//        System.out.println("visitor: " + visitor.getName() + ", membership Type: " + visitor.getMembershipType());
//
//        System.out.println("\nPart IVA: Display the status of the rides");
//
//        Employee operatorForRide = new Employee("Liam Williams", 35, "5 Martin Place, Sydney, NSW 2000", "E789", "caretaker");
//        Ride rideForStatus = new Ride("Roller Coaster", true, operatorForRide, 0);
//        System.out.println("Name of Amusement Ride: " + rideForStatus.getRideName() + ", open or not: " + (rideForStatus.isOpen() ? "True" : "False"));
//
//        rideForStatus.addVisitorToQueue(visitor1);
//        rideForStatus.addVisitorToQueue(visitor2);
//        rideForStatus.addVisitorToQueue(visitor3);
//        rideForStatus.addVisitorToQueue(visitor4);
//        rideForStatus.addVisitorToQueue(visitor5);
//        System.out.println("5 visitors have been added to the queue.");
//
//        rideForStatus.printQueue();
//
//        rideForStatus.runOneCycle();
//
//        rideForStatus.removeVisitorFromQueue(visitor3);
//        System.out.println("Visitor " + visitor3.getName() + " removed from queue.");
//
//        rideForStatus.printQueue();
//
//        System.out.println("\nPart IV B: Displaying Employee Information");
//
//        Employee employee2 = new Employee("Ava Brown", 28, "12 Crown Street, Surry Hills, Sydney, NSW 2010", "E101", "maintenance man");
//        System.out.println("Employee Name: " + employee2.getName() + ", position: " + employee2.getPosition());
//
//        System.out.println("\nPart V: Displaying Visitor Information");
//
//        Visitor visitor6 = new Visitor("Jackson Davis", 22, "33 Macquarie Street, Circular Quay, Sydney, NSW 2000", "V202", "general admission ticket");
//        System.out.println("Visitor name: " + visitor6.getName() + ", Membership Type: " + visitor6.getMembershipType());
//
//        System.out.println("\nPart VI: Operation of simulated rides");
//
//        Employee operatorForRide2 = new Employee("Noah Wilson", 32, "40 Eliza Street, Newtown, Sydney, NSW 2042", "E303", "operator");
//        Ride rideForOperation = new Ride("Water Rafting", false, operatorForRide2, 0);
//        System.out.println("Name of Amusement Rides: " + rideForOperation.getRideName() + ", open or not: " + (rideForOperation.isOpen() ? "True" : "False"));
//
//        rideForOperation.runOneCycle();
//        rideForOperation.printQueue();
//
//        System.out.println("\nPart VII: Complete Employee-Visitor Interaction Presentation");
//
//        Employee employee3 = new Employee("Ethan Thompson", 40, "42 Acacia Street, Bondi Beach, New South Wales, 2026", "E404", "supervisor");
//        Visitor visitor7 = new Visitor("Liam Murphy", 18, "105 Ocean Boulevard, Gold Coast, Queensland, 4217", "V505", "VIP");
//        System.out.println("Staff and visitor interaction: " + employee3.getName() + " and " + visitor7.getName() + " are talking.");
//
//        rideForOperation.addVisitorToQueue(visitor7);
//        rideForOperation.printQueue();
//
//        rideForOperation.addVisitorToHistory(visitor7);
//        System.out.println("Visitor " + visitor7.getName() + " Is it in the ride history: " + rideForOperation.checkVisitorFromHistory(visitor7));
//        rideForOperation.printRideHistory();
//        System.out.println("Number of visitors in the amusement ride history: " + rideForOperation.numberOfVisitors());
//
//        partFive();

        partSix();
        partSeven();
    }
}


