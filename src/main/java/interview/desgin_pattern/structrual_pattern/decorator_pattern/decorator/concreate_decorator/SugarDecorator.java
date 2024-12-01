package deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.concreate_decorator;

import deepak_lld_prep.structrual_pattern.decorator_pattern.component.Coffee;
import deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}

