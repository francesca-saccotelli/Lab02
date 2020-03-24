package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;

public class FXMLController {

	private AlienDictionary alienDictionary=new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInserimento;

    @FXML
    private Button btnTraduzione;

    @FXML
    private TextArea txtRisultato;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    this.txtRisultato.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    String ts=txtInserimento.getText().toLowerCase();
    String array[]=ts.split(" ");
    if(array.length==2) {
    	if(this.alienDictionary.isCorrect(array[0])==true && this.alienDictionary.isCorrect(array[1])==true)
    	    alienDictionary.addWord(array[0], array[1]);
    	else
    		txtRisultato.setText("Devi inserire una parola!\n");
    }else if(array.length==1) {
    	if(this.alienDictionary.isCorrect(array[0])==true) {
    		List<String>traduzioni=new LinkedList<String>();
    		String traduzione="";
    		traduzioni=alienDictionary.translateWord(array[0]);
    		for(String s:traduzioni) {
    		    traduzione+=s+"\n";
    		}
    		txtRisultato.setText(traduzione);
    	//String translation=alienDictionary.translateWord(array[0]);	
    	//txtRisultato.setText(translation);
    	}else
    		txtRisultato.setText("Devi inserire una parola!\n");
    }
    }

    @FXML
    void initialize() {
        assert txtInserimento != null : "fx:id=\"txtInserimento\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTraduzione != null : "fx:id=\"btnTraduzione\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    public void setAlienDictionary(AlienDictionary alienDictionary) {
    	this.alienDictionary=alienDictionary;
    }
}
