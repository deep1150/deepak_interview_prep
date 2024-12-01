package deepak_lld_prep.structrual_pattern.decorator_pattern.client;

import deepak_lld_prep.structrual_pattern.decorator_pattern.component.BasicCoffee;
import deepak_lld_prep.structrual_pattern.decorator_pattern.component.Coffee;
import deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.concreate_decorator.MilkDecorator;
import deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.concreate_decorator.SugarDecorator;
import deepak_lld_prep.structrual_pattern.decorator_pattern.decorator.concreate_decorator.WhippedCreamDecorator;

public class DecoratorExample {
    public static void main(String[] args) {
        // Create a basic coffee
        Coffee basicCoffee = new BasicCoffee();
        System.out.println(basicCoffee.getDescription() + " Cost: $" + basicCoffee.getCost());

        // Add milk
        Coffee milkCoffee = new MilkDecorator(basicCoffee);
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.getCost());

        // Add sugar and whipped cream
        Coffee fancyCoffee = new WhippedCreamDecorator(new SugarDecorator(milkCoffee));
        System.out.println(fancyCoffee.getDescription() + " Cost: $" + fancyCoffee.getCost());
    }
}