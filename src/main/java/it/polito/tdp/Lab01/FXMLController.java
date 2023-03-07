package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;

    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private TextArea txtTime;


    @FXML
    void doInsert(ActionEvent event) {
    	long start = System.nanoTime();
    	elenco.addParola(this.txtParola.getText());
    	long stop = System.nanoTime();
    	txtResult.clear();
    	for(String s : elenco.getElenco()) {
    	this.txtResult.appendText(s+"\n");
    	}
    	this.txtTime.setText(""+(stop-start));
  
    }

    @FXML
    void doReset(ActionEvent event) {
    	long start = System.nanoTime();
    	elenco.reset();
    	long stop = System.nanoTime();
    	this.txtResult.clear();
    	this.txtTime.setText(""+(stop-start));
    }

    @FXML
    void toCancella(ActionEvent event) {
    	long start = System.nanoTime();
    	txtResult.clear();
    	long stop = System.nanoTime();
    	elenco.cancellaParola(this.txtParola.getText());
    	for(String s : elenco.getElenco()) {
        	this.txtResult.appendText(s+"\n");
        	}
    	this.txtTime.setText(""+(stop-start));
    }

    @FXML
    void initialize() {
    	assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'Scene.fxml'.";
        
        elenco = new Parole() ;
    }

}
