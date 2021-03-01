package steps;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StepDefinition {

    public String primeiroTeste(String txt){
        String retorno = "null";
        if (txt.equals("Teste")) {
            retorno = "Sucesso!";
        }
        return retorno;
    }
}