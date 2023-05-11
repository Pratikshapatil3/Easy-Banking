package com.example.banking.controllers.admin;

import com.example.banking.models.Client;
import com.example.banking.models.Model;
import com.example.banking.view.ClientCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientListController implements Initializable {
    public ListView<Client> client_list;
    private Client client;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initClientList();
        client_list.setItems(Model.getInstance().getClients());
        client_list.setCellFactory(e -> new ClientCellFactory());


    }






    private void initClientList() {
        //checking if the model is empty or not. If yes we set the clients via setClients() method inside Model
        //directory
        if (Model.getInstance().getClients().isEmpty()) {
            Model.getInstance().setClients();
        }
    }



}
