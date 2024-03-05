module com.saaweel {
    requires javafx.controls;
    requires javafx.fxml;
    requires jasperreports;
    requires java.sql;
    requires org.slf4j;

    opens com.saaweel to javafx.fxml;
    exports com.saaweel;
    exports com.saaweel.controller;
    exports com.saaweel.model;
    opens com.saaweel.controller to javafx.fxml;
}
