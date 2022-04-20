import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent; 

public class ThreadEx1 extends Frame {
	SnowThread snow; 
	CountThread count;
	AnimationThread animation;

	public ThreadEx1() {
		setTitle("ThreadTest");
		setSize(600, 200);
		setLayout(new GridLayout(1, 3));
		snow = new SnowThread();
		add(snow);
		count = new CountThread();
		add(count);
		animation = new AnimationThread();
		add(animation);
		Thread t1 = new Thread(snow);
		Thread t2 = new Thread(count);
		Thread t3 = new Thread(animation);		
		t1.start();
		t2.start();		
		t3.start();
		
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new ThreadEx1();

	}

}
