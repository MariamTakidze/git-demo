package models;
import interfaces.ICar;

public final class Car extends Vehicle implements ICar {
    //final variable
    final static String vehicleType = "Car";



    //final static method
    public void brake() {
        System.out.println("The car is braked");
    }


    @Override
    public void drive() {

    }

    @Override
    public void backUp() {

    }

    @Override
    public void overtake() {

    }

    @Override
    public boolean honk() {

        return true;
    }

    @Override
    public void indicate() {

    }
}
