package application;
import javafx.beans.property.*;
public class myNumber {
	private DoubleProperty number;
	public double getNumber(){
		if(number != null){
			return number.get();
		}else return 0;
	}public void setNumber(double number){
		getDouble().set(number);
	}
	public DoubleProperty getDouble(){
		if(number== null){
			number =new SimpleDoubleProperty();
		}
		return number;
	}


}
