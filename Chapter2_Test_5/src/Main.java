import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("���� 3���� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2, num3;
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		if((num1+num2) > num3 || (num1+num3) > num2 || (num2+num3) > num1)
		{
			System.out.println("�ﰢ���� �˴ϴ�");
		}
		else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
		
		scanner.close();
	}
}
