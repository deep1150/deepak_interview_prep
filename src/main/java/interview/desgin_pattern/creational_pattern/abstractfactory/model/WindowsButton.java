package deepak_lld_prep.creational_pattern.abstractfactory.model;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button");
    }
}
