package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadoraValidar;

public class VerificarVacio implements Question<Boolean> {
    private TDatos tdatos;

    public VerificarVacio(TDatos tdatos) {
        this.tdatos = tdatos;
    }
    public static VerificarVacio registrovacio(TDatos tdatos) {
        return new VerificarVacio(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String validar = Text.of(LocalizadoraValidar.REGISTROVACIO).viewedBy(actor).asString();
        String mensaje= tdatos.getMensaje();
        if(mensaje.equals(validar)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
