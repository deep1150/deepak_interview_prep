package deepak_lld_prep.creational_pattern.builder.director;


import deepak_lld_prep.creational_pattern.builder.HouseBuilder;

public class ConstructionDirector {
    private HouseBuilder builder;

    public ConstructionDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructHouse() {
        builder.buildWalls();
        builder.buildRoof();
        builder.buildWindows();
    }
}
