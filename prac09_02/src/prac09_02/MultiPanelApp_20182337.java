package prac09_02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		
		Container container = new Container();
		container.setLayout(new FlowLayout());

		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		for (int i = 0; i < 20; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			JLabel label = new JLabel("*");
	label.setForeground(Color.WHITE);
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

class MultiPanelFrame extends JFrame {

	MultiPanelFrame() {
		setTitle("여러 개의 패널을 가진 프레임");
		setSize(320, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		NorthPanel nN = new NorthPanel();
		CenterPanel nC = new CenterPanel();
		SouthPanel nS = new SouthPanel();
		add(nN, BorderLayout.NORTH);
		add(nS, BorderLayout.SOUTH);
		add(nC);
		setVisible(true);
	}
}

public class MultiPanelApp_20182337 {

	public static void main(String[] args) {

		new MultiPanelFrame();
	}
}
