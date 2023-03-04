import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str[] = { "가위", "바위", "보" };
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			int n = 0;
			System.out.print("가위 바위 보!>> ");
			
			String s = scanner.next();
			if(s.equals("가위")) {
				n = 0;
			}
			else if(s.equals("바위")) { 
				n = 1;
			}
			else if(s.equals("보")) {
				n = 2;
			}
			else if(s.equals("그만")) {
				n = 3;
			}
			else {
				n = 4;
			}	
			
			int ran = (int)(Math.random()*3);
			
			if(n == 0) {
				if(ran == 0) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 비겼습니다.");
				}
				else if(ran == 1) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 컴퓨터가 이겼습니다.");
				}
				else if(ran == 2) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 사용자가 이겼습니다.");
				}
			}
			else if(n == 1) {
				if(ran == 0) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 사용자가 이겼습니다.");
				}
				else if(ran == 1) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 비겼습니다.");
				}
				else if(ran == 2) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 컴퓨터가 이겼습니다.");
				}
			}
			else if(n == 2) {
				if(ran == 0) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 컴퓨터가 이겼습니다.");
				}
				else if(ran == 1) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 사용자가 이겼습니다.");
				}
				else if(ran == 2) {
					System.out.println("사용자 = " + s + " , 컴퓨터 = " + str[ran] + ", 비겼습니다.");
				}
			}
			else if(n == 3) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else {
				System.out.println("다시 입력하세요.");
			}	
		}
		scanner.close();
	}
	
}
