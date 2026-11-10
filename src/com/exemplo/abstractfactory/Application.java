package com.exemplo.abstractfactory;

public class Application {
    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    public Application(UIComponentFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
        checkbox = factory.createCheckbox();
    }

    public void paintUI() {
        button.render();
        textField.render();
        checkbox.render();
    }
}