package deepak_lld_prep.creational_pattern.factory.model;


// Concrete Product 1: Car
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}

