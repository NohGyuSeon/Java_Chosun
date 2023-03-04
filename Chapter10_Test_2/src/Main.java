import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements MouseMotionListener, MouseListener {

	JPanel p = new JPanel();

	Main() {
		setTitle("µå·¡±ëµ¿¾È YELLO");
		setSize(400, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setContentPane(p);
		p.setBackground(Color.GREEN);
		p.addMouseMotionListener(this);
		p.addMouseListener(this);
		setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		p.setBackground(Color.YELLOW);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		p.setBackground(Color.GREEN);
	}

	public static void main(String[] args) {
		new Main();
	}
}
