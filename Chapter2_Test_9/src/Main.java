import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double radius = scanner.nextDouble();
		
		System.out.print("�� �Է�>> ");
		double rectx = scanner.nextDouble();
		double recty = scanner.nextDouble();
		
		double distance = Math.sqrt((x-rectx)*(x-rectx) + (y-recty)*(y-recty));
		
		if(distance < radius)
		{
			System.out.println("�� ( " + rectx + ", " + recty + ") �� �� �ȿ� �ִ�.");
		}
		else if(distance == radius) {
			System.out.println("�� ( " + x + ", " + y + ") �� �� ���� �ִ�.");
		}
		else{
			System.out.println("�� ( " + rectx + ", " + recty + ") �� �� �ۿ� �ִ�.");
		}
		
		scanner.close();
	}
}
 