package deepak_lld_prep.creational_pattern.abstractfactory.factory;

import deepak_lld_prep.creational_pattern.abstractfactory.model.Button;
import deepak_lld_prep.creational_pattern.abstractfactory.model.TextField;

// AbstractFactory
public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}
