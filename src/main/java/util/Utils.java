package util;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Utils {

    public static void openReport(){
        String url = "target/cucumber/cucumber-html-reports/overview-features.html";
        File file = new File(url);
        try {
            Desktop.getDesktop().browse(file.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
