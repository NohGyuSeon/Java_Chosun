
public class Main {
	
	private int x, y, width, height;
	
	public Main(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		return width * height;
	}
	
	public void show() {
		System.out.printf("(%d, %d)에서 크기가 %dX%d인 사각형\n", this.x, this.y, this.width, this.height);
	}
	
	public boolean contains(Main cR) {
		if (cR.x > this.x && cR.y > this.y) {
			if (cR.x + cR.width < this.x + this.width && cR.y + cR.height < this.y + this.height) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Main r = new Main(2, 2, 8, 7); 
		Main s = new Main(5, 5, 6, 6); 
		Main t = new Main(1, 1, 10, 10);
		r.show(); 
		System.out.println("s의 면적은 " + s.square()); 
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다."); 
		if (t.contains(s)) 
			System.out.println("t는 s를 포함합니다.");
	}

}
