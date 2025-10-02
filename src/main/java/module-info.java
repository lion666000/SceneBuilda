module com.example.scenebuilda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenebuilda to javafx.fxml;
    exports com.example.scenebuilda;
}