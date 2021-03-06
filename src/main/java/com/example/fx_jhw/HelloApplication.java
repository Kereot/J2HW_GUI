package com.example.fx_jhw;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override @FXML
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Chat window");
        stage.setScene(scene);
        stage.show();
        stage.setMinHeight(250);
        stage.setMinWidth(300);
    }

    @FXML
    public static void main(String[] args) {
        launch();
    }
}