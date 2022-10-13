package newexperience.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")
public class PaginaNewExperience extends PageObject {
    public static final Target SIGN_IN = Target.the("Acceder a la cuenta ").located(By.xpath("//a[@class='login']"));
}
