package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadoraValidar;

public class Verificarfallido implements Question<Boolean> {
    private TDatos tdatos;

    public Verificarfallido(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static Verificarfallido registrofallido(TDatos tdatos) {
        return new Verificarfallido(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String validar = Text.of(LocalizadoraValidar.REGISTROEXISTENTE).viewedBy(actor).asString();
        String mensaje= tdatos.getMensaje();
        if(mensaje.equals(validar)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
