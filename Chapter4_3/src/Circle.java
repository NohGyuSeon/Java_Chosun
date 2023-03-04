
public class Circle {
	int radius;
	String name;
	
	public Circle() {
		this.radius = 1;
		this.name = "";
	}
	
	public Circle(int r, String n) {
		this.radius = r;
		this.name = n;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle(10, "JavaPizza");
		
		double area = pizza.getArea();
		System.out.println("The area is " + area);
		
		Circle donut = new Circle();
		donut.name = "DonutPizza";
				
		area = donut.getArea();
		System.out.println("The area is " + area);
	}

}
