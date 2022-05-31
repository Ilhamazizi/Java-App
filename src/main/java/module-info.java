module com.stmik {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.stmik to javafx.fxml;
    exports com.stmik;
}
