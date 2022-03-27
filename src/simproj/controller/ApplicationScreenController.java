package simproj.controller;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import simproj.ApplicationManager;
import simproj.view.ViewFactory;

public class ApplicationScreenController extends BaseController{

    @FXML
    private Button backToMenuButton;

    @FXML
    private LineChart<?, ?> chartField;

    @FXML
    private Label labelField;

    public ApplicationScreenController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlName) {
        super(applicationManager, viewFactory, fxmlName);
    }

    @FXML
    void backToMenuAction() {
        viewFactory.showMainScreen();
        Stage stage = (Stage) chartField.getScene().getWindow();
        stage.close();
    }
}
