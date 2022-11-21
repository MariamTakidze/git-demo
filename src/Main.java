import models.*;

public class Main {
    public static void main(String[] args) {
        Destination destination = new Destination();
        destination.setId(1);
        destination.setName("Tbilisi-Batumi");
        destination.setStationFrom("Tbilisi");
        destination.setStationTo("Batumi");

        Wheel wheel = new Wheel();
        wheel.setId(1);
        wheel.setSize("17");
        wheel.setBrandName("Hokohama");


        Vehicle vehicle = new Vehicle();
        vehicle.setWheel(wheel);


        Stations stations = new Stations();
        stations.setName("Ureki");



        Travel travel = new Travel();

        travel.setId(1);
        travel.setDestination(destination);

//        travel.setPassenger();
        travel.setVehicle(vehicle);


        System.out.println(wheel.getId());
        System.out.println(wheel.getBrandName());
        System.out.println(wheel.getSize());

        System.out.println(destination.getStationFrom());
        System.out.println(destination.getStationTo());

        System.out.println(stations.getName());
        System.out.println(travel.getVehicle());
    }
}