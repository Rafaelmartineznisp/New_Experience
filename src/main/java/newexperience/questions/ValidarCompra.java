package newexperience.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import newexperience.model.TDatos;
import newexperience.userinterface.LocalizadoraCompra;
import newexperience.userinterface.LocalizadoraValidar;

public class ValidarCompra implements Question<Boolean> {
    private TDatos tdatos;

    public ValidarCompra(TDatos tdatos) {
        this.tdatos = tdatos;
    }

    public static ValidarCompra compra(TDatos tdatos) {
        return new ValidarCompra(tdatos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;
        String validar = Text.of(LocalizadoraCompra.COMPRA).viewedBy(actor).asString();
        String mensaje= tdatos.getVerificarcompra();
        if(mensaje.equals(validar)){
            resultado=true;
        }else {
            resultado=false;
        }
        return resultado;
    }
}
