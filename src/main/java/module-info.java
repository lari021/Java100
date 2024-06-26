module com.example.excjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.excjava to javafx.fxml;
    exports com.example.excjava;
}