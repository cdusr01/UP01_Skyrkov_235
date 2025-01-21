module ru.skyrkov.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task3 to javafx.fxml;
    exports ru.skyrkov.task3;
}