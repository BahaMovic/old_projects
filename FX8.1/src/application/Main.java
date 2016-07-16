package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Line line1 = new Line();
			line1.setStartX(150);
			line1.setStartY(50);
			line1.setEndX(300);
			line1.setEndY(50);
			Line line2 = new Line();
			line2.setStartX(150);
			line2.setStartY(50);
			line2.setEndX(20);
			line2.setEndY(200);
			
			Line line3 = new Line();
			line3.setStartX(300);
			line3.setStartY(50);
			line3.setEndX(430);
			line3.setEndY(200);
			
			QuadCurve quad = new QuadCurve();
			quad.setStartX(20);
			quad.setStartY(200);
			quad.setControlX(225);
			quad.setControlY(100);
			quad.setEndX(430);
			quad.setEndY(200);
			quad.setFill(Color.BROWN);
			quad.setStroke(Color.BROWN);
			
			Ellipse face = new Ellipse();
			face.setFill(Color.YELLOW);
			face.setStroke(Color.BLUE);
			face.setCenterX(225);
			face.setCenterY(300);
			face.setRadiusX(100);
			face.setRadiusY(100);
			
			Ellipse eye1 = new Ellipse();
			eye1.setCenterY(270);
			eye1.setCenterX(170);
			eye1.setRadiusX(15);
			eye1.setRadiusY(7);
			eye1.setStroke(Color.BLACK);
			eye1.setFill(Color.WHITE);
			
			Ellipse eye2 = new Ellipse();
			eye2.setCenterY(270);
			eye2.setCenterX(275);
			eye2.setRadiusX(15);
			eye2.setRadiusY(7);
			eye2.setStroke(Color.BLACK);
			eye2.setFill(Color.WHITE);
			
			QuadCurve mouth = new QuadCurve();
			mouth.setStartX(190);
			mouth.setStartY(370);
			mouth.setEndX(270);
			mouth.setEndY(370);
			mouth.setControlX(235);
			mouth.setControlY(390);
			mouth.setFill(Color.WHITE);
			mouth.setStroke(Color.BLUE);
			
			Ellipse body = new Ellipse(220,600,200,200);
			LinearGradient color = new LinearGradient(
					220,600,200,200,
					false,
					CycleMethod.NO_CYCLE,
					new Stop(0,Color.rgb(200, 100, 100,.8)),
					new Stop(1,Color.rgb(111, 222, 33,.8))
					);
			body.setFill(color);
			
		
			
			root.getChildren().addAll(line1,line2,line3,quad,face , eye1 ,eye2 ,mouth,body );
			
			Scene scene = new Scene(root,500,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
