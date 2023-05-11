package com.example.banking;

import com.example.banking.models.Model;
import com.example.banking.view.View;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

//source class to run the project that will invoke view from model with login window
public class App extends Application {
    @Override
    public void start(Stage stage) {
          Model.getInstance().getView().showLoginView();

    }
}
