import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integers followed by -1 at the end.");
		
		int n = scanner.nextInt();
		while(n != -1) {
			sum += n;
			count++;
			n = scanner.nextInt();
		}
		if(count == 0) {
			System.out.println("No number entered.");
		}
		else {
			System.out.print("The number of integers is " + count + ",");
			System.out.print("The average is " + (double)sum/count);
		}
		scanner.close();
	}
}
