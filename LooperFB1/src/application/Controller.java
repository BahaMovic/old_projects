package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Controller implements Initializable{
    @FXML
    private AnchorPane main;

    @FXML
    private JFXHamburger button;

    @FXML
    private JFXDrawer drawer;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		HamburgerBackArrowBasicTransition hamburger = new HamburgerBackArrowBasicTransition(button);
		hamburger.setRate(-1);
		button.addEventHandler(MouseEvent.MOUSE_PRESSED, (e)->{
			hamburger.setRate(hamburger.getRate()*-1);
			hamburger.play();
			
				if(drawer.isShown()){
					drawer.close();
				}else{
					drawer.open();
				}
		
			
		});
	}

}
