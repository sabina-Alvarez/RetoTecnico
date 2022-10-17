package com.choucair.certification.retoTecnico.tasks;


import com.choucair.certification.retoTecnico.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaUtest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaInicial.REGISTRO),
                SendKeys.of("Sabina").into(Personal.FIRSTNAME),
                SendKeys.of("Alvarez").into(Personal.LASTNAME),
                SendKeys.of("sabina@gmail.com").into(Personal.EMAIL),
                SendKeys.of("Noviembre").into(Personal.MONTH),
                SendKeys.of("13").into(Personal.DAY),
                SendKeys.of("2000").into(Personal.YEAR),
                Click.on(Ubicacion.BUTTONLOCATION),
                Click.on(Dispositivos.WINDOWS),
                Click.on(Dispositivos.VERSION),
                Click.on(Dispositivos.XP),
                Click.on(Dispositivos.LENGUAJE),
                Click.on(Dispositivos.INGLES),
                Click.on(Dispositivos.BOTONFINAL),
                SendKeys.of("MDominguez1234**").into(Contrasena.CONTRASENA),
                SendKeys.of("MDominguez1234**").into(Contrasena.CONFIRMACONTRASENA),
                Click.on(Contrasena.CONFIRMACHECK),
                Click.on(Contrasena.CHECK),
                Click.on(Contrasena.BOTONFIN)

        );
    }
    public static AbrirPaginaUtest makeinformation(){ return instrumented (AbrirPaginaUtest.class);
    }


}
