package application;

import java.io.File;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class Controller implements Initializable{
	@FXML ListView list;
	DoubleProperty x = new SimpleDoubleProperty(0);
	@FXML ProgressBar pb;
	@FXML ProgressIndicator pc;
	@FXML Slider slider;
	@FXML TextField text;
	double d = 50;
	public void Click(ActionEvent event){
		FileChooser fc = new FileChooser();
		fc.getExtensionFilters().addAll(new ExtensionFilter("JPG File","*.jpg"));
		File file = fc.showOpenDialog(null);
		list.getItems().add(file.getName());
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		pc.progressProperty().bind(x);
		pb.progressProperty().bind(x);
		
		slider.setValue(d);
		text.setText(new Double(d).toString());
		text.textProperty().bindBidirectional(slider.valueProperty(),NumberFormat.getNumberInstance());
	}
	
	public void goo(ActionEvent event){
		x.setValue(x.getValue()+0.1);
		
	}
	public void back(ActionEvent event){
		x.setValue(x.getValue()-0.1);
	}

}
