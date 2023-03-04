import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements KeyListener {

	JLabel la;
	String text = "Love Java";

	Main() {
		setTitle("Left 키로 문자열 바꾸기 예제");
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		la = new JLabel(text);
		la.addKeyListener(this);
		add(la);

		la.setFocusable(true);
		la.requestFocus();
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			text = text.substring(1) + text.substring(0, 1);
			la.setText(text);
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		new Main();
	}

}
