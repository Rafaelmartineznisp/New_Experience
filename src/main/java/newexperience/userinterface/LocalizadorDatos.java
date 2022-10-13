package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadorDatos {
    public static final Target CORREO = Target.the("Ingresar correo").located(By.id("email_create"));
    public static final Target CREAR = Target.the("boton crear cuenta").located(By.id("SubmitCreate"));
    public static final Target SENOR = Target.the("Escoger señor").located(By.id("id_gender1"));
    public static final Target NOMBRE = Target.the("Ingresar Nombre").located(By.id("customer_firstname"));
    public static final Target APELLIDO = Target.the("Ingresar Apellido").located(By.id("customer_lastname"));

    public static final Target CONTRASENNA = Target.the("Determinar contraseña").located(By.id("passwd"));
    public static final Target CONTENEDORDIA = Target.the("Seleccionar día").located(By.id("uniform-days"));
    public static final Target DIA = Target.the("Seleccionar").located(By.id("days"));
    public static final Target MES = Target.the("Seleccionar Mes").located(By.id("months"));
    public static final Target ANNO = Target.the("Seleccionar Año").located(By.id("years"));
    public static final Target CIUDAD = Target.the("Seleccionar ciudad").located(By.id("city"));
    public static final Target ESTADO = Target.the("Seleccionar Estado").located(By.id("id_state"));
    public static final Target POSTAL = Target.the("Ingresar codigo postal").located(By.id("postcode"));
    public static final Target PAIS = Target.the("Seleccionar el pais").located(By.id("id_country"));
    public static final Target DIRECCION = Target.the("Digitar direccion").located(By.id("address1"));
    public static final Target TELEFONO = Target.the("Digitar telefono").located(By.id("phone_mobile"));
    public static final Target ALIAS = Target.the("Asignar alias").located(By.id("alias"));

    public static final Target REGISTRAR = Target.the("Finalizar registro").located(By.id("submitAccount"));
}
