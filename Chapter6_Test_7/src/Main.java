import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(">> ");
			String s = scanner.nextLine();
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�...");
				break;
			}
			
//			StringTokenizer st = new StringTokenizer(s, " ");
//			System.out.println("���� ������ " + st.countTokens());

			String [] words = s.split(" ");
			System.out.println("���� ������ " + words.length);
		}

		scanner.close();
	}
	
}