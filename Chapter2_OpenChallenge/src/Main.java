import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.println("철수 >> ");
		String Boy = scanner.next();
		System.out.println("영희 >> ");
		String Girl = scanner.next();
		
		if(Boy.equals("가위")) {
			if(Girl.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(Girl.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(Girl.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("다시 입력하세요!");
			}
		}
		else if(Boy.equals("바위")) {
			if(Girl.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if(Girl.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(Girl.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("다시 입력하세요!");
			}
		}
		else if(Boy.equals("보")) {
			if(Girl.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else if(Girl.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(Girl.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("다시 입력하세요!");
			}
		}
		else {
			System.out.println("다시 입력하세요!");
		}
		
		scanner.close();
	}
	
}
