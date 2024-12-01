package deepak_lld_prep.creational_pattern.factory.client;

import deepak_lld_prep.creational_pattern.factory.factory.BikeFactory;
import deepak_lld_prep.creational_pattern.factory.factory.CarFactory;
import deepak_lld_prep.creational_pattern.factory.factory.VehicleFactory;
import deepak_lld_prep.creational_pattern.factory.model.Vehicle;

public class FactoryMethodExample {
    public static void main(String[] args) {
        // Using CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();  // Output: Driving a car

        // Using BikeFactory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();  // Output: Riding a bike
    }
}