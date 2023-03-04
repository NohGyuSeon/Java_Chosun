class Point {
	
	private int x, y;
	
	public Point(int x, int y) { 
		this.x = x; this.y = y; 
	}
	
	public int getX() { 
		return x; 
	}
	
	public int getY() { 
		return y; 
	}
	
	protected void move(int x,int y) { 
		this.x = x; 
		this.y = y; 
	}
}

public class Main extends Point {
	
		public Main() {
			super(0, 0);
		}
		
		public Main(int x, int y) {
			super(x, y);
			if(x<0 || y<0)
				super.move(0, 0);
		}
		
		@Override
		protected void move(int x, int y) {
			if(x>0 && y>0)
				super.move(x, y);
		}
		
		public String toString() {
			return "(" + getX() + "," + getY() + ")"; 
		}
		
	public static void main(String[] args) {
		Main p = new Main();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		Main p2 = new Main(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
	
}
