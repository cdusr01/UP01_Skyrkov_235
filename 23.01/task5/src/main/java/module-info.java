module ru.skyrkov.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.skyrkov.task5 to javafx.fxml;
    exports ru.skyrkov.task5;
}