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

/**
 *
 *
 */
public class Controller extends ButtonsAndLabels {

    Property property0 = new Property(0);
    Property property1 = new Property(1);
    Property property2 = new Property(2);
    Property property3 = new Property(3);
    Property property4 = new Property(4);

    /**
     *
     *
     * @param event
     * @throws IOException
     */
    public void contButtonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample/property0.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, property0);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked0(ActionEvent event) throws IOException {
        if (property0.propertyDetails.approved == null) {
            // TODO: If clicked when approve/discard not set, prompt to set it
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample/property1.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, property1);

        // TODO Save check button status
        saveCheckButtonStatus(root,0);

    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked1(ActionEvent event) throws IOException {
        if (property1.propertyDetails.approved == null) {
            // TODO: If clicked when approve/discard not set, prompt to set it
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample/property2.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, property2);

        // TODO Save check button status
        saveCheckButtonStatus(root,1);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked2(ActionEvent event) throws IOException {
        if (property2.propertyDetails.approved == null) {
            // TODO: If clicked when approve/discard not set, prompt to set it
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample/property3.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, property3);

        // TODO Save check button status
        saveCheckButtonStatus(root,2);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked3(ActionEvent event) throws IOException {
        if (property3.propertyDetails.approved == null) {
            // TODO: If clicked when approve/discard not set, prompt to set it
        }

        Parent root = FXMLLoader.load(getClass().getResource("sample/property4.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, property4);

        // TODO Save check button status
        saveCheckButtonStatus(root, 3);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked4(ActionEvent event) throws IOException {
        if (property4.propertyDetails.approved == null) {
            // TODO: If clicked when approve/discard not set, prompt to set it
        }

        /**
         * Open Loading Screen
         */
        // TODO Save check button status
        Parent root = FXMLLoader.load(getClass().getResource("sample/property4.fxml"));
        saveCheckButtonStatus(root, 4);


        /**
         * Open Report Screen
         */
        root = FXMLLoader.load(getClass().getResource("sample/report.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        setReportCells(root);

    }

    /**
     *
     */
    public void endButtonClicked() {
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();
    }

    public void approveButtonClicked0() {
        property0.propertyDetails.approved = true;
    }

    public void approveButtonClicked1() {
        property1.propertyDetails.approved = true;
    }

    public void approveButtonClicked2() {
        property2.propertyDetails.approved = true;
    }

    public void approveButtonClicked3() {
        property3.propertyDetails.approved = true;
    }

    public void approveButtonClicked4() {
        property4.propertyDetails.approved = true;
    }

    public void discardButtonClicked0() {
        property0.propertyDetails.approved = false;
    }

    public void discardButtonClicked1() {
        property1.propertyDetails.approved = false;
    }

    public void discardButtonClicked2() {
        property2.propertyDetails.approved = false;
    }

    public void discardButtonClicked3() {
        property3.propertyDetails.approved = false;
    }

    public void discardButtonClicked4() {
        property4.propertyDetails.approved = false;
    }


    /**
     * Sets the checkButton property for each button.
     *
     * @param root
     * @param propertyNum
     */
    public void saveCheckButtonStatus(Parent root, int propertyNum) {
        // TODO SAVE CHECK BUTTON STATUS
        if (propertyNum == 0) {
            cb0 = (CheckBox) root.lookup("#cb0");
            cb1 = (CheckBox) root.lookup("#cb1");
            cb2 = (CheckBox) root.lookup("#cb2");
            cb3 = (CheckBox) root.lookup("#cb3");
            cb4 = (CheckBox) root.lookup("#cb4");
            cb5 = (CheckBox) root.lookup("#cb5");
            cb6 = (CheckBox) root.lookup("#cb6");
            cb7 = (CheckBox) root.lookup("#cb7");
            cb8 = (CheckBox) root.lookup("#cb8");
            cb9 = (CheckBox) root.lookup("#cb9");

            if (cb0.isSelected()) { property0.propertyDetails.propertyRepairs[0].checkButton = true; }
            if (cb1.isSelected()) { property0.propertyDetails.propertyRepairs[1].checkButton = true; }
            if (cb2.isSelected()) { property0.propertyDetails.propertyRepairs[2].checkButton = true; }
            if (cb3.isSelected()) { property0.propertyDetails.propertyRepairs[3].checkButton = true; }
            if (cb4.isSelected()) { property0.propertyDetails.propertyRepairs[4].checkButton = true; }
            if (cb5.isSelected()) { property0.propertyDetails.propertyRepairs[5].checkButton = true; }
            if (cb6.isSelected()) { property0.propertyDetails.propertyRepairs[6].checkButton = true; }
            if (cb7.isSelected()) { property0.propertyDetails.propertyRepairs[7].checkButton = true; }
            if (cb8.isSelected()) { property0.propertyDetails.propertyRepairs[8].checkButton = true; }
            if (cb9.isSelected()) { property0.propertyDetails.propertyRepairs[9].checkButton = true; }
        }
        if (propertyNum == 1) {
            cb0 = (CheckBox) root.lookup("#cb0");
            cb1 = (CheckBox) root.lookup("#cb1");
            cb2 = (CheckBox) root.lookup("#cb2");
            cb3 = (CheckBox) root.lookup("#cb3");
            cb4 = (CheckBox) root.lookup("#cb4");
            cb5 = (CheckBox) root.lookup("#cb5");
            cb6 = (CheckBox) root.lookup("#cb6");
            cb7 = (CheckBox) root.lookup("#cb7");
            cb8 = (CheckBox) root.lookup("#cb8");
            cb9 = (CheckBox) root.lookup("#cb9");

            if (cb0.isSelected()) { property1.propertyDetails.propertyRepairs[0].checkButton = true; }
            if (cb1.isSelected()) { property1.propertyDetails.propertyRepairs[1].checkButton = true; }
            if (cb2.isSelected()) { property1.propertyDetails.propertyRepairs[2].checkButton = true; }
            if (cb3.isSelected()) { property1.propertyDetails.propertyRepairs[3].checkButton = true; }
            if (cb4.isSelected()) { property1.propertyDetails.propertyRepairs[4].checkButton = true; }
            if (cb5.isSelected()) { property1.propertyDetails.propertyRepairs[5].checkButton = true; }
            if (cb6.isSelected()) { property1.propertyDetails.propertyRepairs[6].checkButton = true; }
            if (cb7.isSelected()) { property1.propertyDetails.propertyRepairs[7].checkButton = true; }
            if (cb8.isSelected()) { property1.propertyDetails.propertyRepairs[8].checkButton = true; }
            if (cb9.isSelected()) { property1.propertyDetails.propertyRepairs[9].checkButton = true; }
        }
        if (propertyNum == 2) {
            cb0 = (CheckBox) root.lookup("#cb0");
            cb1 = (CheckBox) root.lookup("#cb1");
            cb2 = (CheckBox) root.lookup("#cb2");
            cb3 = (CheckBox) root.lookup("#cb3");
            cb4 = (CheckBox) root.lookup("#cb4");
            cb5 = (CheckBox) root.lookup("#cb5");
            cb6 = (CheckBox) root.lookup("#cb6");
            cb7 = (CheckBox) root.lookup("#cb7");
            cb8 = (CheckBox) root.lookup("#cb8");
            cb9 = (CheckBox) root.lookup("#cb9");

            if (cb0.isSelected()) { property2.propertyDetails.propertyRepairs[0].checkButton = true; }
            if (cb1.isSelected()) { property2.propertyDetails.propertyRepairs[1].checkButton = true; }
            if (cb2.isSelected()) { property2.propertyDetails.propertyRepairs[2].checkButton = true; }
            if (cb3.isSelected()) { property2.propertyDetails.propertyRepairs[3].checkButton = true; }
            if (cb4.isSelected()) { property2.propertyDetails.propertyRepairs[4].checkButton = true; }
            if (cb5.isSelected()) { property2.propertyDetails.propertyRepairs[5].checkButton = true; }
            if (cb6.isSelected()) { property2.propertyDetails.propertyRepairs[6].checkButton = true; }
            if (cb7.isSelected()) { property2.propertyDetails.propertyRepairs[7].checkButton = true; }
            if (cb8.isSelected()) { property2.propertyDetails.propertyRepairs[8].checkButton = true; }
            if (cb9.isSelected()) { property2.propertyDetails.propertyRepairs[9].checkButton = true; }
        }
        if (propertyNum == 3) {
            cb0 = (CheckBox) root.lookup("#cb0");
            cb1 = (CheckBox) root.lookup("#cb1");
            cb2 = (CheckBox) root.lookup("#cb2");
            cb3 = (CheckBox) root.lookup("#cb3");
            cb4 = (CheckBox) root.lookup("#cb4");
            cb5 = (CheckBox) root.lookup("#cb5");
            cb6 = (CheckBox) root.lookup("#cb6");
            cb7 = (CheckBox) root.lookup("#cb7");
            cb8 = (CheckBox) root.lookup("#cb8");
            cb9 = (CheckBox) root.lookup("#cb9");

            if (cb0.isSelected()) { property3.propertyDetails.propertyRepairs[0].checkButton = true; }
            if (cb1.isSelected()) { property3.propertyDetails.propertyRepairs[1].checkButton = true; }
            if (cb2.isSelected()) { property3.propertyDetails.propertyRepairs[2].checkButton = true; }
            if (cb3.isSelected()) { property3.propertyDetails.propertyRepairs[3].checkButton = true; }
            if (cb4.isSelected()) { property3.propertyDetails.propertyRepairs[4].checkButton = true; }
            if (cb5.isSelected()) { property3.propertyDetails.propertyRepairs[5].checkButton = true; }
            if (cb6.isSelected()) { property3.propertyDetails.propertyRepairs[6].checkButton = true; }
            if (cb7.isSelected()) { property3.propertyDetails.propertyRepairs[7].checkButton = true; }
            if (cb8.isSelected()) { property3.propertyDetails.propertyRepairs[8].checkButton = true; }
            if (cb9.isSelected()) { property3.propertyDetails.propertyRepairs[9].checkButton = true; }
        }
        if (propertyNum == 4) {
            cb0 = (CheckBox) root.lookup("#cb0");
            cb1 = (CheckBox) root.lookup("#cb1");
            cb2 = (CheckBox) root.lookup("#cb2");
            cb3 = (CheckBox) root.lookup("#cb3");
            cb4 = (CheckBox) root.lookup("#cb4");
            cb5 = (CheckBox) root.lookup("#cb5");
            cb6 = (CheckBox) root.lookup("#cb6");
            cb7 = (CheckBox) root.lookup("#cb7");
            cb8 = (CheckBox) root.lookup("#cb8");
            cb9 = (CheckBox) root.lookup("#cb9");

            if (cb0.isSelected()) { property4.propertyDetails.propertyRepairs[0].checkButton = true; }
            if (cb1.isSelected()) { property4.propertyDetails.propertyRepairs[1].checkButton = true; }
            if (cb2.isSelected()) { property4.propertyDetails.propertyRepairs[2].checkButton = true; }
            if (cb3.isSelected()) { property4.propertyDetails.propertyRepairs[3].checkButton = true; }
            if (cb4.isSelected()) { property4.propertyDetails.propertyRepairs[4].checkButton = true; }
            if (cb5.isSelected()) { property4.propertyDetails.propertyRepairs[5].checkButton = true; }
            if (cb6.isSelected()) { property4.propertyDetails.propertyRepairs[6].checkButton = true; }
            if (cb7.isSelected()) { property4.propertyDetails.propertyRepairs[7].checkButton = true; }
            if (cb8.isSelected()) { property4.propertyDetails.propertyRepairs[8].checkButton = true; }
            if (cb9.isSelected()) { property4.propertyDetails.propertyRepairs[9].checkButton = true; }
        }
    }

    /**
     *
     * @param root
     */
    public void setReportCells(Parent root) {
        calculateReportCells();
//        propertyLocation = (Label) root.lookup("#propertyLocation");
//        propertySqFt = (Label) root.lookup("#propertySqFt");
//        propertyPrice = (Label) root.lookup("#propertyPrice");
//        propertyParagraph = (Label) root.lookup("#propertyParagraph");
    }

    /**
     * Helper method for setReportCells() to calculate the values that are to be inserted into
     * the labels at these cells.
     */
    private void calculateReportCells() {
        int propertySpent0;
        int propertySpent1;
        int propertySpent2;
        int propertySpent3;
        int propertySpent4;
        int netProfit0;
        int netProfit1;
        int netProfit2;
        int netProfit3;
        int netProfit4;
        int totalSpent;
        int totalROI;

        propertySpent0 = Integer.parseInt(property0.propertyDetails.propertyPrice.replace(",", ""));
        if (property0.propertyDetails.propertyRepairs[0].checkButton == true) { propertySpent0 +=  0 } // TODO 


    }

    /**
     * Initializes the cells of the page that it is sent.
     *
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

        if (rd00!=null) rd00.setText(property.repairDescription0);
        if (rd01!=null) rd01.setText(property.repairDescription1);
        if (rd02!=null) rd02.setText(property.repairDescription2);
        if (rd03!=null) rd03.setText(property.repairDescription3);
        if (rd04!=null) rd04.setText(property.repairDescription4);
        if (rd05!=null) rd05.setText(property.repairDescription5);
        if (rd06!=null) rd06.setText(property.repairDescription6);
        if (rd07!=null) rd07.setText(property.repairDescription7);
        if (rd08!=null) rd08.setText(property.repairDescription8);
        if (rd09!=null) rd09.setText(property.repairDescription9);

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

        if (mp00!=null) mp00.setText(property.materialPrice0);
        if (mp01!=null) mp01.setText(property.materialPrice1);
        if (mp02!=null) mp02.setText(property.materialPrice2);
        if (mp03!=null) mp03.setText(property.materialPrice3);
        if (mp04!=null) mp04.setText(property.materialPrice4);
        if (mp05!=null) mp05.setText(property.materialPrice5);
        if (mp06!=null) mp06.setText(property.materialPrice6);
        if (mp07!=null) mp07.setText(property.materialPrice7);
        if (mp08!=null) mp08.setText(property.materialPrice8);
        if (mp09!=null) mp09.setText(property.materialPrice9);

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

        if (ed00!=null) ed00.setText(property.estimatedDuration0);
        if (ed01!=null) ed01.setText(property.estimatedDuration1);
        if (ed02!=null) ed02.setText(property.estimatedDuration2);
        if (ed03!=null) ed03.setText(property.estimatedDuration3);
        if (ed04!=null) ed04.setText(property.estimatedDuration4);
        if (ed05!=null) ed05.setText(property.estimatedDuration5);
        if (ed06!=null) ed06.setText(property.estimatedDuration6);
        if (ed07!=null) ed07.setText(property.estimatedDuration7);
        if (ed08!=null) ed08.setText(property.estimatedDuration8);
        if (ed09!=null) ed09.setText(property.estimatedDuration9);
    }
}
