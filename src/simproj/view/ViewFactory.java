package simproj.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simproj.ApplicationManager;
import simproj.controller.ApplicationScreenController;
import simproj.controller.BaseController;
import simproj.controller.MainScreenController;
import simproj.controller.OptionsScreenController;

import java.io.IOException;

public class ViewFactory {

    private ApplicationManager applicationManager;

    public ViewFactory(ApplicationManager applicationManager) {
        this.applicationManager = applicationManager;
    }

    public void showMainScreen() {
        BaseController controller = new MainScreenController(applicationManager, this, "MainScreen.fxml");
        initializeStage(controller);

    }

    public void showApplicationScreen() {
        BaseController controller = new ApplicationScreenController(applicationManager, this, "ApplicationScreen.fxml");
        initializeStage(controller);
    }

    public void showOptionsScreen(){
        BaseController controller = new OptionsScreenController(applicationManager, this, "OptionsScreen.fxml");
        initializeStage(controller);
    }

    private void initializeStage(BaseController baseController) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource(baseController.getFxmlName()));
        loader.setController(baseController);

        Parent parent;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stageToClose){
        stageToClose.close();
    }

}
