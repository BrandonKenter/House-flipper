package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class Controller {

    @FXML
    public Label rd0;
    @FXML
    public Label rd1;
    @FXML
    public Label rd2;
    @FXML
    public Label rd3;
    @FXML
    public Label rd4;
    @FXML
    public Label rd5;
    @FXML
    public Label rd6;
    @FXML
    public Label rd7;
    @FXML
    public Label rd8;
    @FXML
    public Label rd9;

    @FXML
    public Label mp0;
    @FXML
    public Label mp1;
    @FXML
    public Label mp2;
    @FXML
    public Label mp3;
    @FXML
    public Label mp4;
    @FXML
    public Label mp5;
    @FXML
    public Label mp6;
    @FXML
    public Label mp7;
    @FXML
    public Label mp8;
    @FXML
    public Label mp9;

    @FXML
    public Label ed0;
    @FXML
    public Label ed1;
    @FXML
    public Label ed2;
    @FXML
    public Label ed3;
    @FXML
    public Label ed4;
    @FXML
    public Label ed5;
    @FXML
    public Label ed6;
    @FXML
    public Label ed7;
    @FXML
    public Label ed8;
    @FXML
    public Label ed9;

    @FXML
    public CheckBox cb0;
    @FXML
    public CheckBox cb1;
    @FXML
    public CheckBox cb2;
    @FXML
    public CheckBox cb3;
    @FXML
    public CheckBox cb4;
    @FXML
    public CheckBox cb5;
    @FXML
    public CheckBox cb6;
    @FXML
    public CheckBox cb7;
    @FXML
    public CheckBox cb8;
    @FXML
    public CheckBox cb9;

    @FXML
    private Circle circleStatus;

    @FXML
    private Button approve;

    @FXML
    private Button discard;

    @FXML
    private Button previous;

    @FXML
    private Button cont;



    public void nextButtonClicked() throws IOException {
        Stage stage = (Stage) cont.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("property1.fxml"));
        primaryStage.setTitle("Property 1");
        primaryStage.setScene(new Scene(root, 1033, 739));
        primaryStage.show();
    }

    public void previousButtonClicked() {
    }

    public void discardButtonClicked() {
    }

    public void approveButtonClicked() {

    }
}
