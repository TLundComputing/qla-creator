package io.github.tlundcomputing;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
        primaryStage.setTitle("QLA Report Generator");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
