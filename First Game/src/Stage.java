import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stage {
	
	private Rectangle rec = new Rectangle(0,630,800,20);
	public Stage(){
	
	}	
	public boolean isCollided(Rectangle entity){
			return rec.intersects(entity);
		}
public void draw(Graphics g){
	g.setColor(Color.WHITE);
	g.fillRect(rec.x, rec.y, rec.width, rec.height);
	
}
}