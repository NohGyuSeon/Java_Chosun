import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {

	String buf [] = {"CE", "Enter", "+", "-", "x", "/"};
	String numStr = "";
	JTextField t1, t2;
	
	Main() {
		setTitle("계산기 프레임");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		JPanel pn = new  JPanel();
		JPanel ps = new  JPanel();
		JPanel pc = new  JPanel();
		
		pn.setBackground(Color.GRAY);
		pc.setLayout(new GridLayout(4, 4));
		ps.setBackground(Color.YELLOW);

		c.add(pc, BorderLayout.CENTER);
		c.add(pn, BorderLayout.NORTH);
		c.add(ps, BorderLayout.SOUTH);
		
		JLabel pf = new JLabel("수식 입력");
		t1 = new JTextField(10);
		pn.add(pf);
		pn.add(t1);

		JLabel sol = new JLabel("계산 결과");
		t2 = new JTextField(10);
		ps.add(sol);
		ps.add(t2);

		for (int i = 0; i < 16; i++) {
			JButton b = new JButton();
			String text = Integer.toString(i);
			if (i < 10) {
				b.setText(text);
			} else {
				b.setText(buf[i - 10]);
			}
			if (i > 11) {
				b.setOpaque(true);
				b.setBackground(Color.cyan);
			}
			pc.add(b);
			b.addActionListener(this);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();

		if (str.equals("CE")) {
			numStr = "";
			t1.setText(numStr);
			t2.setText("");
		} else if (str.equals("Enter")) {
			StringTokenizer st = new StringTokenizer(numStr, "+-x/", true);

			int num1 = Integer.parseInt(st.nextToken());
			String op = st.nextToken();
			int num2 = Integer.parseInt(st.nextToken());
			switch (op) {
			case "+":
				t2.setText(num1 + num2 + "");
				break;
			case "-":
				t2.setText(num1 - num2 + "");
				break;
			case "x":
				t2.setText(num1 * num2 + "");
				break;
			case "/":
				t2.setText(num1 / num2 + "");
				break;
			default:
				t2.setText("오류");
				break;
			}
			numStr = "";
			t1.setText(numStr);
		} else {
			numStr += str;
			t1.setText(numStr);
		}
	}
}
