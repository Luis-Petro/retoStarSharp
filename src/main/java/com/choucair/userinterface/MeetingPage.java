package com.choucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage extends PageObject {

    public static final Target MEETING_MENU = Target.the("meeting menu")
            .located(By.xpath("(//span[contains(text(),'Meeting')])[1]"));
    public static final Target MEETINGS_OPTION = Target.the("meeting option")
            .located(By.xpath("//span[contains(text(),'Meetings')]"));
    public static final Target NEW_MEETING_BUTTON = Target.the("button new meeting")
            .located(By.xpath("//span[contains(text(),' New Meeting')]"));

    public static final Target INPUT_MEETING_NAME = Target.the("name of meeting")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));
    public static final Target SELECT_MEETING_TYPE = Target.the("Meeting Type")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId"));
    public static final Target INPUT_MEETING_TYPE = Target.the("meeting type")
            .located(By.id("s2id_autogen6_search"));
    public static final Target INPUT_MEETING_NUMBER = Target.the("meeting Number")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    public static final Target INPUT_START_DATE = Target.the("select month")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));
    public static final Target INPUT_END_DATE = Target.the("select month")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));
    public static final Target SELECT_TIME_START = Target.the("time of star date")
            .located(By.cssSelector("#Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid > div > div > div.field.StartDate.col-sm-6 > select"));
    public static final Target SELECT_TIME_END = Target.the("time of star date")
            .located(By.cssSelector("#Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid > div > div > div.field.EndDate.col-sm-6 > select"));

    public static final Target SELECT_LOCATION = Target.the("select location")
            .located(By.id("select2-chosen-7"));
    public static final Target SEARCH_LOCATION = Target.the("search location")
            .located(By.id("s2id_autogen7_search"));


    public static final Target SELECT_UNIT = Target.the("where do we select unit")
            .located(By.cssSelector("#s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId > a > span.select2-arrow"));
    public static final Target SEARCH_UNIT = Target.the("unit")
            .located(By.id("s2id_autogen8_search"));

    public static final Target SELECT_ORGANIZER = Target.the("select organizer")
            .located(By.cssSelector("#s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId > a > span.select2-arrow"));
    public static final Target SEARCH_ORGANIZER = Target.the("search organizer")
            .located(By.id("s2id_autogen9_search"));
    public static final Target ORGANIZER_TITTLE = Target.the("organizer tittle")
            .located(By.id("Serenity_Pro_Organization_ContactDialog33_Title"));
    public static final Target ORGANIZER_NAME = Target.the("organizer name")
            .located(By.id("Serenity_Pro_Organization_ContactDialog33_FirstName"));
    public static final Target ORGANIZER_LASTNAME = Target.the("organizer last name")
            .located(By.id("Serenity_Pro_Organization_ContactDialog33_LastName"));
    public static final Target ORGANIZER_EMAIL = Target.the("organizer email")
            .located(By.id("Serenity_Pro_Organization_ContactDialog33_Email"));
    public static final Target SAVE_ORGANIZER = Target.the("save the organizer")
            .located(By.xpath("(//span[contains(text(),'Save')])[2]"));

    public static final Target SELECT_REPORTER = Target.the("select reporter")
            .located(By.id("select2-chosen-10"));
    public static final Target SEARCH_REPORTER = Target.the("search reporter")
            .located(By.id("s2id_autogen10_search"));

    public static final Target SELECT_ATTENDEE_LIST = Target.the("select attendee list")
            .located(By.id("select2-chosen-12"));
    public static final Target SEARCH_ATTENDEE_LIST = Target.the("attendee list")
            .located(By.id("s2id_autogen12_search"));

    public static final Target SAVE_MEETING = Target.the("button to save meeting")
            .located(By.xpath("(//span[contains(text(),'Save')])[1]"));
    public static final Target NAME_MEETING_RESULT = Target.the("result search name meeting")
            .located(By.xpath("(//a[@class='s-EditLink s-Pro-Meeting-MeetingLink'])[2]"));
    public static final Target SEARCH_MEETING = Target.the("search meeting")
            .located(By.xpath("//INPUT[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']"));
}
