package com.choucair.certification.retoTecnico.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Contrasena {

    public static final Target CONTRASENA = Target.the("Contraseña")
            .located(By.id(" //input[@id=\"password\"]"));
    public static final Target CONFIRMACONTRASENA = Target.the("Confirmación de la contraseña")
            .located(By.id(" //input[@id=\"confirmPassword\"]"));
    public static final Target CONFIRMACHECK = Target.the("Confirmacion casilla")
            .located(By.id("//span[@class=\"checkmark signup-consent__checkbox error\"]"));
    public static final Target CHECK = Target.the("Confirmacion casilla 2")
            .located(By.id("//span[@class=\"{error: userForm.privacySetting.$error.required}\"]"));
    public static final Target BOTONFIN = Target.the("Boton Final 2")
            .located(By.id("//a[@class=\"btn btn-blue\"]"));

}
