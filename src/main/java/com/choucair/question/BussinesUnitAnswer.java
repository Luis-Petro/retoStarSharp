package com.choucair.question;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.choucair.userinterface.BussinesUnitPage.*;

public class BussinesUnitAnswer implements Question <Boolean> {

    private String question;

    public BussinesUnitAnswer(String question){
        this.question = question;
    }
    public static BussinesUnitAnswer toThe(String question) {
        return new BussinesUnitAnswer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(BUTTON_REFRESH, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BUTTON_REFRESH),
                WaitUntil.the(NAME_BUSINESS_UNIT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );
        boolean result;
        String nameBusinessUnit = Text.of(NAME_BUSINESS_UNIT).viewedBy(actor).asString();

        if (nameBusinessUnit.contains(question)){
            result=true;
        }else {
            result =false;
        }
        return result;
    }
    }

