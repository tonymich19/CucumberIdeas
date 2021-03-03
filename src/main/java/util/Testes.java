package util;

import com.google.gson.Gson;
import org.json.simple.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Testes {

    public static void main(String[] args) throws IOException {

        CapturaJson capJson = new CapturaJson();
        // Passamos o nome do arquivo json e o grupo de dados que queremos para o método que retorna
        // o objeto json com os dados que precisamos
        JSONObject json = capJson.getJsonDataObject("Massas.json", "transacoes2");

        String text = json.toString();

        System.out.println(text);

    }
}

