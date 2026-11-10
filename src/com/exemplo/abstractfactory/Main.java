package com.exemplo.abstractfactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory lightFactory = new LightThemeFactory();
        Application appLight = new Application(lightFactory);
        appLight.paintUI();

        System.out.println("\n=== Tema Escuro ===");
        UIComponentFactory darkFactory = new DarkThemeFactory();
        Application appDark = new Application(darkFactory);
        appDark.paintUI();
    }
}
```[cite: 1, 2, 3]