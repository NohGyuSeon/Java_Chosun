import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.print("������ �Է��Ͻÿ�>> ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if (n<=0) {
			System.out.println("0���� Ŀ�� �մϴ�.");
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
