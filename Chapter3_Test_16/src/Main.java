import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = { "����", "����", "��" };
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			int n = 0;
			System.out.print("���� ���� ��!>> ");
			
			String s = scanner.next();
			if(s.equals("����")) {
				n = 0;
			}
			else if(s.equals("����")) { 
				n = 1;
			}
			else if(s.equals("��")) {
				n = 2;
			}
			else if(s.equals("�׸�")) {
				n = 3;
			}
			else {
				n = 4;
			}	
			
			int ran = (int)(Math.random()*3);
			
			if(n == 0) {
				if(ran == 0) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", �����ϴ�.");
				}
				else if(ran == 1) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(ran == 2) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ����ڰ� �̰���ϴ�.");
				}
			}
			else if(n == 1) {
				if(ran == 0) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(ran == 1) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", �����ϴ�.");
				}
				else if(ran == 2) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(n == 2) {
				if(ran == 0) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(ran == 1) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", ����ڰ� �̰���ϴ�.");
				}
				else if(ran == 2) {
					System.out.println("����� = " + s + " , ��ǻ�� = " + str[ran] + ", �����ϴ�.");
				}
			}
			else if(n == 3) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}	
		}
		scanner.close();
	}
	
}
