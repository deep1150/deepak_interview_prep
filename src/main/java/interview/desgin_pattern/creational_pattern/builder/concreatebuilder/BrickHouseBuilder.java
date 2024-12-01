package deepak_lld_prep.creational_pattern.builder.concreatebuilder;

import deepak_lld_prep.creational_pattern.builder.HouseBuilder;
import deepak_lld_prep.creational_pattern.builder.model.House;

public class BrickHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildWalls() {
        house.setWalls("Brick");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Tile");
    }

    @Override
    public void buildWindows() {
        house.setWindows("Glass");
    }

    @Override
    public House getResult() {
        return house;
    }
}