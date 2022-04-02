package io.github.tlundcomputing;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class MainScreenController {


    public void viewPrevious(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("Keen Eyes");
        alert.setContentText("Well done for finding a this feature but it is not ready yet. Check back soon");
        alert.showAndWait();
    }

    public void createQLA(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("TODO Next");
        alert.setHeaderText("Construction in progress");
        alert.setContentText("This is currently being constructed. Please wear a hard hat");
        alert.showAndWait();
    }
}
