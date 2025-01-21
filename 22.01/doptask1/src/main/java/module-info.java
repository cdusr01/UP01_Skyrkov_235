module ru.skyrkov.doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.doptask1 to javafx.fxml;
    exports ru.skyrkov.doptask1;
}