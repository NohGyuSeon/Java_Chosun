class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main extends Point {
	private int z;
	
	public Main(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}
	
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + "," + getZ() + ")�� ��";
	}
	
	public static void main(String[] args) {
		Main p = new Main(1, 2, 3); 
		System.out.println(p.toString() + "�Դϴ�."); 
		
		p.moveUp(); 
		System.out.println(p.toString() + "�Դϴ�."); 
		
		p.moveDown(); 
		p.move(10, 10); 
		System.out.println(p.toString() + "�Դϴ�."); 
		
		p.move(100, 200, 300); 
		System.out.println(p.toString() + "�Դϴ�.");
	
	}

}
