package deepak_lld_prep.creational_pattern.factory.factory;

import deepak_lld_prep.creational_pattern.factory.model.Car;
import deepak_lld_prep.creational_pattern.factory.model.Vehicle;

// Concrete Factory 1: CarFactory
public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
