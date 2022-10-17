package com.choucair.certification.retoTecnico.tasks;

import com.choucair.certification.retoTecnico.exceptions.OpenTheBrowserException;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OpenTheBrowser implements Task {

    PageObject page;

    public OpenTheBrowser(PageObject page){
        this.page = page;
    }


    public static OpenTheBrowser on (PageObject page) {

        return Tasks.instrumented(OpenTheBrowser.class, page);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.wasAbleTo(Opne.browserOn(page));
        } catch (Exception e){
            throw new OpenTheBrowserException(OpenTheBrowserException.OPEN_THE_BROWSER_FAILED, e);
        }

    }

    private static class Opne {
        public static Performable browserOn(PageObject page) {
            return null;
        }
    }
}


