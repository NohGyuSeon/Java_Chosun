import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println(">> ");
			String s = scanner.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			
//			StringTokenizer st = new StringTokenizer(s, " ");
//			System.out.println("어절 개수는 " + st.countTokens());

			String [] words = s.split(" ");
			System.out.println("어절 개수는 " + words.length);
		}

		scanner.close();
	}
	
}
