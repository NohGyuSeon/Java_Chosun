import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {
	
	JTextField t1 = new JTextField(10);
	JTextField t2 = new JTextField(10);
	
	Container c = getContentPane();
	JPanel pn = new JPanel();
	JPanel ps = new JPanel();
	JPanel pc = new JPanel();

	Main() {
		
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(450, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pn.setBackground(Color.LIGHT_GRAY);
		pc.setBackground(Color.white);
		ps.setBackground(Color.YELLOW);

		c.add(pn, BorderLayout.NORTH);
		c.add(pc);
		c.add(ps, BorderLayout.SOUTH);
		
		String buf [] = {"Open", "Close", "Exit"};
		for (int i = 0; i < buf.length; i++) {
			JButton b = new JButton();
			b.setText(buf[i]);
			pn.add(b);
		}

		JLabel la1 = new JLabel("Text Input");
		JLabel la2 = new JLabel("Number Input");
		JButton btn = new JButton("Ok");
		ps.add(la1);
		ps.add(t1);
		ps.add(la2);
		ps.add(t2);
		ps.add(btn);
		btn.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
 		String str = t1.getText();
 		int num = Integer.parseInt(t2.getText());
		pc.setLayout(null);
 		for (int i = 0; i < num; i++) {
			int x = (int)(Math.random() * 300);
			int y = (int)(Math.random() * 300);
			JLabel la = new JLabel(str);
			la.setOpaque(true);
			la.setForeground(Color.RED);
			la.setBackground(null);
			la.setBounds(x, y, 10, 10);
			pc.add(la);
		}
 		pc.revalidate();
 		pc.repaint();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}

/*
class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 300);
			int y = (int) (Math.random() * 300);
			JLabel label = new JLabel("*");
			label.setForeground(Color.RED);
			label.setLocation(x, y);
			label.setSize(20, 20);
			label.setOpaque(true);
			add(label);
		}
	}
}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		add(new JButton("Word Input"));
		add(new TextField(15));
	}
}

public class Main extends JFrame {
	Main() {
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NorthPanel nP = new NorthPanel();
		CenterPanel nC = new CenterPanel();
		SouthPanel nS = new SouthPanel();
		add(nP, BorderLayout.NORTH);
		add(nC);
		add(nS, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}
}
*/
