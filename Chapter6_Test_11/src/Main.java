import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		System.out.println(">> ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer sb = new StringBuffer(text);

		while(true)	 {
			System.out.println("명령: ");
			String cmd = scanner.nextLine();
			String [] tokens = cmd.split("!");
			
			if(cmd.equals("그만")	) {
				System.out.println("종료합니다");
				break;
			}
			if(tokens.length != 2) {
				System.out.println("잘못된 명령입니다!");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if(index == -1) {
					System.out.println("찾을 수 없습니다!");
					
					continue;
				}

				sb.replace(index, index+tokens[0].length(), tokens[1]);
				
				System.out.println(sb.toString());
			}
		}
		
		scanner.close();
	}

}
