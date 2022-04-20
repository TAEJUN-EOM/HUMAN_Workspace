import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Image;
import java.awt.Toolkit;
public class AnimationThread extends Panel implements Runnable {
    Image[] images = new Image[17];
    Image current ;
	public AnimationThread() {
		setSize(200, 200);
		for(int i=0;i<images.length;i++) {
			images[i] = Toolkit.getDefaultToolkit().getImage("D:\\workspace\\Day5\\src\\images\\T"+(i+1)+".gif");
		}
	}
	@Override
	public void run() {		
		int idx = 0;
		while(true) {	
			System.out.println(idx);
			if(idx==images.length) idx=0;
			current = images[idx];
			repaint();			 
			try {
			Thread.sleep(200);
			}catch(InterruptedException e) {
				
			}	
			idx++;
		}	
		 
	}//run() end
	public void paint(Graphics g) {	 
		g.drawImage(current, 50, 50, this);
	}
}
