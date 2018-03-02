package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modules.ReservationEngine.ReservationEngine;

public class LanderController implements Initializable{

	@FXML private Button btn_add;
	
	@FXML
	private void show(MouseEvent e) {
		System.out.println("Clicked");
		
		if (e.getEventType() != MouseEvent.MOUSE_CLICKED)
			return;
		
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Addition.fxml"));
			
			Scene scene = new Scene(loader.load());
			stage.setScene(scene);
			stage.show();
		} catch (IOException e1)  {
			
		}
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		//as a test method
		ReservationEngine engine = ReservationEngine.instance();
	}
	
}
