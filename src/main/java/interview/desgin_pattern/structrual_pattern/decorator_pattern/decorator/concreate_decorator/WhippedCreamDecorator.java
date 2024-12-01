package deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.concreate_decorator;

import deepak_lld_prep.structrual_pattern.decorator_pattern.component.Coffee;
import deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.CoffeeDecorator;

public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
}

