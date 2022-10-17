package com.choucair.certification.retoTecnico.stepdefinitions;

import com.choucair.certification.retoTecnico.tasks.AbrirPaginaUtest;
import com.choucair.certification.retoTecnico.tasks.OpenTheBrowser;
import com.choucair.certification.retoTecnico.userinterfaces.PaginaInicial;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.PerformsTasks;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class RegistroUsuarioStepDefinitions {
    private PaginaInicial page;

    

    @Before
    public void setUp(){setTheStage(new OnlineCast());

    }

    @Given("^(.*) quiere registrarse en la pagina de Utest$")
    public void sabinaQuiereRegistrarseEnLaPaginaDeUtest(String name) {
        theActorCalled(name).wasAbleTo(OpenTheBrowser.on(page));

    }

    @Given("^Sabina quiere registrarse en la pagina de Utest$")
    public void sabinaQuiereRegistrarseEnLaPaginaDeUtest() {
    }

    @When("^ingrese toda la información requerida$")
    public void ingreseTodaLaInformaticaQuerida() {
        theActorInTheSpotLight().attemptsTo(AbrirPaginaUtest.makeinformation());

    }

    private PerformsTasks theActorInTheSpotLight() {return theActorInTheSpotLight();}

    @Then("^se completara el registro de manera exitosa$")
    public void seCompletaraElRegistroDeManeraExitosa() {

    }
}
