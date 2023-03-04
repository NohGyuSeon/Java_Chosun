import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	JLabel la;

	Main() {
		setTitle("���콺 ���� ���� ��Ʈ ũ�� ���� �������α׷�");
		setSize(400, 200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la = new JLabel("Love Java");
		la.setSize(200, 50);
		la.setFont(new Font("Arial", Font.PLAIN, 10));
		la.addMouseWheelListener(new MyMouseWheelListener());
		add(la);
		
		la.setFocusable(true);
		la.requestFocus();
		setVisible(true);
	}

	class MyMouseWheelListener implements MouseWheelListener {
		Font f;
		int size;
		int n;
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			f = la.getFont();
			size = f.getSize();
			n = e.getWheelRotation();
			if(n<0 && size>5)
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			else
				la.setFont(new Font("Arial", Font.PLAIN, size+5));
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
