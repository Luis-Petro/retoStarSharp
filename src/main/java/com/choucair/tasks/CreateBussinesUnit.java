package com.choucair.tasks;

import com.choucair.model.BusinessUnitData;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import java.util.List;
import static com.choucair.userinterface.BussinesUnitPage.*;


public class CreateBussinesUnit implements Task {

    private List<BusinessUnitData> withthedata;
    public CreateBussinesUnit(List<BusinessUnitData> withthedata) {
        this.withthedata = withthedata;
    }

    public static CreateBussinesUnit onThePage(List<BusinessUnitData> withthedata) {
        return Tasks.instrumented(CreateBussinesUnit.class, withthedata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(withthedata.get(0).getNameBusinessUnit()).into(INPUT_NAME),
                Click.on(PARENT_UNIT),
                Enter.theValue(withthedata.get(0).getParentUnit()).into(PARENT_UNIT_SEARCH),
                Hit.the(Keys.ENTER).into(PARENT_UNIT_SEARCH),
                Click.on(SAVE_BUSINESS_UNIT),
                WaitUntil.the(SEARCH_BUSINESS_UNIT, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Enter.theValue(withthedata.get(0).getNameBusinessUnit()).into(SEARCH_BUSINESS_UNIT)
        );
    }
}