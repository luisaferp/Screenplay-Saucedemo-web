package saucedemo.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/saucedemo.feature",
tags = "@caso1",
glue = "saucedemo.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnersTags {
}
