package deepak_lld_prep.creational_pattern.abstractfactory.factory;

import deepak_lld_prep.creational_pattern.abstractfactory.model.Button;
import deepak_lld_prep.creational_pattern.abstractfactory.model.MacOSButton;
import deepak_lld_prep.creational_pattern.abstractfactory.model.MacOSTextField;
import deepak_lld_prep.creational_pattern.abstractfactory.model.TextField;

// ConcreteFactory2
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }
}
