import models.*;

public class Main {
    public static void main(String[] args) {
        //destinations
        Destination destination = new Destination();
        destination.setId(1);
        destination.setName("Tbilisi-Batumi");
        destination.setStationFrom("Tbilisi");
        destination.setStationTo("Batumi");
    // wheels
        Wheel wheel = new Wheel();
        wheel.setId(1);
        wheel.setSize("17");
        wheel.setBrandName("Hokohama");

        //tickets
        Ticket ticket = new Ticket();
        ticket.setTicketPrice("50$");
        ticket.setTicketType("single");
        ticket.setTicketSeats("69");
        ticket.setHasTicket(true);

        // vehicles
        Vehicle vehicle = new Vehicle();
        vehicle.setWheel(wheel);


    //person
        Person person = new Person();
        person.setFirstName("MAri");
        person.setLastName("Takidze");
        person.setAge(28);
        Passenger passenger = new Passenger();
        passenger.setPerson(person);
        passenger.setTicket(ticket);


    //stations
        Stations stations = new Stations();
        stations.setName("Ureki");

        Travel travel = new Travel();
    //travels
        travel.setId(1);
        travel.setDestination(destination);


        travel.setPassenger(passenger);
        travel.setVehicle(vehicle);



        System.out.println(wheel.getId());
        System.out.println(wheel.getBrandName());
        System.out.println(wheel.getSize());

        System.out.println(destination.getStationFrom());
        System.out.println(destination.getStationTo());

        System.out.println(stations.getName());

        System.out.println(travel.getVehicle().getWheel().getSize());

        System.out.println(travel.getPassenger().getPerson().getFirstName());
        System.out.println(travel.getPassenger().getPerson().getLastName());
        System.out.println(travel.getPassenger().getPerson().getAge());


        System.out.println(ticket.getTicketPrice());
        System.out.println(ticket.getTicketType());
        System.out.println(ticket.getTicketSeats());
    }
}