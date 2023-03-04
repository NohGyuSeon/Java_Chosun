import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double x() {
		return x;
	}
	
	public double y() {
		return y;
	}
	
	public int radius() {
		return radius;
	}
	
	
	public double area() {
		return radius * radius * 3.14;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3];
		double max;
		int j = 0;
		for(int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		max = c[0].area();
		
		for(int i = 0; i < c.length; i++) {
			if (max < c[i].area()) {
				max = c[i].area();
				j = i;
			}
		}
		System.out.println("가장 면적이 큰 원은 " + "(" + c[j].x() + "," + c[j].y() + ")" + + c[j].radius());
		scanner.close();	
	}

}
