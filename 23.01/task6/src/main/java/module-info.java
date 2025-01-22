module ru.skyrkov.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task6 to javafx.fxml;
    exports ru.skyrkov.task6;
}