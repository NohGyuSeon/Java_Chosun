import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {
	
	Main() {
		setTitle("Random Labels");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;

			JLabel label = new JLabel((int) (Math.random() * 100) + "");
			label.setBounds(x, y, 10, 10);
			label.setOpaque(true);
			label.setBackground(Color.BLUE);
			c.add(label);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}
