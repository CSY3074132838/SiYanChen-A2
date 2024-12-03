public class AssignmentTwo {
    public static void main(String[] args) {
        System.out.println("Part Three：Create objects for employees and visitors and display their information");
        Employee employee = new Employee("Max Harrison", 30, "32 George Street, The Rocks, Sydney, NSW 2000", "E123", "Driver");
        Visitor visitor = new Visitor("Charlotte Johnson", 25, "57 Pitt Street, Sydney, NSW 2000", "V456", "Annual Pass for Amusement Parks");
        System.out.println("Worker: " + employee.getName() + ", " + employee.getPosition());
        System.out.println("Visitor: " + visitor.getName() + ", " + visitor.getMembershipType());

        System.out.println("Part IVA: Display of the state of the rides");
        Employee operator = new Employee("Liam Williams", 35, "5 Martin Place, Sydney, NSW 2000", "E789", "caretakers");
        Ride ride = new Ride("roller coaster", true, operator);
        System.out.println("Name of Amusement Rides: " + ride.getRideName() + ", Open or not: " + (ride.isOpen() ? "True" : "False"));
       
        ride.addVisitorToQueue(visitor);
        System.out.println("Added visitor " + visitor.getName() + " to the queue for " + ride.getRideName());
        ride.printQueue(); 

        System.out.println("Part IVB: Displaying Employee Information");
        Employee employee2 = new Employee("Ava Brown", 28, "12 Crown Street, Surry Hills, Sydney, NSW 2010", "E101", "maintenance man");
        System.out.println("Employee Name: " + employee2.getName() + ", appointment: " + employee2.getPosition());

        System.out.println("Section V: Display of visitor information");
        Visitor visitor2 = new Visitor("Jackson Davis", 22, "33 Macquarie Street, Circular Quay, Sydney, NSW 2000", "V202", "general admission ticket");
        System.out.println("Visitor Name: " + visitor2.getName() + ", membershipType: " + visitor2.getMembershipType());

        System.out.println("Part VI: Modelling the operation of an amusement ride");
        Employee operator2 = new Employee("Noah Wilson", 32, "40 Eliza Street, Newtown, Sydney, NSW 2042", "E303", "operator");
        Ride ride2 = new Ride("water rafting", false, operator2);
        System.out.println("Name of Amusement Rides: " + ride2.getRideName() + ", Open or not: " + (ride2.isOpen() ? "True" : "False"));
       
        ride2.runOneCycle(); 
        ride2.printQueue(); 

        System.out.println("Part VII: Demonstrating Complete Employee-Visitor Interaction");
        Employee employee3 = new Employee("Ethan Thompson", 40, "42 Acacia Street, Bondi Beach, New South Wales, 2026, Australia", "E404", "supervisors");
        Visitor visitor3 = new Visitor("Liam Murphy", 18, "105 Ocean Boulevard, Gold Coast, Queensland, 4217, Australia", "V505", "VIP");
        System.out.println("Staff interaction with visitors: " + employee3.getName() + " and " + visitor3.getName() + " are talking to each other.");

        ride.addVisitorToQueue(visitor3);
        ride.printQueue();  

        ride.addVisitorToHistory(visitor3); 
        System.out.println("Visitor " + visitor3.getName() + " in ride history: " + ride.checkVisitorFromHistory(visitor3));
        ride.printRideHistory(); 
    }
}
