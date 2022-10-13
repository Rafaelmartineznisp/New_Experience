package newexperience.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocalizadoraCompra {
    public static final Target DAMA =Target.the("ingresar a seccion de damas").located(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
    public static final Target PRODUCTO = Target.the("Ingresar a producto").located(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"));
    public static final Target AGREGAR = Target.the("Agregar al carrito").located(By.xpath("//button[@name='Submit']//span"));
    public static final Target BTN_PAGAR = Target.the("Pasar a caja").located(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
    public static final Target BTNCONTINUAR = Target.the("Continuar con el pago").located(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
    public static final Target BTNCONTINUARDIRECCION = Target.the("Continuar con la compra").located(By.xpath("//button[@name='processAddress']//span"));
    public static final Target CHBTERMINO = Target.the("Aceptar terminos del transporte").located(By.xpath("//input[@type='checkbox']"));
    public static final Target BTNCONTINUARCOMPRA = Target.the("Continuar con la compra").located(By.xpath("//button[@name='processCarrier']//span"));
    public static final Target DIVPAGO = Target.the("Selecionar el medio de pago").located(By.xpath("//a[@class='bankwire']//span[contains(text(),'(order processing will be longer)')]"));
    public static final Target BTNCONFIRMAR = Target.the("Confirmar compra").located(By.xpath("//span[contains(text(),'I confirm my order')]"));
    public static final Target COMPRA = Target.the("Validar compara").located(By.xpath("//p[@class='cheque-indent']//strong[@class='dark']"));
}
