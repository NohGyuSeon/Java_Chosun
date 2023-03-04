import java.util.Scanner;

class Phone { 
	private String name;
	private String tel;
	

	public Phone() {
		this.name = name;
		this.tel = tel;
	}
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public void setN() {
		System.out.println(name);
	}
	
	public void setT() {
		System.out.println(tel);
	}
	
	public String setName() {
		return name;
	}
	
	public void set(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
}                                 

public class Main {
	private int x;
	Phone [] array;
	Scanner scanner = new Scanner(System.in);
	
	public Main(int x) {
		this.x = x;
		array = new Phone[x];
		for(int i = 0; i < array.length; i++) {
			array[i] = new Phone();
		}
	}
	
	public void search(int x) {
		int k = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.println("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			String name = scanner.next();
			String tel = scanner.next();
			array[i].set(name, tel); 	
			array[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�.");
		System.out.println();
		
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String sName = scanner.next();
			
			for(int i = 0; i < x; i++) {
				String a = array[i].setName();	
				if(sName.equals("�׸�")) {
					break;
				}
				else if(sName.equals(a)) {
					System.out.print(sName + "�� ��ȣ�� "); 
					array[i].setT();
					System.out.println(" �Դϴ�.");
				}
				else {
					k++;
					if(k==x) {
						System.out.println(sName + " �� �����ϴ�.");
					}
				}
			}
			k = 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("�ο���>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Main PhoneBook = new Main(num);
		PhoneBook.search(num);
	}
}
