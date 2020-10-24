/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    @FXML private TextField Textchieucao;
    @FXML private TextField Textcannang;

    @Override   
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void tinhbmiHander (ActionEvent evt){
    double chieucao = Double.valueOf(this.Textchieucao.getText());
    double cannang = Double.valueOf(this.Textcannang.getText());
    double bmi = cannang / Math.pow(chieucao , 2); 
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setContentText(String.valueOf(bmi));
    alert.show();

    }
    
}
