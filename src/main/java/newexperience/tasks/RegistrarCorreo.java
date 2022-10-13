package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadorDatos;

public class RegistrarCorreo implements Task {
    private TDatos tdatos;

    public RegistrarCorreo(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static RegistrarCorreo correo(TDatos tdatos) {
        return Tasks.instrumented(RegistrarCorreo.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(tdatos.getCorreo()).into(LocalizadorDatos.CORREO),
                Click.on(LocalizadorDatos.CREAR)
        );


    }
}
