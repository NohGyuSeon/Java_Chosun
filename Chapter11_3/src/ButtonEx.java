import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame {
	
	public ButtonEx() { 
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("C:\\Users\\NOH GYUSEON\\Desktop\\조선대\\2학년 2학기\\자바프로그래밍\\images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Users\\NOH GYUSEON\\Desktop\\조선대\\2학년 2학기\\자바프로그래밍\\images/pressedIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("C:\\Users\\NOH GYUSEON\\Desktop\\조선대\\2학년 2학기\\자바프로그래밍\\images/rolloverIcon.gif");
		
		JButton btn = new JButton("hola~~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}
}
