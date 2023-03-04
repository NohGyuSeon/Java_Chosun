import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Random r = new Random();
		int k = r.nextInt(100);
		int low = 0, high = 99, i = 0, n;
		String str;
		System.out.print("���� �����Ͽ����ϴ�. ���߾� ������ ");
		System.out.println("0-99");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(low + "-" + high);
			System.out.print(i + ">>");
				try {
					n = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("������ �Է��ϼž� �մϴ�! ");
					scanner.nextLine();
					continue;
				}
				
				if(n > high || n < low) {
					System.out.println("������ ������ϴ�!");
					System.out.println(k);	
				}
				else {
					if(n == k) {
						System.out.println("�¾ҽ��ϴ�.");
						System.out.println("�ٽ� �Ͻðڽ��ϱ� (y/n)>> ");
						str = scanner.next();
						if(str.equals("y")) {
							r = new Random();
							k = r.nextInt(100);
							low = 0;
							high = 99;
							i = 0;
							continue;
						}
						else if(str.equals("n")) {
							break;
						}
						
					}
					else if(n < k) {
						System.out.println("�� ���� ");
						low = n;
						i++;
					}
					else {
						System.out.println("�� ���� ");
						high = n;
						i++;
					}
				}			
			}	
		
		scanner.close();
	}

}
