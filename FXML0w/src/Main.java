

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage primaryStage){
		try {
			Parent root= FXMLLoader.load(getClass().getResource("view\\main.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("Hello BahaMovic");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
	
		launch(args);
	}


}
