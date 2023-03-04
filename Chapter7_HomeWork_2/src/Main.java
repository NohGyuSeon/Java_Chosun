import java.util.Scanner;
import java.util.Vector;

class Point {
	int x; // 점의 x 좌표 값
	int y; // 점의 y 좌표 값

	public Point() {
		
	}

	// 객체 초기화: x, y 좌표 초기화
	 public Point(int x, int y) {
		this.x = x;	this.y = y;
	}

	 // x, y 좌표를 각각 width, height만큼 이동시킨다.
	 public void move(int width, int height) {
		this.x += width;
		this.y += height;
	}

	// (x,y) 좌표 문자열을 리턴, 예) "(10, 15)"
	// 메소드 오버라이딩, Object 클래스의 public String toString()을 오버라이딩 
	 @Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}

abstract class Shape {
	public abstract String draw();                       // 정보 출력
	public abstract Shape move(int width, int height);    // 좌표 이동
};

class Rect extends Shape {
	private Point p1;	// 사각형의 왼쪽 위쪽 좌표
	private Point p2;	// 사각형의 오른쪽 아래쪽 좌표

	//생성자: 멤버 초기화
	public Rect(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Rect() {
		// TODO Auto-generated constructor stub
	}

	// Shape 의 draw 메소드 오버라이딩
	@Override
	public String draw() {
		// 실질적인 자료를 리턴하는 함수는 toString
		// 함수 내부에서 toString() 메소드 호출
		return toString();
	}
	
	// 메소드 오버라이딩, Object 클래스의 public String toString()을 오버라이딩 
	 @Override
	public String toString() {
                   //화면에 사각형의 좌표 값을 출력, 예) "Rectangle (10,15) (20,30)"
		 return ( "[Rectangle  " + p1.toString() + " " + p2.toString() + "]");
	}
	
	public Rect move(int width, int height) {
		//기존 객체의 위치를 width, height만큼 옮긴다.
		p1.move(width, height);
		p2.move(width, height);

		return new Rect(p1, p2);
	}
}

class Circle extends Shape {
	private Point center;	// 원의 중심 좌표
	private int radius;   // 반지름의 길이
	
	//생성자: 멤버 초기화
	public Circle(int radius, Point center) {
		this.radius = radius;
		this.center = center;
	}
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	// Shape 의 draw 메소드 오버라이딩
	@Override
	public String draw() {
		// 실질적인 자료를 리턴하는 함수는 toString
		// 함수 내부에서 toString() 메소드 호출
		return toString();
	}
	
	// 메소드 오버라이딩, Object 클래스의 public String toString()을 오버라이딩 
	 @Override
	public String toString() {
                   //화면에 반지름과 중심 좌표 값을 출력, 예) "Circle 5 (20,30)"
		 return ( "[Circle " +  radius + " " + center.toString() + "]");
	}
	
	public Circle move(int width, int height) {
		//기존 객체의 위치를 width, height만큼 옮긴다.
		center.move(width, height);
		
		return new Circle(radius, center);
	}
}

class Line extends Shape {
	private Point p1;	// 사각형의 왼쪽 위쪽 좌표
	private Point p2;	// 사각형의 오른쪽 아래쪽 좌표
	
	// 생성자 작성
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line() {
		// TODO Auto-generated constructor stub
	}

	// Shape 의 draw 메소드 오버라이딩
	// 실질적인 자료를 리턴하는 함수는 toString
    // 함수 내부에서 toString() 메소드 호출
	@Override
	public String draw() { return toString(); }
	
	// 화면에 라인의 좌표 값을 출력, 예) "Line (10,15) (20,30)"
	// 메소드 오버라이딩, Object 클래스의 public String toString()을 오버라이딩 
	 @Override
	public String toString() {
		return ( "[Line " + p1.toString() + " " + p2.toString() + "]");
	}

	//기존 객체의 위치를 width, height만큼 옮긴다.
	public Line move(int width, int height) {
		//기존 p1의 위치를 width, height만큼 옮긴다.
		p1.move(width, height);
		//기존 p2의 위치를 width, height만큼 옮긴다.
		p2.move(width, height);
		
		return new Line(p1, p2);
	}
}
public class Main {

	private Scanner scanner = new Scanner(System.in);
	private Vector<Shape> v = new Vector<Shape>();
	Point Ftype1 = new Point();
	Point Ftype2 = new Point();
	Point Rtype1 = new Point();
	Point Rtype2 = new Point();
	int width, height, Fradius, Rradius;
	
