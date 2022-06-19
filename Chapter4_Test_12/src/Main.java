import java.util.Scanner;

class Reservesystem {
	String[] sname;
	String[] aname;
	String[] bname;
	int seat;
	
	Reservesystem() {
		sname = new String[10];
		aname = new String[10];
		bname = new String[10];
		for (int i = 0; i < sname.length; i++) {
			sname[i] = "---";
			aname[i] = "---";
			bname[i] = "---";
		}
	}
	
	void printSname() {
		System.out.print("S>>");
		for (int i = 0; i < sname.length; i++) {
			System.out.print(" " + sname[i]);
		}
		System.out.println();
	}
	
	void printAname() {
		System.out.print("A>>");
		for (int i = 0; i < aname.length; i++) {
			System.out.print(" " + aname[i]);
		}
		System.out.println();
	}
	
	
	void printBname() {
		System.out.print("B>>");
		for (int i = 0; i < bname.length; i++) {
			System.out.print(" " + bname[i]);
		}
		System.out.println();
	}
	
	void inquiry() {
		printSname();
		printAname();
		printBname();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	void seatchoice() {
		System.out.print("좌석 구분 S(1), A(2), B(3) >> "); 
		Scanner s = new Scanner(System.in); 
		seat = s.nextInt();
	}
 
	void setSeat(String name, int num) {
		switch (seat) {
			case 1: 
				if (sname[num - 1] == "---")
					sname[num - 1] = name; 
				else 
					System.out.println("이미 예약된 자리"); 
				break;
			case 2: 
				if (aname[num - 1] == "---") 
					aname[num - 1] = name; 
				else 
					System.out.println("이미 예약된 자리"); 
				break; 
			case 3: 
				if (bname[num - 1] == "---") 
					bname[num - 1] = name; 
				else 
					System.out.println("이미 예약된 자리"); 
				break; 
			default: 
				System.out.println("없는 메뉴");
				break;
		}
	}
	
	void printAllseat() { 
		switch (seat) { 
			case 1: 
				printSname(); 
				break; 
			case 2: 
				printAname(); 
				break; 
			case 3: 
				printBname(); 
				break; 
			default: 
				System.out.println("없는 메뉴"); 
				break; 
		} 
	}
	
	void reservation() {
		seatchoice();
		String name;
		int num;
		printAllseat();
		
		System.out.println("이름 : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		System.out.println("번호 : ");
		num = scanner.nextInt();
		if (num > 0 && num < 11) {
			setSeat(name, num);
		}
		else 
			System.out.println("없는 번호");
	}
	
	void cancel() {
		seatchoice();
		printAllseat();
		String name;
		int i = 0;
		System.out.println("이름 : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		switch (seat) {
			case 1:
				for(; i < sname.length; i++) {
					if(sname[i].equals(name)) {
						sname[i] = "---";
						break;
					}
				}
				break;
			case 2:
				for(; i < aname.length; i++) {
					if(aname[i].equals(name)) {
						aname[i] = "---";
						break;
					}
				}
				break;
			case 3:
				for(; i < bname.length; i++) {
					if(bname[i].equals(name)) {
						bname[i] = "---";
						break;
					}
				}
				break;
			default:
				System.out.println("없는 메뉴");
				break;
		}
		if (i == 10) {
			System.out.println("없는 이름");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Reservesystem r = new Reservesystem();
		while(true) {
			System.out.print("예약(1), 조회(2), 취소(3), 끝내기(4) >> ");
			Scanner sd = new Scanner(System.in); 
			
			int ch = sd.nextInt(); 
			switch (ch) { 
				case 1: 
					r.reservation(); 
					break;
				case 2: 
					r.inquiry(); 
					break;
				case 3: 
					r.cancel(); 
					break;
				case 4:
					break;
				default:
					System.out.println("없는 메뉴");
					break;
				}
			if (ch == 4) {
				break;
			}
		}
	}
}
