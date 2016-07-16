import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Movic extends JFrame{
	
	public static void main(String[] args){
		DisplayMode dm = new DisplayMode(800,600,15,DisplayMode.REFRESH_RATE_UNKNOWN);
		Movic mov = new Movic();
		
		mov.run(dm);
		
	}
	public void run(DisplayMode dm){
		this.setBackground(Color.red);
		
		this.setForeground(Color.BLACK);
		this.setFont(new Font("Arial",Font.BOLD,40));
		Screen s = new Screen();
		
		try{
			s.setFullScreen(dm, this);
			try{
				Thread.sleep(5000);
			}catch(Exception e){}
		}finally{
			s.restorescreen();
		}
	}
	public void paint(Graphics g){
		g.drawString("Hello",Font.BOLD, 40);
	}
	
}
