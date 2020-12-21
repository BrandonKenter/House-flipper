package flipper;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * Controller to handle button events.
 */
public class Controller extends Controls {

    /**
     *
     * @param event
     * @throws IOException
     */
    public void contButtonClicked(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, Property.property0);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked0(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));

        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, Property.property1);
        Property.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, Property.property2);
        Property.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, Property.property3);
        Property.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, Property.property4);
        Property.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/ReportScreen.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        setReportCells(root);
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked0() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb0 = (CheckBox) root.lookup("#cb0");
            Property.property0.propertyDetails.propertyRepairs[0].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[0].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb0 = (CheckBox) root.lookup("#cb0");
            Property.property1.propertyDetails.propertyRepairs[0].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[0].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb0 = (CheckBox) root.lookup("#cb0");
            Property.property2.propertyDetails.propertyRepairs[0].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[0].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb0 = (CheckBox) root.lookup("#cb0");
            Property.property3.propertyDetails.propertyRepairs[0].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[0].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb0 = (CheckBox) root.lookup("#cb0");
            Property.property4.propertyDetails.propertyRepairs[0].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[0].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked1() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb1 = (CheckBox) root.lookup("#cb1");
            Property.property0.propertyDetails.propertyRepairs[1].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[1].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb1 = (CheckBox) root.lookup("#cb1");
            Property.property1.propertyDetails.propertyRepairs[1].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[1].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb1 = (CheckBox) root.lookup("#cb1");
            Property.property2.propertyDetails.propertyRepairs[1].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[1].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb1 = (CheckBox) root.lookup("#cb1");
            Property.property3.propertyDetails.propertyRepairs[1].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[1].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb1 = (CheckBox) root.lookup("#cb1");
            Property.property4.propertyDetails.propertyRepairs[1].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[1].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked2() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb2 = (CheckBox) root.lookup("#cb2");
            Property.property0.propertyDetails.propertyRepairs[2].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[2].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb2 = (CheckBox) root.lookup("#cb2");
            Property.property1.propertyDetails.propertyRepairs[2].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[2].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb2 = (CheckBox) root.lookup("#cb2");
            Property.property2.propertyDetails.propertyRepairs[2].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[2].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb2 = (CheckBox) root.lookup("#cb2");
            Property.property3.propertyDetails.propertyRepairs[2].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[2].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb2 = (CheckBox) root.lookup("#cb2");
            Property.property4.propertyDetails.propertyRepairs[2].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[2].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked3() throws IOException {
            if (Property.propertyNum == 0) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
                cb3 = (CheckBox) root.lookup("#cb3");
                Property.property0.propertyDetails.propertyRepairs[3].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[3].repairCheckButton;
            }
            if (Property.propertyNum == 1) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
                cb3 = (CheckBox) root.lookup("#cb3");
                Property.property1.propertyDetails.propertyRepairs[3].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[3].repairCheckButton;
            }
            if (Property.propertyNum == 2) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
                cb3 = (CheckBox) root.lookup("#cb3");
                Property.property2.propertyDetails.propertyRepairs[3].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[3].repairCheckButton;
            }
            if (Property.propertyNum == 3) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
                cb3 = (CheckBox) root.lookup("#cb3");
                Property.property3.propertyDetails.propertyRepairs[3].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[3].repairCheckButton;
            }
            if (Property.propertyNum == 4) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
                cb3 = (CheckBox) root.lookup("#cb3");
                Property.property4.propertyDetails.propertyRepairs[3].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[3].repairCheckButton;
            }
        }

    /**
     *
      * @throws IOException
     */
    public void checkBoxClicked4() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb4 = (CheckBox) root.lookup("#cb4");
            Property.property0.propertyDetails.propertyRepairs[4].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[4].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb4 = (CheckBox) root.lookup("#cb4");
            Property.property1.propertyDetails.propertyRepairs[4].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[4].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb4 = (CheckBox) root.lookup("#cb4");
            Property.property2.propertyDetails.propertyRepairs[4].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[4].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb4 = (CheckBox) root.lookup("#cb4");
            Property.property3.propertyDetails.propertyRepairs[4].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[4].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb4 = (CheckBox) root.lookup("#cb4");
            Property.property4.propertyDetails.propertyRepairs[4].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[4].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked5() throws IOException {
            if (Property.propertyNum == 0) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
                cb5 = (CheckBox) root.lookup("#cb5");
                Property.property0.propertyDetails.propertyRepairs[5].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[5].repairCheckButton;
            }
            if (Property.propertyNum == 1) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
                cb5 = (CheckBox) root.lookup("#cb5");
                Property.property1.propertyDetails.propertyRepairs[5].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[5].repairCheckButton;
            }
            if (Property.propertyNum == 2) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
                cb5 = (CheckBox) root.lookup("#cb5");
                Property.property2.propertyDetails.propertyRepairs[5].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[5].repairCheckButton;
            }
            if (Property.propertyNum == 3) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
                cb5 = (CheckBox) root.lookup("#cb5");
                Property.property3.propertyDetails.propertyRepairs[5].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[5].repairCheckButton;
            }
            if (Property.propertyNum == 4) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
                cb5 = (CheckBox) root.lookup("#cb5");
                Property.property4.propertyDetails.propertyRepairs[5].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[5].repairCheckButton;
            }
        }

    /**
     *
      * @throws IOException
     */
    public void checkBoxClicked6() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb6 = (CheckBox) root.lookup("#cb6");
            Property.property0.propertyDetails.propertyRepairs[6].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[6].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb6 = (CheckBox) root.lookup("#cb6");
            Property.property1.propertyDetails.propertyRepairs[6].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[6].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb6 = (CheckBox) root.lookup("#cb6");
            Property.property2.propertyDetails.propertyRepairs[6].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[6].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb6 = (CheckBox) root.lookup("#cb6");
            Property.property3.propertyDetails.propertyRepairs[6].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[6].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb6 = (CheckBox) root.lookup("#cb6");
            Property.property4.propertyDetails.propertyRepairs[6].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[6].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked7() throws IOException {
            if (Property.propertyNum == 0) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
                cb7 = (CheckBox) root.lookup("#cb7");
                Property.property0.propertyDetails.propertyRepairs[7].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[7].repairCheckButton;
            }
            if (Property.propertyNum == 1) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
                cb7 = (CheckBox) root.lookup("#cb7");
                Property.property1.propertyDetails.propertyRepairs[7].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[7].repairCheckButton;
            }
            if (Property.propertyNum == 2) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
                cb7 = (CheckBox) root.lookup("#cb7");
                Property.property2.propertyDetails.propertyRepairs[7].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[7].repairCheckButton;
            }
            if (Property.propertyNum == 3) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
                cb7 = (CheckBox) root.lookup("#cb7");
                Property.property3.propertyDetails.propertyRepairs[7].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[7].repairCheckButton;
            }
            if (Property.propertyNum == 4) {
                Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
                cb7 = (CheckBox) root.lookup("#cb7");
                Property.property4.propertyDetails.propertyRepairs[7].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[7].repairCheckButton;
            }
        }

    /**
     *
      * @throws IOException
     */
    public void checkBoxClicked8() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb8 = (CheckBox) root.lookup("#cb8");
            Property.property0.propertyDetails.propertyRepairs[8].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[8].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb8 = (CheckBox) root.lookup("#cb8");
            Property.property1.propertyDetails.propertyRepairs[8].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[8].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb8 = (CheckBox) root.lookup("#cb8");
            Property.property2.propertyDetails.propertyRepairs[8].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[8].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb8 = (CheckBox) root.lookup("#cb8");
            Property.property3.propertyDetails.propertyRepairs[8].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[8].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb8 = (CheckBox) root.lookup("#cb8");
            Property.property4.propertyDetails.propertyRepairs[8].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[8].repairCheckButton;
        }
    }

    /**
     *
     * @throws IOException
     */
    public void checkBoxClicked9() throws IOException {
        if (Property.propertyNum == 0) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen0.fxml")));
            cb9 = (CheckBox) root.lookup("#cb9");
            Property.property0.propertyDetails.propertyRepairs[9].repairCheckButton = !Property.property0.propertyDetails.propertyRepairs[9].repairCheckButton;
        }
        if (Property.propertyNum == 1) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen1.fxml")));
            cb9 = (CheckBox) root.lookup("#cb9");
            Property.property1.propertyDetails.propertyRepairs[9].repairCheckButton = !Property.property1.propertyDetails.propertyRepairs[9].repairCheckButton;
        }
        if (Property.propertyNum == 2) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen2.fxml")));
            cb9 = (CheckBox) root.lookup("#cb9");
            Property.property2.propertyDetails.propertyRepairs[9].repairCheckButton = !Property.property2.propertyDetails.propertyRepairs[9].repairCheckButton;
        }
        if (Property.propertyNum == 3) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen3.fxml")));
            cb9 = (CheckBox) root.lookup("#cb9");
            Property.property3.propertyDetails.propertyRepairs[9].repairCheckButton = !Property.property3.propertyDetails.propertyRepairs[9].repairCheckButton;
        }
        if (Property.propertyNum == 4) {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("flipper/screens/PropertyScreen4.fxml")));
            cb9 = (CheckBox) root.lookup("#cb9");
            Property.property4.propertyDetails.propertyRepairs[9].repairCheckButton = !Property.property4.propertyDetails.propertyRepairs[9].repairCheckButton;
        }
    }

    /**
     * Closes the application.
     */
    public void endButtonClicked() {
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();
    }

    /**
     *
     */
    public void approveButtonClicked0() {
        Property.property0.propertyDetails.propertyApproved = true;
        circleStatus0.setStyle("-fx-fill: #58FF36");
        approve0.setDisable(true);
        next0.setDisable(false);
        discard0.setDisable(false);
    }

    /**
     *
     */
    public void approveButtonClicked1() {
        Property.property1.propertyDetails.propertyApproved = true;
        circleStatus1.setStyle("-fx-fill: #58FF36");
        approve1.setDisable(true);
        next1.setDisable(false);
        discard1.setDisable(false);
    }

    /**
     *
     */
    public void approveButtonClicked2() {
        Property.property2.propertyDetails.propertyApproved = true;
        circleStatus2.setStyle("-fx-fill: #58FF36");
        approve2.setDisable(true);
        next2.setDisable(false);
        discard2.setDisable(false);
    }

    /**
     *
     */
    public void approveButtonClicked3() {
        Property.property3.propertyDetails.propertyApproved = true;
        circleStatus3.setStyle("-fx-fill: #58FF36");
        approve3.setDisable(true);
        next3.setDisable(false);
        discard3.setDisable(false);
    }

    /**
     *
     */
    public void approveButtonClicked4() {
        Property.property4.propertyDetails.propertyApproved = true;
        circleStatus4.setStyle("-fx-fill: #58FF36");
        approve4.setDisable(true);
        next4.setDisable(false);
        discard4.setDisable(false);
    }

    /**
     *
     */
    public void discardButtonClicked0() {
        circleStatus0.setStyle("-fx-fill: #FF0000");
        discard0.setDisable(true);
        next0.setDisable(false);
        approve0.setDisable(false);
        Property.property0.propertyDetails.propertyApproved = false;
    }

    /**
     *
     */
    public void discardButtonClicked1() {
        circleStatus1.setStyle("-fx-fill: #FF0000");
        discard1.setDisable(true);
        next1.setDisable(false);
        approve1.setDisable(false);
        Property.property1.propertyDetails.propertyApproved = false;
    }

    /**
     *
     */
    public void discardButtonClicked2() {
        circleStatus2.setStyle("-fx-fill: #FF0000");
        discard2.setDisable(true);
        next2.setDisable(false);
        approve2.setDisable(false);
        Property.property2.propertyDetails.propertyApproved = false;
    }

    /**
     *
     */
    public void discardButtonClicked3() {
        circleStatus3.setStyle("-fx-fill: #FF0000");
        discard3.setDisable(true);
        next3.setDisable(false);
        approve3.setDisable(false);
        Property.property3.propertyDetails.propertyApproved = false;
    }

    /**
     *
     */
    public void discardButtonClicked4() {
        circleStatus4.setStyle("-fx-fill: #FF0000");
        discard4.setDisable(true);
        next4.setDisable(false);
        approve4.setDisable(false);
        Property.property4.propertyDetails.propertyApproved = false;
    }

    /**
     *  Initializes the cells in the report page.
     * @param root
     */
    private void setReportCells(Parent root) {
        // Spent totals for each property
        int propertySpent0 = 0;
        int propertySpent1 = 0;
        int propertySpent2 = 0;
        int propertySpent3 = 0;
        int propertySpent4 = 0;

        // Net profit for each property
        int propertyNetProfit0 = 0;
        int propertyNetProfit1 = 0;
        int propertyNetProfit2 = 0;
        int propertyNetProfit3 = 0;
        int propertyNetProfit4 = 0;

        // Totals for all properties
        int totalSpentValue;
        int totalNetProfitValue;

        // Get total amount spent on each property.
        if (Property.property0.propertyDetails.propertyApproved != null && Property.property0.propertyDetails.propertyApproved) {
            propertySpent0 = Property.property0.propertyDetails.calculateAmountSpentTotal(Property.property0);
            propertyNetProfit0 = propertySpent0 + (Property.property0.propertyDetails.calculateValueAddedTotal(Property.property0) - propertySpent0);
        }
        if (Property.property1.propertyDetails.propertyApproved != null && Property.property1.propertyDetails.propertyApproved) {
            propertySpent1 = Property.property1.propertyDetails.calculateAmountSpentTotal(Property.property1);
            propertyNetProfit1 = propertySpent1 + Property.property1.propertyDetails.calculateValueAddedTotal(Property.property1) - propertySpent1;
        }
        if (Property.property2.propertyDetails.propertyApproved != null && Property.property2.propertyDetails.propertyApproved) {
            propertySpent2 = Property.property2.propertyDetails.calculateAmountSpentTotal(Property.property2);
            propertyNetProfit2 = propertySpent2 + Property.property2.propertyDetails.calculateValueAddedTotal(Property.property2) - propertySpent2;
        }
        if (Property.property3.propertyDetails.propertyApproved != null && Property.property3.propertyDetails.propertyApproved) {
            propertySpent3 = Property.property3.propertyDetails.calculateAmountSpentTotal(Property.property3);
            propertyNetProfit3 = propertySpent3 + Property.property3.propertyDetails.calculateValueAddedTotal(Property.property3) - propertySpent3;
        }
        if (Property.property4.propertyDetails.propertyApproved != null && Property.property4.propertyDetails.propertyApproved) {
            propertySpent4 = Property.property4.propertyDetails.calculateAmountSpentTotal(Property.property4);
            propertyNetProfit4 = propertySpent4 + Property.property4.propertyDetails.calculateValueAddedTotal(Property.property4) - propertySpent4;
        }

        // Calculate totals for bottom summary
        totalSpentValue = propertySpent0 + propertySpent1 + propertySpent2 + propertySpent3 + propertySpent4;
        totalNetProfitValue = propertyNetProfit0 + propertyNetProfit1 + propertyNetProfit2 + propertyNetProfit3 + propertyNetProfit4;

        // Set Purchase Price column
        purchasePrice0 = (Label) root.lookup("#purchasePrice0");
        purchasePrice1 = (Label) root.lookup("#purchasePrice1");
        purchasePrice2 = (Label) root.lookup("#purchasePrice2");
        purchasePrice3 = (Label) root.lookup("#purchasePrice3");
        purchasePrice4 = (Label) root.lookup("#purchasePrice4");
        if (purchasePrice0!=null) purchasePrice0.setText("$" + Property.property0.propertyDetails.propertyPrice);
        if (purchasePrice1!=null) purchasePrice1.setText("$" + Property.property1.propertyDetails.propertyPrice);
        if (purchasePrice2!=null) purchasePrice2.setText("$" + Property.property2.propertyDetails.propertyPrice);
        if (purchasePrice3!=null) purchasePrice3.setText("$" + Property.property3.propertyDetails.propertyPrice);
        if (purchasePrice4!=null) purchasePrice4.setText("$" + Property.property4.propertyDetails.propertyPrice);

        // Set Materials Price column
        materialsPrice0 = (Label) root.lookup("#materialsPrice0");
        materialsPrice1 = (Label) root.lookup("#materialsPrice1");
        materialsPrice2 = (Label) root.lookup("#materialsPrice2");
        materialsPrice3 = (Label) root.lookup("#materialsPrice3");
        materialsPrice4 = (Label) root.lookup("#materialsPrice4");
        if (materialsPrice0!=null) materialsPrice0.setText(String.valueOf("$" + Property.property0.propertyDetails.calculateMaterialsPriceTotal(Property.property0)));
        if (materialsPrice1!=null) materialsPrice1.setText(String.valueOf("$" + Property.property1.propertyDetails.calculateMaterialsPriceTotal(Property.property1)));
        if (materialsPrice2!=null) materialsPrice2.setText(String.valueOf("$" + Property.property2.propertyDetails.calculateMaterialsPriceTotal(Property.property2)));
        if (materialsPrice3!=null) materialsPrice3.setText(String.valueOf("$" + Property.property3.propertyDetails.calculateMaterialsPriceTotal(Property.property3)));
        if (materialsPrice4!=null) materialsPrice4.setText(String.valueOf("$" + Property.property4.propertyDetails.calculateMaterialsPriceTotal(Property.property4)));

        // Set Labor Price column
        laborPrice0 = (Label) root.lookup("#laborPrice0");
        laborPrice1 = (Label) root.lookup("#laborPrice1");
        laborPrice2 = (Label) root.lookup("#laborPrice2");
        laborPrice3 = (Label) root.lookup("#laborPrice3");
        laborPrice4 = (Label) root.lookup("#laborPrice4");
        if (laborPrice0!=null) laborPrice0.setText(String.valueOf("$" + Property.property0.propertyDetails.calculateLaborPriceTotal(Property.property0)));
        if (laborPrice1!=null) laborPrice1.setText(String.valueOf("$" + Property.property1.propertyDetails.calculateLaborPriceTotal(Property.property1)));
        if (laborPrice2!=null) laborPrice2.setText(String.valueOf("$" + Property.property2.propertyDetails.calculateLaborPriceTotal(Property.property2)));
        if (laborPrice3!=null) laborPrice3.setText(String.valueOf("$" + Property.property3.propertyDetails.calculateLaborPriceTotal(Property.property3)));
        if (laborPrice4!=null) laborPrice4.setText(String.valueOf("$" + Property.property4.propertyDetails.calculateLaborPriceTotal(Property.property4)));

        // Set spent column
        spent0 = (Label) root.lookup("#spent0");
        spent1 = (Label) root.lookup("#spent1");
        spent2 = (Label) root.lookup("#spent2");
        spent3 = (Label) root.lookup("#spent3");
        spent4 = (Label) root.lookup("#spent4");
        if (spent0!=null) spent0.setText("$" + (propertySpent0));
        if (spent1!=null) spent1.setText("$" + (propertySpent1));
        if (spent2!=null) spent2.setText("$" + (propertySpent2));
        if (spent3!=null) spent3.setText("$" + (propertySpent3));
        if (spent4!=null) spent4.setText("$" + (propertySpent4));

        // Set Est. Sale Price column
        estSalePrice0 = (Label) root.lookup("#estSalePrice0");
        estSalePrice1 = (Label) root.lookup("#estSalePrice1");
        estSalePrice2 = (Label) root.lookup("#estSalePrice2");
        estSalePrice3 = (Label) root.lookup("#estSalePrice3");
        estSalePrice4 = (Label) root.lookup("#estSalePrice4");
        if (estSalePrice0!=null) estSalePrice0.setText("$" + Property.property0.propertyDetails.calculateValueAddedTotal(Property.property0));
        if (estSalePrice1!=null) estSalePrice1.setText("$" + Property.property1.propertyDetails.calculateValueAddedTotal(Property.property1));
        if (estSalePrice2!=null) estSalePrice2.setText("$" + Property.property2.propertyDetails.calculateValueAddedTotal(Property.property2));
        if (estSalePrice3!=null) estSalePrice3.setText("$" + Property.property3.propertyDetails.calculateValueAddedTotal(Property.property3));
        if (estSalePrice4!=null) estSalePrice4.setText("$" + Property.property4.propertyDetails.calculateValueAddedTotal(Property.property4));

        // Set Net Profit column
        netProfit0 = (Label) root.lookup("#netProfit0");
        netProfit1 = (Label) root.lookup("#netProfit1");
        netProfit2 = (Label) root.lookup("#netProfit2");
        netProfit3 = (Label) root.lookup("#netProfit3");
        netProfit4 = (Label) root.lookup("#netProfit4");
        if (netProfit0!=null) netProfit0.setText("$" + (Property.property0.propertyDetails.calculateValueAddedTotal(Property.property0) - propertySpent0));
        if (netProfit1!=null) netProfit1.setText("$" + (Property.property1.propertyDetails.calculateValueAddedTotal(Property.property1) - propertySpent1));
        if (netProfit2!=null) netProfit2.setText("$" + (Property.property2.propertyDetails.calculateValueAddedTotal(Property.property2) - propertySpent2));
        if (netProfit3!=null) netProfit3.setText("$" + (Property.property3.propertyDetails.calculateValueAddedTotal(Property.property3) - propertySpent3));
        if (netProfit4!=null) netProfit4.setText("$" + (Property.property4.propertyDetails.calculateValueAddedTotal(Property.property4) - propertySpent4));

        // Set bottom of page total spent
        totalSpent = (Label) root.lookup("#totalSpent");
        String totSpent = Integer.toString(totalSpentValue);
        totalSpent.setText("$" + totSpent);

        // Set bottom of page total profit
        totalProfit = (Label) root.lookup("#totalProfit");
        String totProf = Integer.toString(totalNetProfitValue);
        totalProfit.setText("$" + totProf);
    }

    /**
     *
     * @param root
     * @param property
     */
    private void initializeCells(Parent root, Property property) {
        // Set Property Description
        propertyLocation = (Label) root.lookup("#propertyLocation");
        propertyPrice = (Label) root.lookup("#propertyPrice");
        propertyPrice = (Label) root.lookup("#propertyPrice");
        propertyComps = (Label) root.lookup("#propertyComps");
        propertySqFt = (Label) root.lookup("#propertySqFt");
        propertyLotSize = (Label) root.lookup("#propertyLotSize");
        propertyBedBath = (Label) root.lookup("#propertyBedBath");
        propertyYearBuilt = (Label) root.lookup("#propertyYearBuilt");
        propertyOccupancyType = (Label) root.lookup("#propertyOccupancyType");
        propertyLastSold = (Label) root.lookup("#propertyLastSold");
        propertyTimeOnMarket = (Label) root.lookup("#propertyTimeOnMarket");
        if (propertyLocation!=null) propertyLocation.setText("Location: " + property.propertyDetails.propertyLocation);
        if (propertyPrice!=null) propertyPrice.setText("Price: $" + property.propertyDetails.propertyPrice);
        if (propertyComps!=null) propertyComps.setText("Comp Average: $" + property.propertyDetails.propertyComps);
        if (propertySqFt!=null) propertySqFt.setText("Square Feet: " + property.propertyDetails.propertySqFt);
        if (propertyLotSize!=null) propertyLotSize.setText("Lot Size: " + property.propertyDetails.propertyLotSize + " Acres");
        if (propertyBedBath!=null) propertyBedBath.setText("Beds/Baths: " + property.propertyDetails.propertyBedBath);
        if (propertyYearBuilt!=null) propertyYearBuilt.setText("Year Built: " + property.propertyDetails.propertyYearBuilt);
        if (propertyOccupancyType!=null) propertyOccupancyType.setText("Type: " + property.propertyDetails.propertyOccupancyType);
        if (propertyLastSold!=null) propertyLastSold.setText("Last Sold: " + property.propertyDetails.propertyLastSold);
        if (propertyTimeOnMarket!=null) propertyTimeOnMarket.setText("Days On Market: " + property.propertyDetails.propertyTimeOnMarket + " Days");

        // Set Repair Descriptions
        rd00 = (Label) root.lookup("#rd00");
        rd01 = (Label) root.lookup("#rd01");
        rd02 = (Label) root.lookup("#rd02");
        rd03 = (Label) root.lookup("#rd03");
        rd04 = (Label) root.lookup("#rd04");
        rd05 = (Label) root.lookup("#rd05");
        rd06 = (Label) root.lookup("#rd06");
        rd07 = (Label) root.lookup("#rd07");
        rd08 = (Label) root.lookup("#rd08");
        rd09 = (Label) root.lookup("#rd09");
        if (rd00!=null) rd00.setText(property.propertyDetails.propertyRepairs[0].repairDescription);
        if (rd01!=null) rd01.setText(property.propertyDetails.propertyRepairs[1].repairDescription);
        if (rd02!=null) rd02.setText(property.propertyDetails.propertyRepairs[2].repairDescription);
        if (rd03!=null) rd03.setText(property.propertyDetails.propertyRepairs[3].repairDescription);
        if (rd04!=null) rd04.setText(property.propertyDetails.propertyRepairs[4].repairDescription);
        if (rd05!=null) rd05.setText(property.propertyDetails.propertyRepairs[5].repairDescription);
        if (rd06!=null) rd06.setText(property.propertyDetails.propertyRepairs[6].repairDescription);
        if (rd07!=null) rd07.setText(property.propertyDetails.propertyRepairs[7].repairDescription);
        if (rd08!=null) rd08.setText(property.propertyDetails.propertyRepairs[8].repairDescription);
        if (rd09!=null) rd09.setText(property.propertyDetails.propertyRepairs[9].repairDescription);

        // Set Material Prices
        mp00 = (Label) root.lookup("#mp00");
        mp01 = (Label) root.lookup("#mp01");
        mp02 = (Label) root.lookup("#mp02");
        mp03 = (Label) root.lookup("#mp03");
        mp04 = (Label) root.lookup("#mp04");
        mp05 = (Label) root.lookup("#mp05");
        mp06 = (Label) root.lookup("#mp06");
        mp07 = (Label) root.lookup("#mp07");
        mp08 = (Label) root.lookup("#mp08");
        mp09 = (Label) root.lookup("#mp09");
        if (mp00!=null) mp00.setText("$" + property.propertyDetails.propertyRepairs[0].repairMaterialPrice);
        if (mp01!=null) mp01.setText("$" + property.propertyDetails.propertyRepairs[1].repairMaterialPrice);
        if (mp02!=null) mp02.setText("$" + property.propertyDetails.propertyRepairs[2].repairMaterialPrice);
        if (mp03!=null) mp03.setText("$" + property.propertyDetails.propertyRepairs[3].repairMaterialPrice);
        if (mp04!=null) mp04.setText("$" + property.propertyDetails.propertyRepairs[4].repairMaterialPrice);
        if (mp05!=null) mp05.setText("$" + property.propertyDetails.propertyRepairs[5].repairMaterialPrice);
        if (mp06!=null) mp06.setText("$" + property.propertyDetails.propertyRepairs[6].repairMaterialPrice);
        if (mp07!=null) mp07.setText("$" + property.propertyDetails.propertyRepairs[7].repairMaterialPrice);
        if (mp08!=null) mp08.setText("$" + property.propertyDetails.propertyRepairs[8].repairMaterialPrice);
        if (mp09!=null) mp09.setText("$" + property.propertyDetails.propertyRepairs[9].repairMaterialPrice);

        // Set Estimated Duration
        ed00 = (Label) root.lookup("#ed00");
        ed01 = (Label) root.lookup("#ed01");
        ed02 = (Label) root.lookup("#ed02");
        ed03 = (Label) root.lookup("#ed03");
        ed04 = (Label) root.lookup("#ed04");
        ed05 = (Label) root.lookup("#ed05");
        ed06 = (Label) root.lookup("#ed06");
        ed07 = (Label) root.lookup("#ed07");
        ed08 = (Label) root.lookup("#ed08");
        ed09 = (Label) root.lookup("#ed09");
        if (ed00!=null) ed00.setText(property.propertyDetails.propertyRepairs[0].repairCondition);
        if (ed01!=null) ed01.setText(property.propertyDetails.propertyRepairs[1].repairCondition);
        if (ed02!=null) ed02.setText(property.propertyDetails.propertyRepairs[2].repairCondition);
        if (ed03!=null) ed03.setText(property.propertyDetails.propertyRepairs[3].repairCondition);
        if (ed04!=null) ed04.setText(property.propertyDetails.propertyRepairs[4].repairCondition);
        if (ed05!=null) ed05.setText(property.propertyDetails.propertyRepairs[5].repairCondition);
        if (ed06!=null) ed06.setText(property.propertyDetails.propertyRepairs[6].repairCondition);
        if (ed07!=null) ed07.setText(property.propertyDetails.propertyRepairs[7].repairCondition);
        if (ed08!=null) ed08.setText(property.propertyDetails.propertyRepairs[8].repairCondition);
        if (ed09!=null) ed09.setText(property.propertyDetails.propertyRepairs[9].repairCondition);
    }
}