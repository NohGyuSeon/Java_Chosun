package prac10_06;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClickPracticeFrame extends JFrame {
	
	JLabel la;
	
	ClickPracticeFrame() {
		setTitle("클릭 연습용 응용프로그램");
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		la = new JLabel("C");
		la.setSize(20, 20);
		la.setLocation(100, 100);
		la.addMouseListener(new MyMouseAdapter());
		
		add(la);
		setSize(300, 300);
		setVisible(true);
		la.requestFocus();
	}
	
	class MyMouseAdapter extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			Container c = la.getParent();
			JLabel la = (JLabel)e.getSource();
			
			int xBound = c.getWidth() - la.getWidth();
			int yBound = c.getHeight() - la.getHeight();
			int x = (int)(Math.random()*xBound);
			int y = (int)(Math.random()*yBound);
			la.setLocation(x, y);
		}
	}
}

public class ClickApp_20182337 {
	
	public static void main(String[] args) {
		new ClickPracticeFrame();
	}
}
