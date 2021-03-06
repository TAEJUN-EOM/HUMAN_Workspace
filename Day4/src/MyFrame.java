import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class MyFrame extends Frame{
	Button b1, b2, b3;
	public MyFrame() {
		setTitle("MyFrame");
		setSize(300, 200);
		setBackground(Color.orange);
		setLayout(new FlowLayout());
		//setLayout(new GridLayout(2,2));
		b1 = new Button("red");
		b2 = new Button("green");
		b3 = new Button("blue");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(new ButtonEvent());//이벤트 감지자, 파라미터는 이벤트를 처리하는 핸들러객체
		b2.addActionListener(new ButtonEvent());
		b3.addActionListener(new ButtonEvent());
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
	}
	//Action이벤트 핸들러는 ActionListener 인터페이스 구현
	class ButtonEvent implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			 if(e.getSource()==b1) {
				 setBackground(Color.red);
			 }else if(e.getSource()==b2) {
				 setBackground(Color.green);
			 }else if(e.getSource()==b3) {
				 setBackground(Color.blue);
			 }	 
		}
		
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
