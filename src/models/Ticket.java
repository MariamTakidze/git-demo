package models;

public class Ticket {

    private int id;

    private String ticketType;

    private String ticketPrice;

    private  String ticketSeats;

    private boolean hasTicket;
    //default constructor
    public Ticket() {
    }

    // methods
    public void buyTicket(){
        this.hasTicket = true;
    }
    //getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getTicketSeats() {
        return ticketSeats;
    }

    public void setTicketSeats(String ticketSeats) {
        this.ticketSeats = ticketSeats;
    }
}
