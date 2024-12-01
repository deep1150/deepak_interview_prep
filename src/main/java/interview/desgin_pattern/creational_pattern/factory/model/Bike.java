package deepak_lld_prep.creational_pattern.factory.model;

// Concrete Product 2: Bike
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }
}
