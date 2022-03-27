package simproj.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import simproj.ApplicationManager;
import simproj.view.ViewFactory;

public class OptionsScreenController extends BaseController {

    @FXML
    private Button backToMenuButton;

    @FXML
    private CheckBox checkBoxField;

    @FXML
    private DatePicker dataPickerField;

    @FXML
    private Label labelField;

    @FXML
    private ScrollBar scrollBarField;

    public OptionsScreenController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlName) {
        super(applicationManager, viewFactory, fxmlName);
    }

    @FXML
    void backToMenuAction() {
        viewFactory.showMainScreen();
        Stage stage = (Stage) dataPickerField.getScene().getWindow();
        stage.close();

    }
}
