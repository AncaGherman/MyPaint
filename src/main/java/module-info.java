module com.example.mypaint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mypaint to javafx.fxml;
    exports com.example.mypaint;
}