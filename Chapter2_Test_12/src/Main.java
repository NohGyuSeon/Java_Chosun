import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>> (빈칸으로 분리하여 입력) ");
		int num1 = scanner.nextInt();
		String calc = scanner.next();
		int num2 = scanner.nextInt();
		int res = 0;
		
		/*
		if(calc.equals("+") == true) {
			res = num1 + num2;
		}
		else if(calc.equals("-") == true) {
			res = num1 - num2;
		}
		else if(calc.equals("*") == true) {
			res = num1 * num2;
		}
		else if(calc.equals("/") == true) {
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			else {
				res = num1 / num2;
			}
		}
		else {
			System.out.println("사칙연산이 아닙니다.");
			scanner.close();
			return;
		}
		*/
		
		switch(calc) {
		case "+":
			res = num1 + num2;
			break;
		case "-":
			res = num1 - num2;
			break;
		case "*":
			res = num1 * num2;
			break;
		case "/":
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			else {
				res = num1 / num2;
				break;
			}
		default:
			System.out.println("사칙연산이 아닙니다.");
			scanner.close();
			return;
		}
		System.out.println(num1 + calc + num2 +"의 계산 결과는 " + res);
		scanner.close();
	}
	
}
