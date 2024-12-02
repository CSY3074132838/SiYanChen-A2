public class Ride {
    private String rideName;
    private boolean isOpen;
    private Employee operator;

    public Ride() {}

    public Ride(String rideName, boolean isOpen, Employee operator) {
        this.rideName = rideName;
        this.isOpen = isOpen;
        this.operator = operator;
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
