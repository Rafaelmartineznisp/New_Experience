package newexperience.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadoraLogin;

public class LoginPagina implements Task {
    private TDatos tdatos;

    public LoginPagina(TDatos tdatos) {
        this.tdatos = tdatos;
    }


    public static LoginPagina credenciales(TDatos tdatos) {
        return Tasks.instrumented(LoginPagina.class,tdatos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(tdatos.getCorreo()).into(LocalizadoraLogin.CORREO),
                Enter.theValue(tdatos.getContrasenna()).into(LocalizadoraLogin.CONTRASENNA),
                Click.on(LocalizadoraLogin.INICIAR)


        );
    }
}
