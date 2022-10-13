package newexperience.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import newexperience.model.TDatos;
import newexperience.questions.ValidarCompra;
import newexperience.tasks.AbrirPagina;
import newexperience.tasks.AgregarProducto;
import newexperience.tasks.LoginPagina;
import newexperience.tasks.RegistrarCorreo;

import java.util.List;

public class CompraStepDefinition {
    @Before
    public void setStege(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Cuando("^digita las credenciales de acceso$")
    public void digitaLasCredencialesDeAcceso(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginPagina.credenciales(tdatos.get(0)));
    }

    @Y("^selecciona los productos a adquirir$")
    public void seleccionaLosProductosAAdquirir() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProducto.agregar());
    }

    @Entonces("^verifica la comprar realizada$")
    public void verificaLaComprarRealizada(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompra.compra(tdatos.get(0))));
    }

    @Y("^cerrar sesion$")
    public void cerrarSesion() {
    }
}
