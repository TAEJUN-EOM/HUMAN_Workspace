import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class MyFrame2 extends Frame implements   Externalizable{
	Button b1, b2, b3;
	ButtonEvent event;
	public MyFrame2() {
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
		event = new ButtonEvent();
		b1.addActionListener(event);//이벤트 감지자, 파라미터는 이벤트를 처리하는 핸들러객체
		b2.addActionListener(event);
		b3.addActionListener(event);
		//setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				System.exit(0);
			}
		});
		
	}
	//Action이벤트 핸들러는 ActionListener 인터페이스 구현
	class ButtonEvent implements ActionListener, Serializable{
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
	}//inner class end
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		 out.writeObject(b1);
		 //out.writeObject(b2);
		 out.writeObject(b3);
		 out.writeObject(event);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 this.b1 = (Button)in.readObject();
		 //this.b2 = (Button)in.readObject();
		 this.b3 = (Button)in.readObject();
		 this.event = (ButtonEvent)in.readObject();
	}
	
	
	 
}//class 
