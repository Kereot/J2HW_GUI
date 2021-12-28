package com.example.fx_jhw;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public TextField tf;
    @FXML
    public TextArea ta;

    @FXML
    public void sendMsg() {
        ta.appendText(tf.getText() + "\n");
        tf.clear();
        tf.requestFocus();
    }
}