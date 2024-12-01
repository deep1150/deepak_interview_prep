package deepak_lld_prep.creational_pattern.abstractfactory.model;

public class WindowsTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering Windows text field");
    }
}
