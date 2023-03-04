import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("원의 중심과 반지름 입력>> ");
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double radius = scanner.nextDouble();
		
		System.out.print("점 입력>> ");
		double rectx = scanner.nextDouble();
		double recty = scanner.nextDouble();
		
		double distance = Math.sqrt((x-rectx)*(x-rectx) + (y-recty)*(y-recty));
		
		if(distance < radius)
		{
			System.out.println("점 ( " + rectx + ", " + recty + ") 는 원 안에 있다.");
		}
		else if(distance == radius) {
			System.out.println("점 ( " + x + ", " + y + ") 는 원 위에 있다.");
		}
		else{
			System.out.println("점 ( " + rectx + ", " + recty + ") 는 원 밖에 있다.");
		}
		
		scanner.close();
	}
}
 