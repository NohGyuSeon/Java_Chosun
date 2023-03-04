import java.util.Scanner;

class Day {
	private String work;
	
	public Day() {
		// 아래의 생성자로 인하여 기본 생성자 자동 생성되지 않음
		// 배열 객체 생성을 위한 기본 생성자 작성
	}
	
	public Day(String work) {
		this.work = work;
	}
	
	public void set(String work) {
		this.work = work;
	}
	
	public String get() {
		return work;
	}
	
	public void show() {   
		if (work == null)    
			System.out.println("없습니다.");
		else 
			System.out.println(work + "입니다."); 
		System.out.println(); 
	}
	
	public String show2() {      
		if (work == null)    
			return "없습니다."; 
		else
			return work + "입니다."; 
	}
}

public class Main {
	private int x;
	Day [] day = null;
	
	Scanner scanner = new Scanner(System.in);
	
	public Main(int x) {
		this.x = x;
		day = new Day[x]; 
		for(int i = 0; i < day.length; i++) {
			day[i] = new Day();
		}
	}
	
	public void input() {
		System.out.print("날짜(1~30)?");
		int i = scanner.nextInt();
		
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		day[i].set(work);       // 이 라인이 없다면 아래 라인은 필요해짐 -> 객체 생성은 아님
		day[i] = new Day(work); // 사실상 필요없는 라인 -> 이미 Main에서 모든 배열 객체를 생성함
								// input()에서 입력받은 할일에 대해서만 객체 생성
		System.out.println();
	}
	
	public void view() {
	
		System.out.print("날짜(1~30)?");
		int date = scanner.nextInt();
		
		System.out.print(date + "일의 할 일은 ");
		day[date].show();
		// System.out.print(date + "일의 할 일은 " + day[date].show2()); // 이 라인으로도 구현 가능 
		System.out.println();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		while(true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
			int select = scanner.nextInt();
			
			if(select == 1) {
				input();
			}
			else if(select == 2) {
				view();
			}
			else if(select == 3) {
				finish();
				break;
			}
			else {
				System.out.println("1, 2, 3 중에 입력하세요.");
			}
		}
	}
		
	public static void main(String[] args) {
		Main april = new Main(30);
		
		System.out.println("이번주 스케쥴 관리 프로그램");
		
		april.run();
	}
	
}
