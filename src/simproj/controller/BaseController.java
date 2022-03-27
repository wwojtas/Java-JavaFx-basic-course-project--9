package simproj.controller;

import simproj.ApplicationManager;
import simproj.view.ViewFactory;


public abstract class BaseController {

    protected ApplicationManager applicationManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(ApplicationManager applicationManager, ViewFactory viewFactory, String fxmlName) {
        this.applicationManager = applicationManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
