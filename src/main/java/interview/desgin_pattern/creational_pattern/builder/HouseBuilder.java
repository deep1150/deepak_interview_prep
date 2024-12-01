package deepak_lld_prep.creational_pattern.builder;

import deepak_lld_prep.creational_pattern.builder.model.House;

// Builder
public interface HouseBuilder {
    void buildWalls();
    void buildRoof();
    void buildWindows();
    House getResult();
}