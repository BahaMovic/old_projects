package application;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
@FXML PieChart pie;
@FXML Label lab;
public void Action(ActionEvent event){
	ObservableList<Data> date = FXCollections.observableArrayList(
			new PieChart.Data("Bahaa",20),
			new PieChart.Data("Alaa",40),
			new PieChart.Data("Jekso",30),
			new PieChart.Data("Diaa", 12)
			);
	pie.setData(date);
	for(PieChart.Data data : pie.getData()){
		data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent arg0) {
				
				lab.setText(String.valueOf(data.getPieValue()));
			}
			
		});
	}
}
}
