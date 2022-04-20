import java.awt.Panel;
import java.awt.Color;
import java.awt.Graphics;
public class SnowThread extends Panel implements Runnable {	
	int x, y;

	public SnowThread() {
		setBackground(Color.black);
		setSize(200, 200);
	}
	@Override
	public void run() {
		while(true) {
			x = (int)(Math.random()*200);
			y = (int)(Math.random()*200);		
			repaint(); //update()->paint() »£√‚
			try {
			Thread.sleep(200);
			}catch(InterruptedException e) {
				
			}
		}		
	}//run() end	
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, 5, 5);
	}
}
