package co.com.choucair.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features ="src/test/resources/features/create_user.feature",
        tags = "@HU",
        glue = "co.com.choucair.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
