module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxjdbc to javafx.fxml;
    exports com.example.javafxjdbc;
}