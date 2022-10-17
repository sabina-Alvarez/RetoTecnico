package com.choucair.certification.retoTecnico.runners;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/registro_usuario.feature",
        glue = "com.certification.retoTecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE)


public class RegistroUsuario {
}
