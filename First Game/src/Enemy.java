import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy extends Entity{
private Rectangle rec ;
int ix =0, iy=1;
private Game game;
private boolean dead = false;
	public Enemy(Game game ,int x, int y) {
		super(x, y);
		this.game = game;
		rec = new Rectangle(x,y,40,40);
	}
	public void draw(Graphics g){
		move();
		g.setColor(Color.RED);
		g.fillRect(rec.x, rec.y, rec.width, rec.height);
		
	}
	public void move(){
		if(game.getStage().isCollided(rec)){
			iy = 0;
			dead = true;
		}
		rec.x += ix;
		rec.y += iy;
	}
	public boolean isDead(){
		return dead;
	}
	public Rectangle getRec(){
		return rec;
	}


}
