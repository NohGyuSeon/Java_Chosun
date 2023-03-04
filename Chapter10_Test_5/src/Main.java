import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	
	JLabel la;
	String text = "Love Java";

	Main() {
		setTitle("+,-키로 폰트 크기 조절");
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		la = new JLabel(text);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addKeyListener(new MyKeyAdapter());
		add(la);

		la.setFocusable(true);
		la.requestFocus();
		setVisible(true);
	}
	
	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Font f = la.getFont();
			int size = f.getSize();
			
			switch (e.getKeyChar()) {
			case '-':
				if (size > 5) {
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
				else {
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}
				break;
			case '+':
				la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				break;
			default:
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