	public void run() {
		System.out.println("Select one operation");
		int menu = 0;
		int choice = 0;
		int index = 0, hood = 0;
		
		while (true) {
		
			System.out.println("Insert(Front):0, Insert(Rear):1, Remove(Front):2, Remove(Rear):3"); 
			System.out.print("Move(Front):4, Move(Rear):5, Print List:6, Exit:7 >> ");
			menu = scanner.nextInt();

			if(menu != 7) {
				switch (menu) {
				case 0:
					System.out.println("Select one Shape");
					System.out.print("Rectangle:0, Circle:1, Line:2 >> ");
					choice = scanner.nextInt();
					switch (choice) {
					case 0:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Ftype1.x = scanner.nextInt();
						Ftype1.y = scanner.nextInt();
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Ftype2.x = scanner.nextInt();
						Ftype2.y = scanner.nextInt();
						v.add(0, new Rect(Ftype1, Ftype2));
						view();
						index = 0;
						break;
					case 1:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Ftype1.x = scanner.nextInt();
						Ftype1.y = scanner.nextInt();
						System.out.print("Enter the radius (enter one integer) >> ");
						Fradius = scanner.nextInt();
						v.add(0, new Circle(Fradius, Ftype1));
						view();
						index = 1;
						break;
					case 2:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Ftype1.x = scanner.nextInt();
						Ftype1.y = scanner.nextInt();
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Ftype2.x = scanner.nextInt();
						Ftype2.y = scanner.nextInt();
						v.add(0, new Line(Ftype1, Ftype2));
						view();
						index = 2;
						break;
					}
					break;
					
				case 1:
					System.out.println("Select one Shape");
					System.out.print("Rectangle:0, Circle:1, Line:2 >> ");
					choice = scanner.nextInt();
					switch (choice) {
					case 0:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Rtype1.x = scanner.nextInt();
						Rtype1.y = scanner.nextInt();
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Rtype2.x = scanner.nextInt();
						Rtype2.y = scanner.nextInt();
						v.add(new Rect(Rtype1, Rtype2));
						view();
						hood = 0;
						break;
					case 1:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Rtype1.x = scanner.nextInt();
						Rtype1.y = scanner.nextInt();
						System.out.print("Enter the radius (enter one integer) >> ");
						Rradius = scanner.nextInt();
						v.add(new Circle(Rradius, Rtype1)); 
						view();
						hood = 1;
						break;
					case 2:
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Rtype1.x = scanner.nextInt();
						Rtype1.y = scanner.nextInt();
						System.out.print("Enter point coordinates (enter two integers) >> ");
						Rtype2.x = scanner.nextInt();
						Rtype2.y = scanner.nextInt();
						v.add(v.size(), new Line(Rtype1, Rtype2));
						view();
						hood = 2;
						break;
					}
					break;

				case 2:
					Fdelete();
					view();
					break;

				case 3:
					Rdelete();
					view();
					break;

				case 4:
					System.out.print("The two integers to move along the X and Y axes (enter two integers) >> ");
					width = scanner.nextInt();
					height = scanner.nextInt();
					if(index == 0) {
						Ftype1.x += width;
						Ftype1.y += height;
						Ftype2.x += width;
						Ftype2.y += height;

						Rect r = new Rect();
						v.set(0, r.move(width, height));
					}
					else if(index == 1) {
						Ftype1.x += width;
						Ftype1.y += height;

						Circle c = new Circle();
						v.set(0, c.move(width, height));
					}
					else if(index == 2) {
						Ftype1.x += width;
						Ftype1.y += height;
						Ftype2.x += width;
						Ftype2.y += height;

						Line l = new Line();
						v.set(0, l.move(width, height));
					}
					view();
					break;
				case 5:
					System.out.print("The two integers to move along the X and Y axes (enter two integers) >> ");
					width = scanner.nextInt();
					height = scanner.nextInt();
					if(hood == 0) {
						Rtype1.x += width;
						Rtype1.y += height;
						Rtype2.x += width;
						Rtype2.y += height;

						Rect r = new Rect();
						v.set(v.size()-1, r.move(width, height));
					}
					else if(hood == 1) {
						Rtype1.x += width; 
						Rtype1.y += height;

						Circle c = new Circle();
						v.set(v.size()-1, c.move(width, height));
					}
					else if(hood == 2) {
						Rtype1.x += width;
						Rtype1.y += height;
						Rtype2.x += width;
						Rtype2.y += height;
						
						Line l = new Line();
						v.set(v.size()-1, l.move(width, height));
					}
					view();
					break;

				case 6:
					view();
					break;
				}
			}

			else {
				System.out.println("Good Bye");
				break;
			}
		}
	}

	public void view() {
		if(!v.isEmpty()) {
			for (int i = 0; i < v.size(); i++) {
				Shape S = v.get(i);
				System.out.print(S);
				System.out.println();
			} 
		}
	}

	private void Fdelete() {
		int length = v.size();
		v.remove(0);
	}
	
	private void Rdelete() {
		int length = v.size();
		v.remove(length-1);
	}

	public static void main(String[] args) {
		Main man = new Main();
		man.run();
	}
}
