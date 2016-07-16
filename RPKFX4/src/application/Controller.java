package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable{
	@FXML CheckBox cb1;
	@FXML CheckBox cb2;
	@FXML CheckBox cb3;
	@FXML CheckBox cb4;
	@FXML Label cblabel;
	@FXML Label rblabel;
	@FXML RadioButton rb1;
	@FXML RadioButton rb2;
	
	
	@FXML private TableView<User> table;
	@FXML private TableColumn<User,Integer> id;
	@FXML private TableColumn<User,String> name;
	@FXML private TableColumn<User,String> department;
	@FXML private TableColumn<User,String> surname;
	@FXML private TableColumn<User,Integer> age;
	public ObservableList<User> user = FXCollections.observableArrayList(
			new User(1,"Bahaa","Programming","BahaMovic",22),
			new User(1,"Alaa","Football","Iniesta",18)
			);
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		id.setCellValueFactory(new PropertyValueFactory<User,Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<User,String>("name"));
		department.setCellValueFactory(new PropertyValueFactory<User,String>("department"));
		surname.setCellValueFactory(new PropertyValueFactory<User,String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<User,Integer>("age"));
		
		table.setItems(user);
		
	}
	public void exit(ActionEvent event){
		
	}
	public void btn(ActionEvent evet)
	{
		String star ="";
		if(cb1.isSelected()){
			star += cb1.getText()+"\n";
		}
		if(cb2.isSelected()){
			star += cb2.getText()+"\n";
		}
		if(cb3.isSelected()){
			star += cb3.getText()+"\n";
		}
		if(cb4.isSelected()){
			star += cb4.getText()+"\n";
		}
		cblabel.setText(star);
		
		if(rb1.isSelected()){
			rblabel.setText(rb1.getText());
		}else if(rb2.isSelected()){
			rblabel.setText(rb2.getText());
		}
	}

}
