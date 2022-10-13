package newexperience.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/compra_newexperience.feature",
        tags = "@Historia2",
        glue = "newexperience.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnersTagsCompra {
}



