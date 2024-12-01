package deepak_lld_prep.creational_pattern.builder.client;

import deepak_lld_prep.creational_pattern.builder.HouseBuilder;
import deepak_lld_prep.creational_pattern.builder.concreatebuilder.BrickHouseBuilder;
import deepak_lld_prep.creational_pattern.builder.concreatebuilder.WoodenHouseBuilder;
import deepak_lld_prep.creational_pattern.builder.director.ConstructionDirector;
import deepak_lld_prep.creational_pattern.builder.model.House;


public class BuilderExample {
    public static void main(String[] args) {
        // Construct a Wooden House
        HouseBuilder woodenBuilder = new WoodenHouseBuilder();
        ConstructionDirector director = new ConstructionDirector(woodenBuilder);
        director.constructHouse();
        House woodenHouse = woodenBuilder.getResult();
        System.out.println("Wooden House: " + woodenHouse);

        // Construct a Brick House
        HouseBuilder brickBuilder = new BrickHouseBuilder();
        director = new ConstructionDirector(brickBuilder);
        director.constructHouse();
        House brickHouse = brickBuilder.getResult();
        System.out.println("Brick House: " + brickHouse);
    }
}

