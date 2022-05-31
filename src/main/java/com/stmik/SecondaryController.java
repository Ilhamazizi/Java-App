package com.stmik;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToThree() throws IOException {
        App.setRoot("three");
    }
}