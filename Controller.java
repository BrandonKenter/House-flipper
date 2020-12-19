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
        if (property0.propertyDetails.propertyApproved == null) {
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
        if (property1.propertyDetails.propertyApproved == null) {
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
        if (property2.propertyDetails.propertyApproved == null) {
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
        if (property3.propertyDetails.propertyApproved == null) {
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
        if (property4.propertyDetails.propertyApproved == null) {
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
        property0.propertyDetails.propertyApproved = true;
    }

    public void approveButtonClicked1() {
        property1.propertyDetails.propertyApproved = true;
    }

    public void approveButtonClicked2() {
        property2.propertyDetails.propertyApproved = true;
    }

    public void approveButtonClicked3() {
        property3.propertyDetails.propertyApproved = true;
    }

    public void approveButtonClicked4() {
        property4.propertyDetails.propertyApproved = true;
    }

    public void discardButtonClicked0() {
        property0.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked1() {
        property1.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked2() {
        property2.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked3() {
        property3.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked4() {
        property4.propertyDetails.propertyApproved = false;
    }


    /**
     * Sets the checkButton property for each button.
     *
     * @param root
     * @param propertyNum
     */
    private void saveCheckButtonStatus(Parent root, int propertyNum) {
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

            if (cb0.isSelected()) { property0.propertyDetails.propertyRepairs[0].repairCheckButton = true; }
            if (cb1.isSelected()) { property0.propertyDetails.propertyRepairs[1].repairCheckButton = true; }
            if (cb2.isSelected()) { property0.propertyDetails.propertyRepairs[2].repairCheckButton = true; }
            if (cb3.isSelected()) { property0.propertyDetails.propertyRepairs[3].repairCheckButton = true; }
            if (cb4.isSelected()) { property0.propertyDetails.propertyRepairs[4].repairCheckButton = true; }
            if (cb5.isSelected()) { property0.propertyDetails.propertyRepairs[5].repairCheckButton = true; }
            if (cb6.isSelected()) { property0.propertyDetails.propertyRepairs[6].repairCheckButton = true; }
            if (cb7.isSelected()) { property0.propertyDetails.propertyRepairs[7].repairCheckButton = true; }
            if (cb8.isSelected()) { property0.propertyDetails.propertyRepairs[8].repairCheckButton = true; }
            if (cb9.isSelected()) { property0.propertyDetails.propertyRepairs[9].repairCheckButton = true; }
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

            if (cb0.isSelected()) { property1.propertyDetails.propertyRepairs[0].repairCheckButton = true; }
            if (cb1.isSelected()) { property1.propertyDetails.propertyRepairs[1].repairCheckButton = true; }
            if (cb2.isSelected()) { property1.propertyDetails.propertyRepairs[2].repairCheckButton = true; }
            if (cb3.isSelected()) { property1.propertyDetails.propertyRepairs[3].repairCheckButton = true; }
            if (cb4.isSelected()) { property1.propertyDetails.propertyRepairs[4].repairCheckButton = true; }
            if (cb5.isSelected()) { property1.propertyDetails.propertyRepairs[5].repairCheckButton = true; }
            if (cb6.isSelected()) { property1.propertyDetails.propertyRepairs[6].repairCheckButton = true; }
            if (cb7.isSelected()) { property1.propertyDetails.propertyRepairs[7].repairCheckButton = true; }
            if (cb8.isSelected()) { property1.propertyDetails.propertyRepairs[8].repairCheckButton = true; }
            if (cb9.isSelected()) { property1.propertyDetails.propertyRepairs[9].repairCheckButton = true; }
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

            if (cb0.isSelected()) { property2.propertyDetails.propertyRepairs[0].repairCheckButton = true; }
            if (cb1.isSelected()) { property2.propertyDetails.propertyRepairs[1].repairCheckButton = true; }
            if (cb2.isSelected()) { property2.propertyDetails.propertyRepairs[2].repairCheckButton = true; }
            if (cb3.isSelected()) { property2.propertyDetails.propertyRepairs[3].repairCheckButton = true; }
            if (cb4.isSelected()) { property2.propertyDetails.propertyRepairs[4].repairCheckButton = true; }
            if (cb5.isSelected()) { property2.propertyDetails.propertyRepairs[5].repairCheckButton = true; }
            if (cb6.isSelected()) { property2.propertyDetails.propertyRepairs[6].repairCheckButton = true; }
            if (cb7.isSelected()) { property2.propertyDetails.propertyRepairs[7].repairCheckButton = true; }
            if (cb8.isSelected()) { property2.propertyDetails.propertyRepairs[8].repairCheckButton = true; }
            if (cb9.isSelected()) { property2.propertyDetails.propertyRepairs[9].repairCheckButton = true; }
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

            if (cb0.isSelected()) { property3.propertyDetails.propertyRepairs[0].repairCheckButton = true; }
            if (cb1.isSelected()) { property3.propertyDetails.propertyRepairs[1].repairCheckButton = true; }
            if (cb2.isSelected()) { property3.propertyDetails.propertyRepairs[2].repairCheckButton = true; }
            if (cb3.isSelected()) { property3.propertyDetails.propertyRepairs[3].repairCheckButton = true; }
            if (cb4.isSelected()) { property3.propertyDetails.propertyRepairs[4].repairCheckButton = true; }
            if (cb5.isSelected()) { property3.propertyDetails.propertyRepairs[5].repairCheckButton = true; }
            if (cb6.isSelected()) { property3.propertyDetails.propertyRepairs[6].repairCheckButton = true; }
            if (cb7.isSelected()) { property3.propertyDetails.propertyRepairs[7].repairCheckButton = true; }
            if (cb8.isSelected()) { property3.propertyDetails.propertyRepairs[8].repairCheckButton = true; }
            if (cb9.isSelected()) { property3.propertyDetails.propertyRepairs[9].repairCheckButton = true; }
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

            if (cb0.isSelected()) { property4.propertyDetails.propertyRepairs[0].repairCheckButton = true; }
            if (cb1.isSelected()) { property4.propertyDetails.propertyRepairs[1].repairCheckButton = true; }
            if (cb2.isSelected()) { property4.propertyDetails.propertyRepairs[2].repairCheckButton = true; }
            if (cb3.isSelected()) { property4.propertyDetails.propertyRepairs[3].repairCheckButton = true; }
            if (cb4.isSelected()) { property4.propertyDetails.propertyRepairs[4].repairCheckButton = true; }
            if (cb5.isSelected()) { property4.propertyDetails.propertyRepairs[5].repairCheckButton = true; }
            if (cb6.isSelected()) { property4.propertyDetails.propertyRepairs[6].repairCheckButton = true; }
            if (cb7.isSelected()) { property4.propertyDetails.propertyRepairs[7].repairCheckButton = true; }
            if (cb8.isSelected()) { property4.propertyDetails.propertyRepairs[8].repairCheckButton = true; }
            if (cb9.isSelected()) { property4.propertyDetails.propertyRepairs[9].repairCheckButton = true; }
        }
    }

    /**
     *
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
        int totalSpentValue = 0;
        int totalNetProfitValue = 0;

        // Get total amount spent on each property.
        if (property0.propertyDetails.propertyApproved) {
            propertySpent0 = property0.propertyDetails.calculateAmountSpentTotal(property0);
            propertyNetProfit0 = propertySpent0 += property0.propertyDetails.calculateValueAddedTotal(property0) - propertySpent0;
        }
        if (property1.propertyDetails.propertyApproved) {
            propertySpent1 = property1.propertyDetails.calculateAmountSpentTotal(property1);
            propertyNetProfit1 = propertySpent1 += property1.propertyDetails.calculateValueAddedTotal(property1) - propertySpent1;
        }
        if (property2.propertyDetails.propertyApproved) {
            propertySpent2 = property2.propertyDetails.calculateAmountSpentTotal(property2);
            propertyNetProfit2 = propertySpent2 += property2.propertyDetails.calculateValueAddedTotal(property2) - propertySpent2;
        }
        if (property3.propertyDetails.propertyApproved) {
            propertySpent3 = property3.propertyDetails.calculateAmountSpentTotal(property3);
            propertyNetProfit3 = propertySpent3 += property3.propertyDetails.calculateValueAddedTotal(property3) - propertySpent3;
        }
        if (property4.propertyDetails.propertyApproved) {
            propertySpent4 = property4.propertyDetails.calculateAmountSpentTotal(property4);
            propertyNetProfit4 = propertySpent4 += property4.propertyDetails.calculateValueAddedTotal(property4) - propertySpent4;
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
        if (purchasePrice0!=null) purchasePrice0.setText(property0.propertyDetails.propertyPrice);
        if (purchasePrice1!=null) purchasePrice1.setText(property1.propertyDetails.propertyPrice);
        if (purchasePrice2!=null) purchasePrice2.setText(property2.propertyDetails.propertyPrice);
        if (purchasePrice3!=null) purchasePrice3.setText(property3.propertyDetails.propertyPrice);
        if (purchasePrice4!=null) purchasePrice4.setText(property4.propertyDetails.propertyPrice);

        // Set Materials Price column
        materialsPrice0 = (Label) root.lookup("#materialsPrice0");
        materialsPrice1 = (Label) root.lookup("#materialsPrice1");
        materialsPrice2 = (Label) root.lookup("#materialsPrice2");
        materialsPrice3 = (Label) root.lookup("#materialsPrice3");
        materialsPrice4 = (Label) root.lookup("#materialsPrice4");
        if (materialsPrice0!=null) materialsPrice0.setText(String.valueOf(property0.propertyDetails.calculateMaterialsPriceTotal(property0)));
        if (materialsPrice1!=null) materialsPrice1.setText(String.valueOf(property1.propertyDetails.calculateMaterialsPriceTotal(property1)));
        if (materialsPrice2!=null) materialsPrice2.setText(String.valueOf(property2.propertyDetails.calculateMaterialsPriceTotal(property2)));
        if (materialsPrice3!=null) materialsPrice3.setText(String.valueOf(property3.propertyDetails.calculateMaterialsPriceTotal(property3)));
        if (materialsPrice4!=null) materialsPrice4.setText(String.valueOf(property4.propertyDetails.calculateMaterialsPriceTotal(property4)));

        // Set Labor Price column
        laborPrice0 = (Label) root.lookup("#laborPrice0");
        laborPrice1 = (Label) root.lookup("#laborPrice1");
        laborPrice2 = (Label) root.lookup("#laborPrice2");
        laborPrice3 = (Label) root.lookup("#laborPrice3");
        laborPrice4 = (Label) root.lookup("#laborPrice4");
        if (laborPrice0!=null) laborPrice0.setText(String.valueOf(property0.propertyDetails.calculateLaborPriceTotal(property0)));
        if (laborPrice1!=null) laborPrice1.setText(String.valueOf(property1.propertyDetails.calculateLaborPriceTotal(property1)));
        if (laborPrice2!=null) laborPrice2.setText(String.valueOf(property2.propertyDetails.calculateLaborPriceTotal(property2)));
        if (laborPrice3!=null) laborPrice3.setText(String.valueOf(property3.propertyDetails.calculateLaborPriceTotal(property3)));
        if (laborPrice4!=null) laborPrice4.setText(String.valueOf(property4.propertyDetails.calculateLaborPriceTotal(property4)));

        // Set spent column
        spent0 = (Label) root.lookup("#spent0");
        spent1 = (Label) root.lookup("#spent1");
        spent2 = (Label) root.lookup("#spent2");
        spent3 = (Label) root.lookup("#spent3");
        spent4 = (Label) root.lookup("#spent4");
        if (spent0!=null) spent0.setText(String.valueOf(property0.propertyDetails.calculateAmountSpentTotal(property0)));
        if (spent1!=null) spent1.setText(String.valueOf(property1.propertyDetails.calculateAmountSpentTotal(property1)));
        if (spent2!=null) spent2.setText(String.valueOf(property2.propertyDetails.calculateAmountSpentTotal(property2)));
        if (spent3!=null) spent3.setText(String.valueOf(property3.propertyDetails.calculateAmountSpentTotal(property3)));
        if (spent4!=null) spent4.setText(String.valueOf(property4.propertyDetails.calculateAmountSpentTotal(property4)));

        // Set Est. Sale Price column
        estSalePrice0 = (Label) root.lookup("#estSalePrice0");
        estSalePrice1 = (Label) root.lookup("#estSalePrice1");
        estSalePrice2 = (Label) root.lookup("#estSalePrice2");
        estSalePrice3 = (Label) root.lookup("#estSalePrice3");
        estSalePrice4 = (Label) root.lookup("#estSalePrice4");
        if (estSalePrice0!=null) estSalePrice0.setText(String.valueOf(property0.propertyDetails.calculateValueAddedTotal(property0)));
        if (estSalePrice1!=null) estSalePrice1.setText(String.valueOf(property1.propertyDetails.calculateValueAddedTotal(property1)));
        if (estSalePrice2!=null) estSalePrice2.setText(String.valueOf(property2.propertyDetails.calculateValueAddedTotal(property2)));
        if (estSalePrice3!=null) estSalePrice3.setText(String.valueOf(property3.propertyDetails.calculateValueAddedTotal(property3)));
        if (estSalePrice4!=null) estSalePrice4.setText(String.valueOf(property4.propertyDetails.calculateValueAddedTotal(property4)));

        // Set Net Profit column
        netProfit0 = (Label) root.lookup("#netProfit0");
        netProfit1 = (Label) root.lookup("#netProfit1");
        netProfit2 = (Label) root.lookup("#netProfit2");
        netProfit3 = (Label) root.lookup("#netProfit3");
        netProfit4 = (Label) root.lookup("#netProfit4");
        if (netProfit0!=null) netProfit0.setText(String.valueOf(property0.propertyDetails.calculateValueAddedTotal(property0) - property0.propertyDetails.calculateAmountSpentTotal(property0)));
        if (netProfit1!=null) netProfit1.setText(String.valueOf(property1.propertyDetails.calculateValueAddedTotal(property1) - property1.propertyDetails.calculateAmountSpentTotal(property1)));
        if (netProfit2!=null) netProfit2.setText(String.valueOf(property2.propertyDetails.calculateValueAddedTotal(property2) - property2.propertyDetails.calculateAmountSpentTotal(property2)));
        if (netProfit3!=null) netProfit3.setText(String.valueOf(property3.propertyDetails.calculateValueAddedTotal(property3) - property3.propertyDetails.calculateAmountSpentTotal(property3)));
        if (netProfit4!=null) netProfit4.setText(String.valueOf(property4.propertyDetails.calculateValueAddedTotal(property4) - property4.propertyDetails.calculateAmountSpentTotal(property4)));

        // Set bottom of page summary values
        totalSpent = (Label) root.lookup("#totalSpent");
        totalSpent.setText(String.valueOf(totalSpentValue));
        totalProfit = (Label) root.lookup("#totalProfit");
        totalProfit.setText(String.valueOf(totalNetProfitValue));
    }

    /**
     * Initializes the cells of the page that it is sent.
     *
     * @param root
     */
    private void initializeCells(Parent root, Property property) {
        propertyLocation = (Label) root.lookup("#propertyLocation");
        propertySqFt = (Label) root.lookup("#propertySqFt");
        propertyPrice = (Label) root.lookup("#propertyPrice");
        propertyParagraph = (Label) root.lookup("#propertyParagraph");

        if (propertyLocation!=null) propertyLocation.setText(property.propertyDetails.propertyLocation);
        if (propertySqFt!=null) propertySqFt.setText(property.propertyDetails.propertySqFt);
        if (propertyPrice!=null) propertyPrice.setText(property.propertyDetails.propertyPrice);
        if (propertyParagraph!=null) propertyParagraph.setText(property.propertyDetails.propertyDescription);

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

        if (mp00!=null) rd00.setText(property.propertyDetails.propertyRepairs[0].repairMaterialPrice);
        if (mp01!=null) rd01.setText(property.propertyDetails.propertyRepairs[1].repairMaterialPrice);
        if (mp02!=null) rd02.setText(property.propertyDetails.propertyRepairs[2].repairMaterialPrice);
        if (mp03!=null) rd03.setText(property.propertyDetails.propertyRepairs[3].repairMaterialPrice);
        if (mp04!=null) rd04.setText(property.propertyDetails.propertyRepairs[4].repairMaterialPrice);
        if (mp05!=null) rd05.setText(property.propertyDetails.propertyRepairs[5].repairMaterialPrice);
        if (mp06!=null) rd06.setText(property.propertyDetails.propertyRepairs[6].repairMaterialPrice);
        if (mp07!=null) rd07.setText(property.propertyDetails.propertyRepairs[7].repairMaterialPrice);
        if (mp08!=null) rd08.setText(property.propertyDetails.propertyRepairs[8].repairMaterialPrice);
        if (mp09!=null) rd09.setText(property.propertyDetails.propertyRepairs[9].repairMaterialPrice);

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

        if (ed00!=null) ed00.setText(property.propertyDetails.propertyRepairs[0].repairEstimatedDuration);
        if (ed01!=null) ed01.setText(property.propertyDetails.propertyRepairs[1].repairEstimatedDuration);
        if (ed02!=null) ed02.setText(property.propertyDetails.propertyRepairs[2].repairEstimatedDuration);
        if (ed03!=null) ed03.setText(property.propertyDetails.propertyRepairs[3].repairEstimatedDuration);
        if (ed04!=null) ed04.setText(property.propertyDetails.propertyRepairs[4].repairEstimatedDuration);
        if (ed05!=null) ed05.setText(property.propertyDetails.propertyRepairs[5].repairEstimatedDuration);
        if (ed06!=null) ed06.setText(property.propertyDetails.propertyRepairs[6].repairEstimatedDuration);
        if (ed07!=null) ed07.setText(property.propertyDetails.propertyRepairs[7].repairEstimatedDuration);
        if (ed08!=null) ed08.setText(property.propertyDetails.propertyRepairs[8].repairEstimatedDuration);
        if (ed09!=null) ed09.setText(property.propertyDetails.propertyRepairs[9].repairEstimatedDuration);
    }
}
