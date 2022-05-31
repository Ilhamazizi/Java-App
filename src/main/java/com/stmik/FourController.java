package com.stmik;

import java.io.IOException;
import javafx.fxml.FXML;

public class FourController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
