/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.lab04;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;
	private CorsoDAO corsodao = new CorsoDAO();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="comboBox"
    private ComboBox<String> comboBox; // Value injected by FXMLLoader

    @FXML // fx:id="boxMatricola"
    private TextField boxMatricola; // Value injected by FXMLLoader

    @FXML // fx:id="boxNome"
    private TextField boxNome; // Value injected by FXMLLoader

    @FXML // fx:id="boxCognome"
    private TextField boxCognome; // Value injected by FXMLLoader

    @FXML // fx:id="boxArea"
    private TextArea boxArea; // Value injected by FXMLLoader

    @FXML
    void DoChoice(ActionEvent event) {

    }

    @FXML
    void DoClear(ActionEvent event) {

    }

    @FXML
    void DoIscrizione(ActionEvent event) {

    }

    @FXML
    void FindCorsi(ActionEvent event) {

    }

    @FXML
    void FindIscritti(ActionEvent event) {

    }

    @FXML
    void FindMatricola(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxMatricola != null : "fx:id=\"boxMatricola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxNome != null : "fx:id=\"boxNome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxCognome != null : "fx:id=\"boxCognome\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxArea != null : "fx:id=\"boxArea\" was not injected: check your FXML file 'Scene.fxml'.";
        
        String[] corsiDisponibili = new String[model.getTuttiICorsi().size()+1];
        corsiDisponibili[0] = "Nessun corso in particolare";
        int i=1;
        for(Corso si : model.getTuttiICorsi()) {
        	corsiDisponibili[i++] = si.toString();
        }
        ObservableList <String> corsi = FXCollections.observableArrayList(corsiDisponibili);
        comboBox.setItems(corsi);
    }

	public void setModel(Model model) {
		this.model = model;
	}
}
