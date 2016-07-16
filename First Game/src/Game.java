import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Game extends JPanel implements KeyListener , MouseListener{
	int x = 5;
	int y =5 ;
	Stage stage;
	Timer time;
	Enemymang enemy;
	boolean gameisover = false;
	Player play;
	int amount =0;
	JLabel lab;
	public Game(){
		play = new Player(this ,350,620);
		lab = new JLabel();
		stage = new Stage();
		enemy = new Enemymang(this ,10);
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(800,700));
		this.setFocusable(true);
		this.addKeyListener(this);
		this.addMouseListener(this);
		timeclass ss = new timeclass();
		time = new Timer(1000,ss);
		this.setForeground(Color.WHITE);
		add(lab);
		
	}public void update(Graphics g){
		paint(g);
	}
	public Enemymang getMang(){
		return enemy;
	}
	public Stage getStage(){
		return stage;
	}
	
	public void paint(Graphics g){
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		if(!gameisover){
		stage.draw(g);
		play.draw(g);
		enemy.draw(g);
		}else{
			g.setFont(new Font("Century Gothic",Font.BOLD,40));
			g.setColor(Color.WHITE);
			g.drawString("Game Over", 300, 400);
		}
		repaint();
	
	}
	
	public static void main(String[] args){
		
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(800,700));
		frame.add(new Game());
		frame.setPreferredSize(new Dimension(500,400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_W){
			play.getYD(-4);
		}if(key == KeyEvent.VK_D){
			play.getXD(1);
		}if(key == KeyEvent.VK_S){
			play.getYD(4);
		}if(key == KeyEvent.VK_A){
			play.getXD(-1);
		}
		
	}
	public void isGameOver(Boolean flag){
		gameisover = flag;
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
	play.getXD(0);
	play.getYD(0);
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
	
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
	
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {

		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		
		
	}
	class timeclass implements ActionListener{
		int x = 0;
		public timeclass(){
	
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			x++;
			lab.setText("Score "+x);
			
		}
		
	}

}
