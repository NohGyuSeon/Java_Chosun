import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String course [] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" }; 
		int score [] = {95, 88, 76, 62, 55};

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���� �̸�>> ");
			String name = scanner.next();
			if(name.equals("�׸�")) {
				break;
			}
			
			int i = 0;
			
			for(i = 0; i < score.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(name + "�� ������ " + score[i]);
					break;
				}
			}
			
			if(i == score.length) {
				System.out.println("���� �����Դϴ�.");
			}
		}
		
		scanner.close();
	}
}