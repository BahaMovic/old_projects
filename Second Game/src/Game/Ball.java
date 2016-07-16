package Game;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Ball {
	float x  ;
	private float y;
	private BufferedImage image;
	 float speed_x , speed_y;
	AudioClip sound ;
	URL url ;
	public Ball(BufferedImage image,int x,int y , float speed_x , float speed_y){
		 url = Ball.class.getResource("wilhelm_scream.au");
		sound = Applet.newAudioClip(url);
		this.image = image;
		this.x = x;
		this.y = y;
		this.speed_x = speed_x;
		this.speed_y = speed_y;
		
	}
	
	public float getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}
	public void update(float time){
		this.x += speed_x*time;
		this.y += speed_y*time;
		if(x<-51){
			
			speed_x *=-1;
			
		}if(x+image.getWidth()>500){
		
			speed_x *= -1;
		
		}
		if(y<-51){
			
			speed_y *=-1;
			
		}if(y+image.getHeight()+20>500){
			
			speed_y *= -1;
			
		}
	
	}
	public void setY(int y) {
		this.y = y;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	
	public Ball(){
		
	}
	

}
