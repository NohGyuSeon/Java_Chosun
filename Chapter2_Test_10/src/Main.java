import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù���� ���� �߽ɰ� ������ �Է�>> ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		System.out.println("�ι��� ���� �߽ɰ� ������ �Է�>> ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double radius = radius1 + radius2;
		
		if(distance <= radius) {
			System.out.println("�� ���� ���� ��ģ��");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�");
		}
		
		scanner.close();
	}
	
}
