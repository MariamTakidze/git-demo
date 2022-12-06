import InterfacesImplementations.CarInterfaceImpl;
import interfaces.ICar;
import models.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;


public class Main {
    public static org.apache.logging.log4j.Logger logger;
    public static void main(String[] args) {

        CarInterfaceImpl carInt = new CarInterfaceImpl();


        logger = LogManager.getLogger(Main.class);


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
        person.setId(13);
        person.setFirstName("MAri");
        person.setLastName("Takidze");
        person.setAge(28);
        person.setSex("Female");
    //passenger
        Passenger passenger = new Passenger();
        passenger.setFirstName("Lolita");
        passenger.setLastName("Bosh");
        passenger.setAge(42);
        passenger.setSex("Female");
        passenger.setTicket(ticket);
    //driving licences
        DrivingLicenses drivingLicenses = new DrivingLicenses();
        drivingLicenses.setType("B");
        drivingLicenses.setLicenseValidation("true");
    //driver
       Driver driver = new Driver(12,"Giuseppe","Verdi",32,"Male");
//       driver.setFirstName("Roberto");
//       driver.setLastName("Rodriguez");
//       driver.setAge(72);
//       driver.setSex("Male");
       driver.setDrivingLicense(drivingLicenses);

      Driver myDriver = new Driver(12,"Giuseppe","Verdi",32,"Male");
    //stations
        Stations stations = new Stations();
        stations.setName("Ureki");
     //engine
      Engine engine = new Engine();
      engine.setStateOFEngine("off");
      engine.start();

//


        System.out.println(wheel.getId());
        System.out.println(wheel.getBrandName());
        System.out.println(wheel.getSize());

        System.out.println(destination.getStationFrom());
        System.out.println(destination.getStationTo());

        System.out.println(stations.getName());


        System.out.println(passenger.getFirstName());
        System.out.println(passenger.getAge());
        System.out.println(passenger.toString());
        System.out.println(driver.toString());

        System.out.println(person.toString());
        System.out.println(person.hashCode());
        System.out.println(person.equals(null));

        System.out.println(passenger.equals(driver));
        System.out.println(driver.equals(myDriver));
        System.out.println(myDriver.hashCode());
        System.out.println(driver.hashCode());

        vehicle.setEngine(engine);


        System.out.println("--------------------------------------");
        vehicle.move();




        System.out.println(ticket.getTicketPrice());
        System.out.println(ticket.getTicketType());
        System.out.println(ticket.getTicketSeats());


        //interfaces polymorphism static final

        //creating the car object
        Car car = new Car();
        car.setColor("red");
        car.setColor("blue");
        car.setVehicleType("bus");
        car.honk();
        car.drive();
        //accessing via class reference
        car.brake();
        System.out.println(car.getVehicleType()); //???
        System.out.println(car.getColor());
        System.out.println(car.honk());

        // person object
        person.think();
        person.speak();
        person.setFirstName("Maree");
        person.setAge(32);
        System.out.println(person.getFirstName());
        person.displayPersonInfo("Mar","Gango","Female",29);
        System.out.println(person.getAge());
    }
}