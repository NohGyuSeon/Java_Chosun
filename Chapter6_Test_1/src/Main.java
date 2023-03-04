
public class Main {
	
	private int x, y;
	
	public Main(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")"; 
	}
	
	public boolean equals(Object p) {
		Main po = (Main)p;
		if(x == po.x && y == po.y) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Main p = new Main(3, 50);
		Main q = new Main(4, 50);
		System.out.println(p);
		if(p.equals(q)) {
			System.out.println("같은 점");
		}
		else {
			System.out.println("다른 점");
		}
	}

}


