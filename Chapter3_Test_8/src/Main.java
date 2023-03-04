import java.util.Scanner;

public class Main {
	
	public static boolean exists(int a[], int from, int r) {
		for(int j = 0; j < from; j++) {
			if(a[j] == r) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.print("정수 몇개? ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n <= 0 || n > 100) {
			System.out.println("1~100사이로 입력하세요!");
			scanner.close();
			return ;
		}
		int array [] = new int[n];
		
		for(int i = 0; i < array.length; i++) {
			int ran = (int)(Math.random()*100 + 1);
			if(exists(array, i, ran)) {
				i--;
				continue;
			}
			else {
				array[i] = ran;
			}
			System.out.print(array[i] + " ");
			if((i+1) % 10 == 0 && i > 0) {
				System.out.println();
			}
		}
		scanner.close();
	}
	
}
