package newexperience.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import newexperience.model.TDatos;
import newexperience.questions.Verificar;
import newexperience.questions.VerificarVacio;
import newexperience.questions.Verificarfallido;
import newexperience.tasks.AbrirPagina;
import newexperience.tasks.RegistrarCorreo;
import newexperience.tasks.RegistrarDatosPersonales;
import newexperience.userinterface.LocalizadorDatos;

import java.util.List;

public class StepDefinitionsRegistro {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario ingresa a la pagina web new experience$")
    public void queElUsuarioIngresaALaPaginaWebNewExperience() {
        OnStage.theActorCalled("Raul").wasAbleTo(AbrirPagina.pagina());
    }

    @Cuando("^Diligencia correo$")
    public void diligencia(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarCorreo.correo(tdatos.get(0)));
    }

    @Y("^diligencia los datos peronales$")
    public void diligenciaLosDatosPeronales(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistrarDatosPersonales.datosPersonales(tdatos.get(0)));
    }

    @Entonces("^verifica que el registro fue satisfactorio$")
    public void verificaQueElRegistroFueSatisfactorio(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.registro(tdatos.get(0))));

    }

    @Entonces("^verifica que el registro fue fallido$")
    public void verificaQueElRegistroFueFallido(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificarfallido.registrofallido(tdatos.get(0))));
    }
    @Y("^diligencia incompletos los datos peronales$")
    public void diligenciaIncompletosLosDatosPeronales() {
        OnStage.theActorInTheSpotlight().attemptsTo((Click.on(LocalizadorDatos.REGISTRAR)));

    }

    @Entonces("^verifica que el registro no fue permitido$")
    public void verificaQueElRegistroNoFuePermitido(List<TDatos> tdatos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarVacio.registrovacio(tdatos.get(0))));
    }


}
