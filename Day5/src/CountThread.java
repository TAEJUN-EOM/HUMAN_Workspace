import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Font;
public class CountThread extends Panel implements Runnable {
	int num;

	public CountThread() {
		setSize(200, 200);
	}
	@Override
	public void run() {		
		while(true) {
			++num;
			repaint();
			try {
			Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}			
		}		
	}//run() end	
	 
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.setFont(new Font("Arial Black",Font.BOLD, 70)); //Font(String name, int style, int size)
		g.drawString(String.valueOf(num) ,100, 100 );
	}

}
