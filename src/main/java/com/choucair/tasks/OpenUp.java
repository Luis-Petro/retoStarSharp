package com.choucair.tasks;
import com.choucair.userinterface.LoginPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    LoginPage starSharpLoginPage;
    public  static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(starSharpLoginPage));
    }
}