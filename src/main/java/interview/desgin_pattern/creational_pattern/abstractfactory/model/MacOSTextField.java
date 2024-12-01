package deepak_lld_prep.creational_pattern.abstractfactory.model;

public class MacOSTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering MacOS text field");
    }
}
