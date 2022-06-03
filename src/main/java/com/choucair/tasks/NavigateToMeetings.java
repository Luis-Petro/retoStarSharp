package com.choucair.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import static com.choucair.userinterface.MeetingPage.*;

public class NavigateToMeetings implements Task {

    public static NavigateToMeetings page() {
        return Tasks.instrumented(NavigateToMeetings.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEETING_MENU),
                Click.on(MEETINGS_OPTION),
                Click.on(NEW_MEETING_BUTTON)
        );
    }
}
