import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("문자열을 입력하시오, 빈칸이 잆든 없든지");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			String first = text.substring(0, 1);
			
			String last = text.substring(1);
			text = last + first;
			System.out.println(text);
		}
		scanner.close();
		
	}
	
}
