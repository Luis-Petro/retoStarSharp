package com.choucair.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.userinterface.BussinesUnitPage.*;
import static com.choucair.userinterface.MeetingPage.*;


public class MeetingAnswer implements Question <Boolean> {
    private String question;

    public MeetingAnswer(String question){
        this.question = question;
    }
    public static MeetingAnswer toThe(String question) {
        return new MeetingAnswer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                Enter.theValue(question).into(SEARCH_MEETING),
                WaitUntil.the(NAME_MEETING_RESULT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds()
        );

        boolean result;
        String nameMeeting = Text.of(NAME_MEETING_RESULT).viewedBy(actor).asString();
        System.out.println("--------->"+nameMeeting);
        if (nameMeeting.contains(question)){
            result=true;
        }else {
            result =false;
        }
        return result;
    }
    }

