package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller extends ButtonsAndLabels {

    public void contButtonClicked(javafx.event.ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) cont.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("property0.fxml"));
        primaryStage.setTitle("Property 1");
        primaryStage.setScene(new Scene(root, 1033, 739));
        primaryStage.show();
    }

    public void prevButtonClicked() {
    }

    public void discardButtonClicked() {
    }

    public void approveButtonClicked() {

    }

    public void nextButtonClicked1(ActionEvent actionEvent) {
    }

    public void nextButtonClicked2(ActionEvent actionEvent) {
    }

    public void nextButtonClicked3(ActionEvent actionEvent) {
    }

    public void nextButtonClicked4(ActionEvent actionEvent) {
    }

    public void nextButtonClicked0(ActionEvent actionEvent) {
    }
}
