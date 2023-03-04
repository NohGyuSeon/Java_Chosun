import javax.swing.JFrame;

public class Main extends JFrame {
	
	Main() {
		setTitle("Let's study Java");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Main();
	}
}
