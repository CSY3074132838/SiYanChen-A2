import java.util.LinkedList;
import java.util.List;


public class Ride implements RideInterface {
    private String rideName;  
    private boolean isOpen;   
    private Employee operator; 
    private List<Visitor> queue;  
    private List<Visitor> rideHistory;  

    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String rideName, boolean isOpen, Employee operator) {
        this();
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            queue.add(visitor);  
            System.out.println("Traveller " + visitor.getName() + " successfully joined " + rideName + " of the queue.");
        } else {
            System.out.println("Visitor information is invalid and cannot be added to the queue.");
        }
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (queue.remove(visitor)) { 
            System.out.println("Traveller " + visitor.getName() + " have passed away from " + rideName + " removed from the queue.");
        } else {
            System.out.println("Traveller " + visitor.getName() + " not in the queue and cannot be removed.");
        }
    }

    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("There are currently no tourists in " + rideName + " in the queue");
        } else {
            System.out.println(rideName + " Queues for amusement rides：");
            for (Visitor visitor : queue) {
                System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (isOpen && !queue.isEmpty()) {
            Visitor visitor = queue.remove(0);  
            System.out.println(visitor.getName() + " Experiencing " + rideName);
            addVisitorToHistory(visitor);  
        } else {
            System.out.println("Rides are not open or queues are empty for operation.");
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " added to " + rideName + " in the history of the.");
        }
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("Amusement facilities " + rideName + " no history is available.");
        } else {
            System.out.println("Amusement facilities " + rideName + " historical records：");
            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
            }
        }
    }


    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}

