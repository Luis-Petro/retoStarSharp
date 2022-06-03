package com.choucair.tasks;

import com.choucair.model.MeetingData;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.choucair.userinterface.MeetingPage.*;
import java.util.List;

public class CreateMeeting implements Task {

    private List<MeetingData> data;

    public CreateMeeting(List<MeetingData> withthedata) {
        this.data = withthedata;
    }


    public static CreateMeeting onThePage(List<MeetingData> witthedata) {
        return Tasks.instrumented(CreateMeeting.class, witthedata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(data.get(0).getNameMeeting()).into(INPUT_MEETING_NAME),
                Click.on(SELECT_MEETING_TYPE),
                Enter.theValue(data.get(0).getMeetingType()).into(INPUT_MEETING_TYPE),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_MEETING_TYPE),
                Hit.the(Keys.ENTER).into(INPUT_MEETING_TYPE),
                Enter.theValue(data.get(0).getMeetingNumber()).into(INPUT_MEETING_NUMBER),


                Enter.theValue(data.get(0).getDateStart()).into(INPUT_START_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getTimeStarDate()).from(SELECT_TIME_START),


                Enter.theValue(data.get(0).getDateEnd()).into(INPUT_END_DATE),
                SelectFromOptions.byVisibleText(data.get(0).getTimeEndDate()).from(SELECT_TIME_END),

                Click.on(SELECT_LOCATION),
                Enter.theValue(data.get(0).getLocation()).into(SEARCH_LOCATION),
                Hit.the(Keys.ENTER).into(SEARCH_LOCATION),

                Click.on(SELECT_UNIT),
                Enter.theValue(data.get(0).getUnit()).into(SEARCH_UNIT),
                Hit.the(Keys.ARROW_DOWN).into(SEARCH_UNIT),
                Hit.the(Keys.ENTER).into(SEARCH_UNIT),

                Click.on(SELECT_ORGANIZER),
                Enter.theValue(data.get(0).getRandom()).into(SEARCH_ORGANIZER),
                Hit.the(Keys.ENTER).into(SEARCH_ORGANIZER),
                Enter.theValue(data.get(0).getName()).into(ORGANIZER_TITTLE),
                Enter.theValue(data.get(0).getName2()).into(ORGANIZER_NAME),
                Enter.theValue(data.get(0).getLastName()).into(ORGANIZER_LASTNAME),
                Enter.theValue(data.get(0).getEmail()).into(ORGANIZER_EMAIL),
                Click.on(SAVE_ORGANIZER),

                Click.on(SELECT_REPORTER),
                Enter.theValue(data.get(0).getNameComplete()).into(SEARCH_REPORTER),
                Hit.the(Keys.ENTER).into(SEARCH_REPORTER),

                Click.on(SELECT_ATTENDEE_LIST),
                Enter.theValue(data.get(0).getNameComplete2()).into(SEARCH_ATTENDEE_LIST),
                Hit.the(Keys.ENTER).into(SEARCH_ATTENDEE_LIST),
                Click.on(SAVE_MEETING)
        );
    }
}