package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraLogin {
    public static final Target CORREO = Target.the("Ingresar correo").located(By.id("email"));
    public static final Target CONTRASENNA = Target.the("ingrsar contrasenna").located(By.id("passwd"));
    public static final Target INICIAR = Target.the("Iniciar sesion").located(By.id("SubmitLogin"));
}
