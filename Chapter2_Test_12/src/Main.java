import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����>> (��ĭ���� �и��Ͽ� �Է�) ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
			else {
				res = num1 / num2;
			}
		}
		else {
			System.out.println("��Ģ������ �ƴմϴ�.");
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
				System.out.println("0���� ���� �� �����ϴ�.");
				scanner.close();
				return;
			}
			else {
				res = num1 / num2;
				break;
			}
		default:
			System.out.println("��Ģ������ �ƴմϴ�.");
			scanner.close();
			return;
		}
		System.out.println(num1 + calc + num2 +"�� ��� ����� " + res);
		scanner.close();
	}
	
}
