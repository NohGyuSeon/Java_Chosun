import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		String text[] = { "Hello", "Java", "Love" };
		for (int i = 0; i < 3; i++) {
			int x = (int) (Math.random() * 200);
			int y = (int) (Math.random() * 200);
			JLabel la = new JLabel(text[i]);
			la.setBounds(x, y, 50, 20);
			la.setOpaque(true);
			la.setForeground(Color.BLUE);
			la.setBackground(null);
			add(la);
		}
	}
}
	
public class Main extends JFrame {
	Main() {
		setTitle("Open Challenge 9");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		NorthPanel Np = new NorthPanel();
		CenterPanel Cp = new CenterPanel();
		add(Np, new BorderLayout().NORTH);
		add(Cp);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
