package sample;

import com.sun.javafx.css.CalculatedValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

/**
 *
 *
 */
public class Controller extends ButtonsAndLabels {

    /**
     *
     *
     * @param event
     * @throws IOException
     */
    public void contButtonClicked(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, ReportCalculations.property0);
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked0(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property1.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, ReportCalculations.property1);

        ReportCalculations.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property2.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, ReportCalculations.property2);

        ReportCalculations.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property3.fxml"));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, ReportCalculations.property3);

        ReportCalculations.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample/property4.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        // Initialize cells
        initializeCells(root, ReportCalculations.property4);

        ReportCalculations.propertyNum += 1;
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    public void nextButtonClicked4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("sample/report.fxml")));
        Scene property1Scene = new Scene(root);

        // Get the stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(property1Scene);
        window.show();

        setReportCells(root);
    }

    public void checkBoxClicked0(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb0 = (CheckBox) root.lookup("#cb0");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[0].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[0].repairCheckButton = true;
            }
            else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[0].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb0 = (CheckBox) root.lookup("#cb0");
            if (!ReportCalculations.property1.propertyDetails.propertyRepairs[0].repairCheckButton) {
                ReportCalculations.property1.propertyDetails.propertyRepairs[0].repairCheckButton = true;
            }
            else {
                ReportCalculations.property1.propertyDetails.propertyRepairs[0].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb0 = (CheckBox) root.lookup("#cb0");
            if (!ReportCalculations.property2.propertyDetails.propertyRepairs[0].repairCheckButton) {
                ReportCalculations.property2.propertyDetails.propertyRepairs[0].repairCheckButton = true;
            }
            else {
                ReportCalculations.property2.propertyDetails.propertyRepairs[0].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb0 = (CheckBox) root.lookup("#cb0");
            if (!ReportCalculations.property3.propertyDetails.propertyRepairs[0].repairCheckButton) {
                ReportCalculations.property3.propertyDetails.propertyRepairs[0].repairCheckButton = true;
            }
            else {
                ReportCalculations.property3.propertyDetails.propertyRepairs[0].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb0 = (CheckBox) root.lookup("#cb0");
            if (!ReportCalculations.property4.propertyDetails.propertyRepairs[0].repairCheckButton) {
                ReportCalculations.property4.propertyDetails.propertyRepairs[0].repairCheckButton = true;
            }
            else {
                ReportCalculations.property4.propertyDetails.propertyRepairs[0].repairCheckButton = false;
            }
        }
    }

    public void checkBoxClicked1(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property1.fxml"));
            cb1 = (CheckBox) root.lookup("#cb1");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[1].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[1].repairCheckButton = true;
            }
            else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[1].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property2.fxml"));
            cb1 = (CheckBox) root.lookup("#cb1");
            if (!ReportCalculations.property1.propertyDetails.propertyRepairs[1].repairCheckButton) {
                ReportCalculations.property1.propertyDetails.propertyRepairs[1].repairCheckButton = true;
            }
            else {
                ReportCalculations.property1.propertyDetails.propertyRepairs[1].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property3.fxml"));
            cb1 = (CheckBox) root.lookup("#cb1");
            if (!ReportCalculations.property2.propertyDetails.propertyRepairs[1].repairCheckButton) {
                ReportCalculations.property2.propertyDetails.propertyRepairs[1].repairCheckButton = true;
            }
            else {
                ReportCalculations.property2.propertyDetails.propertyRepairs[1].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property4.fxml"));
            cb1 = (CheckBox) root.lookup("#cb1");
            if (!ReportCalculations.property3.propertyDetails.propertyRepairs[1].repairCheckButton) {
                ReportCalculations.property3.propertyDetails.propertyRepairs[1].repairCheckButton = true;
            }
            else {
                ReportCalculations.property3.propertyDetails.propertyRepairs[1].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property5.fxml"));
            cb1 = (CheckBox) root.lookup("#cb1");
            if (!ReportCalculations.property4.propertyDetails.propertyRepairs[1].repairCheckButton) {
                ReportCalculations.property4.propertyDetails.propertyRepairs[1].repairCheckButton = true;
            }
            else {
                ReportCalculations.property4.propertyDetails.propertyRepairs[1].repairCheckButton = false;
            }
        }
    }

    public void checkBoxClicked2(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb2 = (CheckBox) root.lookup("#cb2");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb2 = (CheckBox) root.lookup("#cb2");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb2 = (CheckBox) root.lookup("#cb2");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb2 = (CheckBox) root.lookup("#cb2");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb2 = (CheckBox) root.lookup("#cb2");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[2].repairCheckButton = false;
            }
        }
    }

        public void checkBoxClicked3(ActionEvent event) throws IOException {
            if (ReportCalculations.propertyNum == 0) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb3 = (CheckBox) root.lookup("#cb3");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 1) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb3 = (CheckBox) root.lookup("#cb3");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 2) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb3 = (CheckBox) root.lookup("#cb3");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 3) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb3 = (CheckBox) root.lookup("#cb3");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 4) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb3 = (CheckBox) root.lookup("#cb3");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[3].repairCheckButton = false;
                }
            }
        }


    public void checkBoxClicked4(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb4 = (CheckBox) root.lookup("#cb4");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb4 = (CheckBox) root.lookup("#cb4");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb4 = (CheckBox) root.lookup("#cb4");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb4 = (CheckBox) root.lookup("#cb4");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb4 = (CheckBox) root.lookup("#cb4");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[4].repairCheckButton = false;
            }
        }
    }
        public void checkBoxClicked5(ActionEvent event) throws IOException {
            if (ReportCalculations.propertyNum == 0) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb5 = (CheckBox) root.lookup("#cb5");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 1) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb5 = (CheckBox) root.lookup("#cb5");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 2) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb5 = (CheckBox) root.lookup("#cb5");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 3) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb5 = (CheckBox) root.lookup("#cb5");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 4) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb5 = (CheckBox) root.lookup("#cb5");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[5].repairCheckButton = false;
                }
            }
        }
    public void checkBoxClicked6(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb6 = (CheckBox) root.lookup("#cb6");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb6 = (CheckBox) root.lookup("#cb6");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb6 = (CheckBox) root.lookup("#cb6");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb6 = (CheckBox) root.lookup("#cb6");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb6 = (CheckBox) root.lookup("#cb6");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[6].repairCheckButton = false;
            }
        }
    }
        public void checkBoxClicked7(ActionEvent event) throws IOException {
            if (ReportCalculations.propertyNum == 0) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb7 = (CheckBox) root.lookup("#cb7");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 1) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb7 = (CheckBox) root.lookup("#cb7");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 2) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb7 = (CheckBox) root.lookup("#cb7");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 3) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb7 = (CheckBox) root.lookup("#cb7");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = false;
                }
            }
            if (ReportCalculations.propertyNum == 4) {
                Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
                cb7 = (CheckBox) root.lookup("#cb7");
                if (!ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton) {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = true;
                } else {
                    ReportCalculations.property0.propertyDetails.propertyRepairs[7].repairCheckButton = false;
                }
            }
        }
    public void checkBoxClicked8(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb8 = (CheckBox) root.lookup("#cb8");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb8 = (CheckBox) root.lookup("#cb8");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb8 = (CheckBox) root.lookup("#cb8");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb8 = (CheckBox) root.lookup("#cb8");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb8 = (CheckBox) root.lookup("#cb8");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[8].repairCheckButton = false;
            }
        }
    }
    public void checkBoxClicked9(ActionEvent event) throws IOException {
        if (ReportCalculations.propertyNum == 0) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb9 = (CheckBox) root.lookup("#cb9");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 1) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb9 = (CheckBox) root.lookup("#cb9");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 2) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb9 = (CheckBox) root.lookup("#cb9");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 3) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb9 = (CheckBox) root.lookup("#cb9");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = false;
            }
        }
        if (ReportCalculations.propertyNum == 4) {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample/property0.fxml"));
            cb9 = (CheckBox) root.lookup("#cb9");
            if (!ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton) {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = true;
            } else {
                ReportCalculations.property0.propertyDetails.propertyRepairs[9].repairCheckButton = false;
            }
        }
    }


    /**
     * Closes the application.
     */
    public void endButtonClicked() {
        Stage stage = (Stage) end.getScene().getWindow();
        stage.close();
    }

    public void approveButtonClicked0(ActionEvent event) throws IOException {
        ReportCalculations.property0.propertyDetails.propertyApproved = true;
        circleStatus0.setStyle("-fx-fill: #58FF36");
        approve0.setDisable(true);
        next0.setDisable(false);
        discard0.setDisable(false);
    }

    public void approveButtonClicked1() {
        ReportCalculations.property1.propertyDetails.propertyApproved = true;
        circleStatus1.setStyle("-fx-fill: #58FF36");
        approve1.setDisable(true);
        next1.setDisable(false);
        discard1.setDisable(false);
    }

    public void approveButtonClicked2() {
        ReportCalculations.property2.propertyDetails.propertyApproved = true;
        circleStatus2.setStyle("-fx-fill: #58FF36");
        approve2.setDisable(true);
        next2.setDisable(false);
        discard2.setDisable(false);
    }

    public void approveButtonClicked3() {
        ReportCalculations.property3.propertyDetails.propertyApproved = true;
        circleStatus3.setStyle("-fx-fill: #58FF36");
        approve3.setDisable(true);
        next3.setDisable(false);
        discard3.setDisable(false);
    }

    public void approveButtonClicked4() {
        ReportCalculations.property4.propertyDetails.propertyApproved = true;
        circleStatus4.setStyle("-fx-fill: #58FF36");
        approve4.setDisable(true);
        next4.setDisable(false);
        discard4.setDisable(false);
    }

    public void discardButtonClicked0() {
        circleStatus0.setStyle("-fx-fill: #FF0000");
        discard0.setDisable(true);
        next0.setDisable(false);
        approve0.setDisable(false);
        ReportCalculations.property0.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked1() {
        circleStatus1.setStyle("-fx-fill: #FF0000");
        discard1.setDisable(true);
        next1.setDisable(false);
        approve1.setDisable(false);
        ReportCalculations.property1.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked2() {
        circleStatus2.setStyle("-fx-fill: #FF0000");
        discard2.setDisable(true);
        next2.setDisable(false);
        approve2.setDisable(false);
        ReportCalculations.property2.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked3() {
        circleStatus3.setStyle("-fx-fill: #FF0000");
        discard3.setDisable(true);
        next3.setDisable(false);
        approve3.setDisable(false);
        ReportCalculations.property3.propertyDetails.propertyApproved = false;
    }

    public void discardButtonClicked4() {
        circleStatus4.setStyle("-fx-fill: #FF0000");
        discard4.setDisable(true);
        next4.setDisable(false);
        approve4.setDisable(false);
        ReportCalculations.property4.propertyDetails.propertyApproved = false;
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
        if (ReportCalculations.property0.propertyDetails.propertyApproved != null && ReportCalculations.property0.propertyDetails.propertyApproved == true) {
            propertySpent0 = ReportCalculations.property0.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property0);
            propertyNetProfit0 = propertySpent0 += ReportCalculations.property0.propertyDetails.calculateValueAddedTotal(ReportCalculations.property0) - propertySpent0;
        }
        if (ReportCalculations.property1.propertyDetails.propertyApproved != null && ReportCalculations.property1.propertyDetails.propertyApproved == true) {
            propertySpent1 = ReportCalculations.property1.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property1);
            propertyNetProfit1 = propertySpent1 += ReportCalculations.property1.propertyDetails.calculateValueAddedTotal(ReportCalculations.property1) - propertySpent1;
        }
        if (ReportCalculations.property2.propertyDetails.propertyApproved != null && ReportCalculations.property2.propertyDetails.propertyApproved == true) {
            propertySpent2 = ReportCalculations.property2.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property2);
            propertyNetProfit2 = propertySpent2 += ReportCalculations.property2.propertyDetails.calculateValueAddedTotal(ReportCalculations.property2) - propertySpent2;
        }
        if (ReportCalculations.property3.propertyDetails.propertyApproved != null && ReportCalculations.property3.propertyDetails.propertyApproved == true) {
            propertySpent3 = ReportCalculations.property3.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property3);
            propertyNetProfit3 = propertySpent3 += ReportCalculations.property3.propertyDetails.calculateValueAddedTotal(ReportCalculations.property3) - propertySpent3;
        }
        if (ReportCalculations.property4.propertyDetails.propertyApproved != null && ReportCalculations.property4.propertyDetails.propertyApproved == true) {
            propertySpent4 = ReportCalculations.property4.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property4);
            propertyNetProfit4 = propertySpent4 += ReportCalculations.property4.propertyDetails.calculateValueAddedTotal(ReportCalculations.property4) - propertySpent4;
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
        if (purchasePrice0!=null) purchasePrice0.setText(ReportCalculations.property0.propertyDetails.propertyPrice);
        if (purchasePrice1!=null) purchasePrice1.setText(ReportCalculations.property1.propertyDetails.propertyPrice);
        if (purchasePrice2!=null) purchasePrice2.setText(ReportCalculations.property2.propertyDetails.propertyPrice);
        if (purchasePrice3!=null) purchasePrice3.setText(ReportCalculations.property3.propertyDetails.propertyPrice);
        if (purchasePrice4!=null) purchasePrice4.setText(ReportCalculations.property4.propertyDetails.propertyPrice);

        // Set Materials Price column
        materialsPrice0 = (Label) root.lookup("#materialsPrice0");
        materialsPrice1 = (Label) root.lookup("#materialsPrice1");
        materialsPrice2 = (Label) root.lookup("#materialsPrice2");
        materialsPrice3 = (Label) root.lookup("#materialsPrice3");
        materialsPrice4 = (Label) root.lookup("#materialsPrice4");
        if (materialsPrice0!=null) materialsPrice0.setText(String.valueOf(ReportCalculations.property0.propertyDetails.calculateMaterialsPriceTotal(ReportCalculations.property0)));
        if (materialsPrice1!=null) materialsPrice1.setText(String.valueOf(ReportCalculations.property1.propertyDetails.calculateMaterialsPriceTotal(ReportCalculations.property1)));
        if (materialsPrice2!=null) materialsPrice2.setText(String.valueOf(ReportCalculations.property2.propertyDetails.calculateMaterialsPriceTotal(ReportCalculations.property2)));
        if (materialsPrice3!=null) materialsPrice3.setText(String.valueOf(ReportCalculations.property3.propertyDetails.calculateMaterialsPriceTotal(ReportCalculations.property3)));
        if (materialsPrice4!=null) materialsPrice4.setText(String.valueOf(ReportCalculations.property4.propertyDetails.calculateMaterialsPriceTotal(ReportCalculations.property4)));

        // Set Labor Price column
        laborPrice0 = (Label) root.lookup("#laborPrice0");
        laborPrice1 = (Label) root.lookup("#laborPrice1");
        laborPrice2 = (Label) root.lookup("#laborPrice2");
        laborPrice3 = (Label) root.lookup("#laborPrice3");
        laborPrice4 = (Label) root.lookup("#laborPrice4");
        if (laborPrice0!=null) laborPrice0.setText(String.valueOf(ReportCalculations.property0.propertyDetails.calculateLaborPriceTotal(ReportCalculations.property0)));
        if (laborPrice1!=null) laborPrice1.setText(String.valueOf(ReportCalculations.property1.propertyDetails.calculateLaborPriceTotal(ReportCalculations.property1)));
        if (laborPrice2!=null) laborPrice2.setText(String.valueOf(ReportCalculations.property2.propertyDetails.calculateLaborPriceTotal(ReportCalculations.property2)));
        if (laborPrice3!=null) laborPrice3.setText(String.valueOf(ReportCalculations.property3.propertyDetails.calculateLaborPriceTotal(ReportCalculations.property3)));
        if (laborPrice4!=null) laborPrice4.setText(String.valueOf(ReportCalculations.property4.propertyDetails.calculateLaborPriceTotal(ReportCalculations.property4)));

        // Set spent column
        spent0 = (Label) root.lookup("#spent0");
        spent1 = (Label) root.lookup("#spent1");
        spent2 = (Label) root.lookup("#spent2");
        spent3 = (Label) root.lookup("#spent3");
        spent4 = (Label) root.lookup("#spent4");
        if (spent0!=null) spent0.setText(String.valueOf(ReportCalculations.property0.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property0)));
        if (spent1!=null) spent1.setText(String.valueOf(ReportCalculations.property1.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property1)));
        if (spent2!=null) spent2.setText(String.valueOf(ReportCalculations.property2.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property2)));
        if (spent3!=null) spent3.setText(String.valueOf(ReportCalculations.property3.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property3)));
        if (spent4!=null) spent4.setText(String.valueOf(ReportCalculations.property4.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property4)));

        // Set Est. Sale Price column
        estSalePrice0 = (Label) root.lookup("#estSalePrice0");
        estSalePrice1 = (Label) root.lookup("#estSalePrice1");
        estSalePrice2 = (Label) root.lookup("#estSalePrice2");
        estSalePrice3 = (Label) root.lookup("#estSalePrice3");
        estSalePrice4 = (Label) root.lookup("#estSalePrice4");
        if (estSalePrice0!=null) estSalePrice0.setText(String.valueOf(ReportCalculations.property0.propertyDetails.calculateValueAddedTotal(ReportCalculations.property0)));
        if (estSalePrice1!=null) estSalePrice1.setText(String.valueOf(ReportCalculations.property1.propertyDetails.calculateValueAddedTotal(ReportCalculations.property1)));
        if (estSalePrice2!=null) estSalePrice2.setText(String.valueOf(ReportCalculations.property2.propertyDetails.calculateValueAddedTotal(ReportCalculations.property2)));
        if (estSalePrice3!=null) estSalePrice3.setText(String.valueOf(ReportCalculations.property3.propertyDetails.calculateValueAddedTotal(ReportCalculations.property3)));
        if (estSalePrice4!=null) estSalePrice4.setText(String.valueOf(ReportCalculations.property4.propertyDetails.calculateValueAddedTotal(ReportCalculations.property4)));

        // Set Net Profit column
        netProfit0 = (Label) root.lookup("#netProfit0");
        netProfit1 = (Label) root.lookup("#netProfit1");
        netProfit2 = (Label) root.lookup("#netProfit2");
        netProfit3 = (Label) root.lookup("#netProfit3");
        netProfit4 = (Label) root.lookup("#netProfit4");
        if (netProfit0!=null) netProfit0.setText(String.valueOf(ReportCalculations.property0.propertyDetails.calculateValueAddedTotal(ReportCalculations.property0) - ReportCalculations.property0.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property0)));
        if (netProfit1!=null) netProfit1.setText(String.valueOf(ReportCalculations.property1.propertyDetails.calculateValueAddedTotal(ReportCalculations.property1) - ReportCalculations.property1.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property1)));
        if (netProfit2!=null) netProfit2.setText(String.valueOf(ReportCalculations.property2.propertyDetails.calculateValueAddedTotal(ReportCalculations.property2) - ReportCalculations.property2.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property2)));
        if (netProfit3!=null) netProfit3.setText(String.valueOf(ReportCalculations.property3.propertyDetails.calculateValueAddedTotal(ReportCalculations.property3) - ReportCalculations.property3.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property3)));
        if (netProfit4!=null) netProfit4.setText(String.valueOf(ReportCalculations.property4.propertyDetails.calculateValueAddedTotal(ReportCalculations.property4) - ReportCalculations.property4.propertyDetails.calculateAmountSpentTotal(ReportCalculations.property4)));

        // Set bottom of page summary values
        totalSpent = (Label) root.lookup("#totalSpent");
        String wow = Integer.toString(totalSpentValue);
        totalSpent.setText(wow);

        totalProfit = (Label) root.lookup("#totalProfit");
        String wow1 = Integer.toString(totalNetProfitValue);
        totalProfit.setText(wow1);
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

        if (mp00!=null) mp00.setText(property.propertyDetails.propertyRepairs[0].repairMaterialPrice);
        if (mp01!=null) mp01.setText(property.propertyDetails.propertyRepairs[1].repairMaterialPrice);
        if (mp02!=null) mp02.setText(property.propertyDetails.propertyRepairs[2].repairMaterialPrice);
        if (mp03!=null) mp03.setText(property.propertyDetails.propertyRepairs[3].repairMaterialPrice);
        if (mp04!=null) mp04.setText(property.propertyDetails.propertyRepairs[4].repairMaterialPrice);
        if (mp05!=null) mp05.setText(property.propertyDetails.propertyRepairs[5].repairMaterialPrice);
        if (mp06!=null) mp06.setText(property.propertyDetails.propertyRepairs[6].repairMaterialPrice);
        if (mp07!=null) mp07.setText(property.propertyDetails.propertyRepairs[7].repairMaterialPrice);
        if (mp08!=null) mp08.setText(property.propertyDetails.propertyRepairs[8].repairMaterialPrice);
        if (mp09!=null) mp09.setText(property.propertyDetails.propertyRepairs[9].repairMaterialPrice);

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
