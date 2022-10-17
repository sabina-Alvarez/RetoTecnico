package com.choucair.certification.retoTecnico.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Ubicacion {

    public static final Target BUTTONLOCATION = Target.the("campo para boton de la ubicacion")
            .located(By.id("//a[@aria-label=\"Next step - select your devices\"]"));



}
