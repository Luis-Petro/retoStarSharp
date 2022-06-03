package com.choucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BussinesUnitPage {

    public static final Target ORGANIZATION_MENU = Target.the("organization menu")
            .located(By.xpath("//span[contains(text(), 'Organization')]"));
    public static final Target BUSINESS_UNIT_OPTION = Target.the("business units option")
            .located(By.xpath("//span[contains(text(), 'Business Units')]"));
    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("button new business unit")
            .located(By.xpath("//span[contains(@class, 'button-inner')]"));
    public static final Target INPUT_NAME = Target.the("input name business unit")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
    public static final Target PARENT_UNIT = Target.the("Parent unit")
            .located(By.id("select2-chosen-1"));
    public static final Target PARENT_UNIT_SEARCH = Target.the("parent unit search")
            .located(By.id("s2id_autogen1_search"));
    public static final Target SAVE_BUSINESS_UNIT = Target.the("save bussines unit")
            .located(By.xpath("//span[contains(text(), 'Save')]"));
    public static final Target SEARCH_BUSINESS_UNIT = Target.the("search bussines unit")
            .located(By.xpath("//input[contains(@class, 's-Serenity-QuickSearchInput s-QuickSearchInput')]"));
    public static final Target NAME_BUSINESS_UNIT = Target.the(" Bussines unit name created")
            .located(By.xpath("(//a[@class='s-EditLink s-Pro-Organization-BusinessUnitLink'])[2]"));
    public static final Target BUTTON_REFRESH = Target.the(" Bussines unit name created")
            .located(By.xpath("//*[@class='fa fa-refresh text-blue']"));

}
