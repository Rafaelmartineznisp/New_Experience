package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import newexperience.userinterface.LocalizadoraCompra;
import newexperience.util.FuncionesPersonales;

public class AgregarProducto implements Task {

    private FuncionesPersonales funcionesPersonales;
    public static AgregarProducto agregar() {
        return Tasks.instrumented(AgregarProducto.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LocalizadoraCompra.DAMA),
                Click.on(LocalizadoraCompra.PRODUCTO));
        funcionesPersonales.ingresarAlIframe("//iframe[@class='fancybox-iframe']");
        actor.attemptsTo(Click.on(LocalizadoraCompra.AGREGAR));
        funcionesPersonales.iframeDefault();
        actor.attemptsTo(Click.on(LocalizadoraCompra.BTN_PAGAR));
        actor.attemptsTo(Click.on(LocalizadoraCompra.BTNCONTINUAR),
                Click.on(LocalizadoraCompra.BTNCONTINUARDIRECCION),
                Click.on(LocalizadoraCompra.CHBTERMINO),
                Click.on(LocalizadoraCompra.BTNCONTINUARCOMPRA),
                Click.on(LocalizadoraCompra.DIVPAGO),
                Click.on(LocalizadoraCompra.BTNCONFIRMAR));

    }
}
