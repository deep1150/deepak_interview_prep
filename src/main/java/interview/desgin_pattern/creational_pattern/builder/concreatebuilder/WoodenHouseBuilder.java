package deepak_lld_prep.creational_pattern.builder.concreatebuilder;

import deepak_lld_prep.creational_pattern.builder.HouseBuilder;
import deepak_lld_prep.creational_pattern.builder.model.House;

// ConcreteBuilder for Wooden House
public class WoodenHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildWalls() {
        house.setWalls("Wooden");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Wooden");
    }

    @Override
    public House getResult() {
        return house;
    }
}

// ConcreteBuilder for Brick House


