package com.choucair.certification.retoTecnico.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Dispositivos {

    public static final Target SISTEMA = Target.the("Sistema")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]"));
    public static final Target WINDOWS = Target.the("Windows")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target VERSION = Target.the("Version")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));
    public static final Target XP = Target.the("Xp")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target LENGUAJE = Target.the("Lenguaje")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));
    public static final Target INGLES = Target.the("INGLES")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[11]"));
    public static final Target TIPOMOVIL = Target.the("Tipo de movil")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]"));
    public static final Target MARCA = Target.the("Marca")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target MODELO = Target.the("MODELO")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]"));
    public static final Target MODEL = Target.the("Marca")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target SISTEMAOPERATIVO = Target.the("Sistema Operativo")
            .located(By.id("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]"));
    public static final Target OPERATIVO = Target.the("Operativo")
            .located(By.id("(//span[@class=\"ui-select-choices-row-inner\"])[2]"));
    public static final Target BOTONFINAL = Target.the("Boton Final")
            .located(By.id("//a[@arial-label=\"Next - final step\"]"));

}

