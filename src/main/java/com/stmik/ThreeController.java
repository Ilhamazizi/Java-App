package com.stmik;

import java.io.IOException;
import javafx.fxml.FXML;

public class ThreeController {

    @FXML
    private void switchToFour() throws IOException {
        App.setRoot("four");
    }
}
