import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "���", "�Ʊ�", "��", "�̷�", "���" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static void kor2Eng() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner scanner = new Scanner(System.in);
		int k = 0;
		while (true) {
			System.out.println("�ѱ� �ܾ�?");
			String s = scanner.next();
			for (int i = 0; i < kor.length; i++) {
				if(s.equals(kor[i])) {
					k = i;
					break;
			 	}
				else if(s.equals("�׸�")){
					k = -1;
					break;
				}
				else {
					k = -2;
				}
			}
			if(k == -2) {
				System.out.println(s + "��(��)" + "���� ������ �����ϴ�.");
			}
			else if(k == -1) {
				break;
			}
			else {
				System.out.println(kor[k] + "��(��)" + eng[k]);
			}			
		}
	}
}

public class Main {

	public static void main(String[] args) {
	
		Dictionary run = new Dictionary();
	
		run.kor2Eng();
	}

}
