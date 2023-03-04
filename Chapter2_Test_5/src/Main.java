import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("정수 3개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		if((num1+num2) > num3 || (num1+num3) > num2 || (num2+num3) > num1)
		{
			System.out.println("삼각형이 됩니다");
		}
		else {
			System.out.println("삼각형이 안됩니다");
		}
		
		scanner.close();
	}
}
