package com.choucair.certification.retoTecnico.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Personal {

    public static final Target FIRSTNAME = Target.the("Campo para nombre de usuario")
            .located(By.id("//input[@id=\"firstName\"]"));
    public static final Target LASTNAME = Target.the("Campo para apellido del usuario")
            .located(By.id("//input[@id=\"lastName\"]"));
    public static final Target EMAIL = Target.the("Campo para email del usuario")
            .located(By.id("//input[@id=\"email\"]"));
    public static final Target MONTH = Target.the("Campo para mes de nacimiento del usuario")
            .located(By.id("//select[@id=\"birthMonth\"]"));
    public static final Target DAY = Target.the("Campo para dia de nacimiento del usuario")
            .located(By.id("//select[@id=\"birthDay\"]"));
    public static final Target YEAR = Target.the("campo para año de nacimiento del usuario")
            .located(By.id("//select[@id=\"birthYear\"]"));
    public static final Target BUTTON = Target.the("campo para boton")
            .located(By.id("//a[@class=\"btn btn-blue\"]"));


}
