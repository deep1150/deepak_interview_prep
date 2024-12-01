package deepak_lld_prep.creational_pattern.abstractfactory.client;

import deepak_lld_prep.creational_pattern.abstractfactory.factory.GUIFactory;
import deepak_lld_prep.creational_pattern.abstractfactory.factory.WindowsFactory;
import deepak_lld_prep.creational_pattern.abstractfactory.model.Button;
import deepak_lld_prep.creational_pattern.abstractfactory.model.TextField;

public class Application {
    private Button button;
    private TextField textField;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public void renderUI() {
        button.render();
        textField.render();
    }

    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // or new MacOSFactory();
        Application app = new Application(factory);
        app.renderUI();
    }
}