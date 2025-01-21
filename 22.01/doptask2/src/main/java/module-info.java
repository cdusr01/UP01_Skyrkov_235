module ru.skyrkov.doptask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.doptask2 to javafx.fxml;
    exports ru.skyrkov.doptask2;
}