import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	JLabel la;
	StringBuffer s = new StringBuffer("Love Java");

	Main() {
		setTitle("Left 키로 문자열 바꾸기 예제");
		setSize(400, 200);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		la = new JLabel("Love Java");

		la.addKeyListener(new MyKeyAdapter());

		la.setSize(200, 50);
		add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		setVisible(true);
	}
	
	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (la.getText().equals("Love Java")) {
					la.setText(s.reverse().toString());
				} else {
					la.setText(s.reverse().toString());
				}
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
