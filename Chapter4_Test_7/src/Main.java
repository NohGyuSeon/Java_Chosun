import java.util.Scanner;

class Day {
	private String work;
	
	public Day() {
		// �Ʒ��� �����ڷ� ���Ͽ� �⺻ ������ �ڵ� �������� ����
		// �迭 ��ü ������ ���� �⺻ ������ �ۼ�
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
			System.out.println("�����ϴ�.");
		else 
			System.out.println(work + "�Դϴ�."); 
		System.out.println(); 
	}
	
	public String show2() {      
		if (work == null)    
			return "�����ϴ�."; 
		else
			return work + "�Դϴ�."; 
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
		System.out.print("��¥(1~30)?");
		int i = scanner.nextInt();
		
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		day[i].set(work);       // �� ������ ���ٸ� �Ʒ� ������ �ʿ����� -> ��ü ������ �ƴ�
		day[i] = new Day(work); // ��ǻ� �ʿ���� ���� -> �̹� Main���� ��� �迭 ��ü�� ������
								// input()���� �Է¹��� ���Ͽ� ���ؼ��� ��ü ����
		System.out.println();
	}
	
	public void view() {
	
		System.out.print("��¥(1~30)?");
		int date = scanner.nextInt();
		
		System.out.print(date + "���� �� ���� ");
		day[date].show();
		// System.out.print(date + "���� �� ���� " + day[date].show2()); // �� �������ε� ���� ���� 
		System.out.println();
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		while(true) {
			System.out.print("����(�Է�:1, ����:2, ������:3) >>");
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
				System.out.println("1, 2, 3 �߿� �Է��ϼ���.");
			}
		}
	}
		
	public static void main(String[] args) {
		Main april = new Main(30);
		
		System.out.println("�̹��� ������ ���� ���α׷�");
		
		april.run();
	}
	
}
