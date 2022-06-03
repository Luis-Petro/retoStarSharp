package com.choucair.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import static com.choucair.userinterface.BussinesUnitPage.*;

public class NavigateToBussinesUnit implements Task {

    public static NavigateToBussinesUnit page() {
        return Tasks.instrumented(NavigateToBussinesUnit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORGANIZATION_MENU),
                Click.on(BUSINESS_UNIT_OPTION),
                Click.on(NEW_BUSINESS_UNIT_BUTTON)
        );

    }
}
