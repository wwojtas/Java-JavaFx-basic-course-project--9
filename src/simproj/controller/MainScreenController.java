package simproj.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import simproj.ApplicationManager;
import simproj.view.ViewFactory;


public class MainScreenController extends BaseController {

    @FXML
    private GridPane gridPane;

    @FXML
    private Button appButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button optionButton;

    public MainScreenController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlName) {
        super(applicationManager, viewFactory, fxmlName);
    }

    @FXML
    void openApplicationAction()  {
        viewFactory.showApplicationScreen();
        Stage stage = (Stage) appButton.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    @FXML
    void openOptionsAction() {
        viewFactory.showOptionsScreen();
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void exitAction() {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

}
