package newexperience.util;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FuncionesPersonales  extends PageObject {
    public void ingresarAlIframe(String iframe){
        WebElement element = getDriver().findElement(By.xpath(iframe));
        getDriver().switchTo().frame(element);

    }
   /* public void cambioFrame(String frame){
        WebElement element = getDriver().findElement(By.xpath(frame));
        getDriver().switchTo().frame(element);
    }*/
    public void iframeDefault(){
       getDriver().switchTo().defaultContent();

    }
}
