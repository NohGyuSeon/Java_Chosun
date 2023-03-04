import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("정수를 입력하시오>> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n<=0) {
			System.out.println("0보다 커야 합니다.");
			scanner.close();
			return;
		}
		
		for(int i = n; i > 0; i--) {
			for(int j = n; j > n - i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
