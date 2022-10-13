package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraValidar {
    public static final Target REGISTRO = Target.the("Validar resgistro").located(By.xpath("//div[@id='center_column']//p"));
    public static final Target REGISTROEXISTENTE = Target.the("Registro existente").located(By.xpath("//div[@id='create_account_error']//ol"));
    public static final Target REGISTROVACIO = Target.the("Registro vacio").located(By.xpath("//*[@id='center_column']/div/p"));

}
