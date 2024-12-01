package deepak_lld_prep.creational_pattern.factory.factory;

import deepak_lld_prep.creational_pattern.factory.model.Bike;
import deepak_lld_prep.creational_pattern.factory.model.Vehicle;

// Concrete Factory 2: BikeFactory
public class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
