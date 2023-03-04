import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Random r = new Random();
		int k = r.nextInt(100);
		int low = 0, high = 99, i = 0, n;
		String str;
		System.out.print("수를 결정하였습니다. 맞추어 보세요 ");
		System.out.println("0-99");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(low + "-" + high);
			System.out.print(i + ">>");
				try {
					n = scanner.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("정수만 입력하셔야 합니다! ");
					scanner.nextLine();
					continue;
				}
				
				if(n > high || n < low) {
					System.out.println("범위를 벗어났습니다!");
					System.out.println(k);	
				}
				else {
					if(n == k) {
						System.out.println("맞았습니다.");
						System.out.println("다시 하시겠습니까 (y/n)>> ");
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
						System.out.println("더 높게 ");
						low = n;
						i++;
					}
					else {
						System.out.println("더 낮게 ");
						high = n;
						i++;
					}
				}			
			}	
		
		scanner.close();
	}

}
