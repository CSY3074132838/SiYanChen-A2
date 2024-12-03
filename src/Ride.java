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
        queue.add(visitor);
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        queue.remove(visitor);
    }

    @Override
    public void printQueue() {
        System.out.println("Visitor queues：");
        for (Visitor visitor : queue) {
            System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
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
        rideHistory.add(visitor);
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
        System.out.println("History of Amusement Rides：");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
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

