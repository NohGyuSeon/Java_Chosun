import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	JLabel la;
	
	Main() {
		setTitle("클릭 연습용 응용프로그램");
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la = new JLabel("C");
		la.setSize(100, 50);
		la.setLocation(100, 100);
		la.addMouseListener(new MyMouseAdapter());
		add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapter {
		int x, y;
		public void mousePressed(MouseEvent e) {
			x = (int)(Math.random()*400);
			y = (int)(Math.random()*400);
			la.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
