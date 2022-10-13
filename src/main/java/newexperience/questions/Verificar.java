package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadorDatos;
import newexperience.userinterface.LocalizadoraValidar;

public class Verificar implements Question<Boolean> {
    private  TDatos tdatos;

    public Verificar(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static Verificar registro(TDatos tdatos) {
        return new Verificar(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String validar = Text.of(LocalizadoraValidar.REGISTRO).viewedBy(actor).asString();
        String mensaje= tdatos.getMensaje();
        if(mensaje.equals(validar)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
