module ru.skyrkov.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task1 to javafx.fxml;
    exports ru.skyrkov.task1;
}