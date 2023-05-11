module com.example.banking {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.commons;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.banking to javafx.fxml;
    exports com.example.banking;
    exports com.example.banking.controllers;
    exports com.example.banking.controllers.admin;
    exports com.example.banking.controllers.client;
    exports com.example.banking.view;
    exports com.example.banking.models;

}