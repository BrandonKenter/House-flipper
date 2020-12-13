package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;


public class Controller extends ButtonsAndLabels {

    Property property0;
    Property property1;
    Property property2;
    Property property3;
    Property property4;

    public void contButtonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("property0.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        property0 = new Property(0);
        initializeCells(root, property0);
    }

    public void nextButtonClicked0(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("property1.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        property1 = new Property(1);
        initializeCells(root, property1);
    }

    public void nextButtonClicked1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("property2.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        property2 = new Property(2);
        initializeCells(root, property2);
    }


    public void nextButtonClicked2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("property3.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        property3 = new Property(3);
        initializeCells(root, property3);
    }

    public void nextButtonClicked3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("property4.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        property4 = new Property(4);
        initializeCells(root, property4);
    }

    public void nextButtonClicked4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("report.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();
    }
    

    public void endButtonClicked() {
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();
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

    /**
     * Initializes the cells of the page that it is sent.
     * @param root
     */
    public void initializeCells(Parent root, Property property) {
        propertyLocation = (Label) root.lookup("#propertyLocation");
        propertySqFt = (Label) root.lookup("#propertySqFt");
        propertyPrice = (Label) root.lookup("#propertyPrice");
        propertyParagraph = (Label) root.lookup("#propertyParagraph");

        if (propertyLocation!=null) propertyLocation.setText(property.propertyLocation);
        if (propertySqFt!=null) propertySqFt.setText(property.propertySqFt);
        if (propertyPrice!=null) propertyPrice.setText(property.propertyPrice);
        if (propertyParagraph!=null) propertyParagraph.setText(property.propertyParagraph);

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

        if (rd00!=null) rd00.setText(property.rd00);
        if (rd01!=null) rd01.setText(property.rd01);
        if (rd02!=null) rd02.setText(property.rd02);
        if (rd03!=null) rd03.setText(property.rd03);
        if (rd04!=null) rd04.setText(property.rd04);
        if (rd05!=null) rd05.setText(property.rd05);
        if (rd06!=null) rd06.setText(property.rd06);
        if (rd07!=null) rd07.setText(property.rd07);
        if (rd08!=null) rd08.setText(property.rd08);
        if (rd09!=null) rd09.setText(property.rd09);

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

        if (mp00!=null) mp00.setText(property.mp00);
        if (mp01!=null) mp01.setText(property.mp01);
        if (mp02!=null) mp02.setText(property.mp02);
        if (mp03!=null) mp03.setText(property.mp03);
        if (mp04!=null) mp04.setText(property.mp04);
        if (mp05!=null) mp05.setText(property.mp05);
        if (mp06!=null) mp06.setText(property.mp06);
        if (mp07!=null) mp07.setText(property.mp07);
        if (mp08!=null) mp08.setText(property.mp08);
        if (mp09!=null) mp09.setText(property.mp09);

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

        if (ed00!=null) ed00.setText(property.ed00);
        if (ed01!=null) ed01.setText(property.ed01);
        if (ed02!=null) ed02.setText(property.ed02);
        if (ed03!=null) ed03.setText(property.ed03);
        if (ed04!=null) ed04.setText(property.ed04);
        if (ed05!=null) ed05.setText(property.ed05);
        if (ed06!=null) ed06.setText(property.ed06);
        if (ed07!=null) ed07.setText(property.ed07);
        if (ed08!=null) ed08.setText(property.ed08);
        if (ed09!=null) ed09.setText(property.ed09);

        cb0 = (CheckBox) root.lookup("#cb0");
        if (cb0.isSelected()) { property.cb0 = true; }
    }
}