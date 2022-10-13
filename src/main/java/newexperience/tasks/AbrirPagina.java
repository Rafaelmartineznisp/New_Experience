package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import newexperience.userinterface.PaginaNewExperience;

public class AbrirPagina implements Task {
    private PaginaNewExperience paginaNewExperience;
    public static Performable pagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaNewExperience),
                Click.on(PaginaNewExperience.SIGN_IN)
        );
    }
}
