package simproj;

import javafx.application.Application;
import javafx.stage.Stage;
import simproj.view.ViewFactory;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ViewFactory viewFactory = new ViewFactory(new ApplicationManager());
        viewFactory.showMainScreen();
    }
}
