import java.util.Scanner;

public class Main {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ��� >> ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(inRect(x, y, 100, 100, 200, 200) == true) {
			System.out.println("���簢���� ������ �浹�մϴ�!");
		}
		else {
			System.out.println("���簢���� ������ �浹���� �ʽ��ϴ�!");
		}
		
		scanner.close();
	}

}
