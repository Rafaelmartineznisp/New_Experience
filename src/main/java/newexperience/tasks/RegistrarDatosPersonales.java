package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadorDatos;
import org.openqa.selenium.support.ui.Select;

public class RegistrarDatosPersonales implements Task {
    private TDatos tdatos;

    public RegistrarDatosPersonales(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static RegistrarDatosPersonales datosPersonales(TDatos tdatos) {
        return Tasks.instrumented(RegistrarDatosPersonales.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LocalizadorDatos.SENOR),
                Enter.theValue(tdatos.getNombre()).into(LocalizadorDatos.NOMBRE),
                Enter.theValue(tdatos.getApellido()).into(LocalizadorDatos.APELLIDO),
                Enter.theValue(tdatos.getContrasenna()).into(LocalizadorDatos.CONTRASENNA),
                SelectFromOptions.byValue(tdatos.getDia()).from(LocalizadorDatos.DIA),
                SelectFromOptions.byValue(tdatos.getMes()).from(LocalizadorDatos.MES),
                SelectFromOptions.byValue(tdatos.getAnno()).from(LocalizadorDatos.ANNO),
                Enter.theValue(tdatos.getDireccion()).into(LocalizadorDatos.DIRECCION),
                Enter.theValue(tdatos.getCuidad()).into(LocalizadorDatos.CIUDAD),
                SelectFromOptions.byVisibleText(tdatos.getEstado()).from(LocalizadorDatos.ESTADO),
                Enter.theValue(tdatos.getCodigo_postal()).into(LocalizadorDatos.POSTAL),
                //SelectFromOptions.byVisibleText(tdatos.getPais()).from(LocalizadorDatos.PAIS),
                Enter.theValue(tdatos.getTelefono()).into(LocalizadorDatos.TELEFONO),
                Enter.theValue(tdatos.getAlias()).into(LocalizadorDatos.ALIAS),
                Click.on(LocalizadorDatos.REGISTRAR)





        );

    }
}
