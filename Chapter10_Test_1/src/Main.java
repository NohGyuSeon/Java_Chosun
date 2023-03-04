import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	Main() {
		setTitle("마우스 올리기 내리기 예제");
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel la = new JLabel("Love Java");
		la.addMouseListener(new MyMouseAdapter());
		la.setSize(200, 50);
		add(la);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			JLabel la1 = (JLabel)e.getSource();
			la1.setText("사랑해");
		}

		public void mouseExited(MouseEvent e) {
			JLabel la2 = (JLabel)e.getSource();
			la2.setText("Love Java");
		}
	}
}
