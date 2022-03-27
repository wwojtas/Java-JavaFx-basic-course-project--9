module simple.project {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.desktop;

    opens simproj;
    opens simproj.view;
    opens simproj.controller;
}