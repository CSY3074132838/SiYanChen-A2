public class Visitor extends Person {
    private String name;
    private String ticketNumber;
    private String membershipType;

    public Visitor() {}

    public Visitor(String name, int age, String address, String ticketNumber, String membershipType) {
        super(name, age, address);
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.membershipType = membershipType;
    }

    public String getNmae(){
        return name;
    }
    
    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }
}

