import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		System.out.println("ö�� >> ");
		String Boy = scanner.next();
		System.out.println("���� >> ");
		String Girl = scanner.next();
		
		if(Boy.equals("����")) {
			if(Girl.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if(Girl.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if(Girl.equals("��")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���!");
			}
		}
		else if(Boy.equals("����")) {
			if(Girl.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if(Girl.equals("��")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if(Girl.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���!");
			}
		}
		else if(Boy.equals("��")) {
			if(Girl.equals("��")) {
				System.out.println("�����ϴ�.");
			}
			else if(Girl.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if(Girl.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���!");
			}
		}
		else {
			System.out.println("�ٽ� �Է��ϼ���!");
		}
		
		scanner.close();
	}
	
}
