module ru.skyrkov.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task4 to javafx.fxml;
    exports ru.skyrkov.task4;
}