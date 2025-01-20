module ru.skyrkov.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task2 to javafx.fxml;
    exports ru.skyrkov.task2;
}