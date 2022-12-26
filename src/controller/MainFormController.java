package controller;

import animatefx.animation.FadeIn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    @FXML
    private AnchorPane pane;
    @FXML
    void btnOnAction(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Stage stage = (Stage) pane.getScene().getWindow();
        new FadeIn(pane).play();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SecondForm.fxml"))));
    }
}


