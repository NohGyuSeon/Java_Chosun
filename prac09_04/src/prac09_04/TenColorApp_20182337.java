package prac09_04;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class TenColorButtonFrame extends JFrame {

	TenColorButtonFrame() {
		setTitle("Ten Color Buttons JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));

		for (int i = 0; i < 10; i++) {
			Color[] col = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.magenta,
					Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
			String text = Integer.toString(i);
			JButton b = new JButton(text);
			b.setOpaque(true);
			b.setBackground(col[i]);
			c.add(b);
		}

		setSize(500, 200);
		setVisible(true);
	}
}

public class TenColorApp_20182337 {

	public static void main(String[] args) {
		new TenColorButtonFrame();
	}

}
