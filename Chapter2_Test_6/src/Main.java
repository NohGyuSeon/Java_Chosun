import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		if((i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) && (i / 10 == 3 || i / 10 == 6 || i % 10 == 9)) {
			System.out.println("�ڼ�¦¦");
		}
		else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i % 10 == 9) {
			System.out.println("�ڼ�¦");			
		}
		else {
			System.out.println("�ڼ�");
		}
			
		scanner.close();
	}

}
