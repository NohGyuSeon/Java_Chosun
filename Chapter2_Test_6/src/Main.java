import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		if((i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) && (i / 10 == 3 || i / 10 == 6 || i % 10 == 9)) {
			System.out.println("박수짝짝");
		}
		else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9 || i / 10 == 3 || i / 10 == 6 || i % 10 == 9) {
			System.out.println("박수짝");			
		}
		else {
			System.out.println("박수");
		}
			
		scanner.close();
	}

}
