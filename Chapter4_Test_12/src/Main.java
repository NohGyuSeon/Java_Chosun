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
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	void seatchoice() {
		System.out.print("�¼� ���� S(1), A(2), B(3) >> "); 
		Scanner s = new Scanner(System.in); 
		seat = s.nextInt();
	}
 
	void setSeat(String name, int num) {
		switch (seat) {
			case 1: 
				if (sname[num - 1] == "---")
					sname[num - 1] = name; 
				else 
					System.out.println("�̹� ����� �ڸ�"); 
				break;
			case 2: 
				if (aname[num - 1] == "---") 
					aname[num - 1] = name; 
				else 
					System.out.println("�̹� ����� �ڸ�"); 
				break; 
			case 3: 
				if (bname[num - 1] == "---") 
					bname[num - 1] = name; 
				else 
					System.out.println("�̹� ����� �ڸ�"); 
				break; 
			default: 
				System.out.println("���� �޴�");
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
				System.out.println("���� �޴�"); 
				break; 
		} 
	}
	
	void reservation() {
		seatchoice();
		String name;
		int num;
		printAllseat();
		
		System.out.println("�̸� : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		System.out.println("��ȣ : ");
		num = scanner.nextInt();
		if (num > 0 && num < 11) {
			setSeat(name, num);
		}
		else 
			System.out.println("���� ��ȣ");
	}
	
	void cancel() {
		seatchoice();
		printAllseat();
		String name;
		int i = 0;
		System.out.println("�̸� : ");
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
				System.out.println("���� �޴�");
				break;
		}
		if (i == 10) {
			System.out.println("���� �̸�");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Reservesystem r = new Reservesystem();
		while(true) {
			System.out.print("����(1), ��ȸ(2), ���(3), ������(4) >> ");
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
					System.out.println("���� �޴�");
					break;
				}
			if (ch == 4) {
				break;
			}
		}
	}
}
