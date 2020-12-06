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

    public void contButtonClicked() throws IOException {
        Stage stage = (Stage) cont.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property0.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));

        Property property = new Property();
        propertyLocation0.setText(property.propertyLocation);
        propertySqFt0.setText(property.propertySqFt);
        propertyPrice0.setText(property.propertyPrice);
        propertyParagraph0.setText(property.propertyParagraph);

        stage.show();
    }

    public void endButtonClicked() throws IOException {
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();
    }

    public void nextButtonClicked0() throws IOException {
        Stage stage = (Stage) next0.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property1.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void nextButtonClicked1() throws IOException {
        Stage stage = (Stage) next1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property2.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void nextButtonClicked2() throws IOException {
        Stage stage = (Stage) next2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property3.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void nextButtonClicked3() throws IOException {
        Stage stage = (Stage) next3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property4.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void nextButtonClicked4() throws IOException {
        Stage stage = (Stage) next4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("report.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void prevButtonClicked0() {
        // First property, do nothing since can't go to previous property
    }

    public void prevButtonClicked1() throws IOException {
        Stage stage = (Stage) prev1.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property0.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void prevButtonClicked2() throws IOException {
        Stage stage = (Stage) prev2.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property1.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void prevButtonClicked3() throws IOException {
        Stage stage = (Stage) prev3.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property2.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void prevButtonClicked4() throws IOException {
        Stage stage = (Stage) prev4.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("property3.fxml"));
        stage.setTitle("House Flipper");
        stage.setScene(new Scene(root, 1033, 739));
        stage.show();
    }

    public void discardButtonClicked0() {
    }

    public void discardButtonClicked1() {
    }

    public void discardButtonClicked2() {
    }

    public void discardButtonClicked3() {
    }

    public void discardButtonClicked4() {
    }

    public void approveButtonClicked0() {
    }

    public void approveButtonClicked1() {
    }

    public void approveButtonClicked2() {
    }

    public void approveButtonClicked3() {
    }

    public void approveButtonClicked4() {
    }
}
