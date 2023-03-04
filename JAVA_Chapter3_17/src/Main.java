import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 integers");
		int sum = 0, n = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print(i+">>");
			try {
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("Not an integer. Please enter again!");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.print("Sum is " + sum);
		scanner.close();
	}
}
 