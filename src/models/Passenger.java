package models;

public class Passenger {

    private int id;

    private   Ticket ticket;

    private  Person person;



    public Passenger() {
        ticket.buyTicket();
    }

    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
//