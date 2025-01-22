module ru.skyrkov.doptask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.doptask3 to javafx.fxml;
    exports ru.skyrkov.doptask3;
}