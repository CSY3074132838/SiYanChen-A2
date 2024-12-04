import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;  
    private boolean isOpen;   
    private Employee operator; 
    private int maxRiders;   
    private List<Visitor> visitorQueue;  
    private List<Visitor> rideHistory;   
    private int numOfCycles;  

  
    public Ride(String rideName, boolean isOpen, Employee operator, int maxRiders) {
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
        this.maxRiders = maxRiders;
        this.visitorQueue = new ArrayList<>();
        this.rideHistory = new ArrayList<>();
        this.numOfCycles = 0;
    }

    
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor != null) {
            rideHistory.add(visitor);  
            System.out.println("Visitor added to ride history: " + visitor.getName());
        } else {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
    }

   
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor != null) {
            visitorQueue.add(visitor);  
            System.out.println("Visitor added to queue: " + visitor.getName());
        } else {
            throw new IllegalArgumentException("Visitor cannot be null");
        }
    }


    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitorQueue.remove(visitor)) {
            System.out.println("Visitor " + visitor.getName() + " removed from queue.");
        } else {
            System.out.println("Visitor " + visitor.getName() + " not in queue.");
        }
    }


    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue for " + rideName + " is empty.");
        } else {
            System.out.println(rideName + " queue:");
            for (Visitor visitor : visitorQueue) {
                System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
            }
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("Cannot run " + rideName + " without an operator.");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("Queue is empty, cannot run " + rideName + ".");
            return;
        }

        System.out.println("Running one cycle of " + rideName + "...");
        int riders = Math.min(maxRiders, visitorQueue.size());
        for (int i = 0; i < riders; i++) {
            Visitor visitor = visitorQueue.remove(0);
            rideHistory.add(visitor);
            System.out.println(visitor.getName() + " is experiencing " + rideName + ".");
        }
        
        numOfCycles++;
        System.out.println("This ride has been operational for " + numOfCycles + " cycles.");
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println(rideName + "'s history is empty.");
        } else {
            System.out.println(rideName + " historical records:");
            for (Visitor visitor : rideHistory) {
                System.out.println(visitor.getName() + " (" + visitor.getTicketNumber() + ")");
            }
        }
    }

    @Override
    public void sortRideHistory() {
        Collections.sort(rideHistory, (v1, v2) -> {
            int nameComparison = v1.getName().compareTo(v2.getName());  // 按姓名排序
            if (nameComparison == 0) {
                return v1.getTicketNumber().compareTo(v2.getTicketNumber());  // 如果姓名相同，再按票号排序
            }
            return nameComparison;
        });
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
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

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }
}


