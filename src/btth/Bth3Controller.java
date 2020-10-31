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
import javafx.scene.Node;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class Bth3Controller implements Initializable {

    /**
     
     * Initializes the controller class.
     */
    @FXML private VBox vctrl;
    @FXML private StackPane sp;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void themHandler (ActionEvent evt){
       TextField text = new TextField();
       vctrl.getChildren().add(text);
    }
    public void veHandler (ActionEvent evt){
        PieChart chart = new PieChart();
        chart.setTitle( " Bieu Do  " );
        
        for( Node n: vctrl.getChildren()){
            TextField g = (TextField) n;
            chart.getData().add(new PieChart.Data(g.getText(),Integer.parseInt(g.getText())));
    }
        sp.getChildren().add(chart);
}}
