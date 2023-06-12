module com.example.coffeeloverog {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.coffeeloverog to javafx.fxml;
    exports com.example.coffeeloverog;
}