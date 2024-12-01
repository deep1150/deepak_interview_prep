package deepak_lld_prep.creational_pattern.abstractfactory.factory;

import deepak_lld_prep.creational_pattern.abstractfactory.model.Button;
import deepak_lld_prep.creational_pattern.abstractfactory.model.TextField;
import deepak_lld_prep.creational_pattern.abstractfactory.model.WindowsButton;
import deepak_lld_prep.creational_pattern.abstractfactory.model.WindowsTextField;

// ConcreteFactory1
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}
