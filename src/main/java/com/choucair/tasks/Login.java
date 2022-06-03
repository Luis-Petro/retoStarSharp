package com.choucair.tasks;

import static com.choucair.userinterface.LoginPage.*;

import com.choucair.model.LoginData;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import java.util.List;

public class Login implements Task {

    private List<LoginData> withthedata;

    public Login(List<LoginData> withthedata) {

        this.withthedata = withthedata;
    }

    public static Login onThePage(List<LoginData> withthedata) {

        return Tasks.instrumented(Login.class, withthedata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(withthedata.get(0).getUserName()).into(INPUT_USER),
                Enter.theValue(withthedata.get(0).getPassword()).into(INPUT_PASSWORD),
                Click.on(SIGNIN_BUTTON)
        );
    }
}