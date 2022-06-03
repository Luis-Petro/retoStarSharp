package com.choucair.stepdefinitions;

import com.choucair.model.*;
import com.choucair.question.*;
import com.choucair.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class StarSharpStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^than user enters the website$")
    public void than_user_enters_the_website() {
        theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @And("^enter valid access data$")
    public void enterValidAccessData(List<LoginData> withthedata) {
        theActorCalled("User").wasAbleTo(Login.onThePage(withthedata));
    }

    @Given("^than user navigate to the business unit screen$")
    public void thanUserNavigateToTheBusinessUnitScreen() {
        theActorInTheSpotlight().wasAbleTo(NavigateToBussinesUnit.page());
    }

    @When("^he creates the business unit on the StarSharp platform$")
    public void heCreatesTheBusinessUnitOnTheStarSharpPlatform(List<BusinessUnitData> withthedata) {
        theActorInTheSpotlight().attemptsTo(CreateBussinesUnit.onThePage(withthedata));
    }

    @Then("^he finds the business unit created$")
    public void heFindsTheBusinessUnitCreated(List<BusinessUnitData> withthedata) {
        theActorInTheSpotlight().should(seeThat(BussinesUnitAnswer
                .toThe(withthedata.get(0).getNameBusinessUnit())));
    }

    @Given("^than user navigate to the meeting screen$")
    public void thanUserNavigateToTheMeetingScreen() {
        theActorInTheSpotlight().wasAbleTo(NavigateToMeetings.page());
    }

    @When("^he creates Andresmeeting$")
    public void heCreatesAndresmeeting(List<MeetingData> witthedata) {
        theActorInTheSpotlight().attemptsTo(CreateMeeting.onThePage(witthedata));
    }

    @Then("^he finds the new meeting called Luismeeting$")
    public void heFindsTheNewMeetingCalledLuismeeting(List<MeetingData> Data) {
        theActorInTheSpotlight().should(seeThat(MeetingAnswer
                .toThe(Data.get(0).getNameMeeting())));
    }
}

