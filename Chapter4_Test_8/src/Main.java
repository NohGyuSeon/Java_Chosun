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
			System.out.println("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			String name = scanner.next();
			String tel = scanner.next();
			array[i].set(name, tel); 	
			array[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다.");
		System.out.println();
		
		while(true) {
			System.out.print("검색할 이름>>");
			String sName = scanner.next();
			
			for(int i = 0; i < x; i++) {
				String a = array[i].setName();	
				if(sName.equals("그만")) {
					break;
				}
				else if(sName.equals(a)) {
					System.out.print(sName + "의 번호는 "); 
					array[i].setT();
					System.out.println(" 입니다.");
				}
				else {
					k++;
					if(k==x) {
						System.out.println(sName + " 이 없습니다.");
					}
				}
			}
			k = 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("인원수>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Main PhoneBook = new Main(num);
		PhoneBook.search(num);
	}
}
