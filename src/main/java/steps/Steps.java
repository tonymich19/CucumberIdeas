package steps;

import io.cucumber.java.pt.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class Steps {

    StepDefinition stepDef = new StepDefinition();

    String aux;


    @Dado("que estou realizando primeiro teste")
    public void queEstouRealizandoPrimeiroTeste() throws Throwable{
    }

    @Quando("envio {string}")
    public void envio(String txt)  throws Throwable {
        aux = stepDef.primeiroTeste(txt);
    }

    @Entao("recebo {string}")
    public void recebo(String txt) throws Throwable{
        assertThat(txt, equalTo(aux));
    }
}
