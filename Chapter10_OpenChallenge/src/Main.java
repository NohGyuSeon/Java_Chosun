import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JLabel[] la = new JLabel[3];
	private JLabel result = new JLabel("시작합니다.");

	Main() {
		setTitle("Open Challenge");
		setSize(300, 200);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		for (int i = 0; i < 3; i++) {
			la[i] = new JLabel("0");
			la[i].setBounds(30 + 80 * i, 50, 60, 30);
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setOpaque(true);
			la[i].setForeground(Color.yellow);
			la[i].setBackground(Color.MAGENTA);
			la[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
			add(la[i]);
			la[i].addKeyListener(new MyKeyAdapter());
			la[i].setFocusable(true);
			la[i].requestFocus();
		}

		result.setSize(200, 20);
		result.setLocation(100, 120);
		add(result);

		setVisible(true);
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyChar() == '\n') {
				int x1 = (int) (Math.random() * 5);
				la[0].setText(Integer.toString(x1));
				int x2 = (int) (Math.random() * 5);
				la[1].setText(Integer.toString(x2));
				int x3 = (int) (Math.random() * 5);
				la[2].setText(Integer.toString(x3));

				if (x1 == x2 && x2 == x3)
					result.setText("축하합니다!!");
				else
					result.setText("아쉽군요");
			}
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
