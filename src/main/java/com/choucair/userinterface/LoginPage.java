package com.choucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/")
public class LoginPage extends PageObject {

    public static final Target INPUT_USER = Target.the("user")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the(" password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target SIGNIN_BUTTON = Target.the("button to enter the app")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}