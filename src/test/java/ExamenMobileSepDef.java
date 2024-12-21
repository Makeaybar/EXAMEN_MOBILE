import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ExamenMobileSepDef {
    @Steps
    LoginSteps loginSteps;
    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        loginSteps.prodcuto();

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {

    }


    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
    }

    @When("agrego <UNIDADES> del siguiente producto <PRODUCTO>")
    public void agregoUNIDADESDelSiguienteProductoPRODUCTO() {
    }

    @When("^agrego del siguiente producto (.*) (.*)$")
    public void agregoDelSiguienteProductoPRODUCTOUNIDADES() {
    }
}
