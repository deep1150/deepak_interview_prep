package deepak_lld_prep.structrual_pattern.decorator_pattern.component;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}

