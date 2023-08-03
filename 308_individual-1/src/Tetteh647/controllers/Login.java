package Tetteh647.controllers;
/**
ID : 10886647
**/
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login{

    public void loginClicked(ActionEvent actionEvent) throws Exception {
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("../Tetteh647.fxml/vendors.Tetteh647.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
