package InterfacesImplementations;

import interfaces.ICar;

public class CarINterfaceImpl implements ICar {
    @Override
    public void backUp() {

    }

    @Override
    public void overtake() {

    }

    @Override
    public boolean honk() {
        return false;
    }

    @Override
    public void indicate() {

    }

    @Override
    public void brake() {
        ICar.super.brake();
    }

    @Override
    public void drive() {

    }

    @Override
    public void move() {

    }
}
