import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("���� 3�� �Է�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int mid = num1;
		if(num1 >= num2) {
			if(num2 >= num3) {
				mid = num2;
			}
			else {
				mid = (num1>=num3)?num3:num1;
			}
		}
		else {
			if(num2 <= num3) {
				mid = num2;
			}
			else {
				mid = (num1>=num3)?num1:num3;
			}
		}
		
		System.out.println("�߰� ���� " + mid);
		scanner.close();
	}

} 
