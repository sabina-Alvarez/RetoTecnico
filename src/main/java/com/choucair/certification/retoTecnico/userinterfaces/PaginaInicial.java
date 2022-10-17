package com.choucair.certification.retoTecnico.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")

public class PaginaInicial  extends PageObject {
    public static final Target REGISTRO = Target.the("Campo para Registro de usuario")
            .located(By.id("//a[@class=\"unauthenticated-nav-bar__sign-up\"]"));

}
