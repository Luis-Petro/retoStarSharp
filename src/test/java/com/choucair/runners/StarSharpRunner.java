package com.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/starSharp.feature",
        tags = "@stories",
        glue = "com.choucair.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class StarSharpRunner {
}