import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void printBig(Vector<Integer> v) {
		
		int big = v.get(0);
		for (int i = 0; i < v.size(); i++) {
			if(big < v.get(i))
				big = v.get(i);
		}
	
		System.out.println("���� ū ���� " + big);
	}

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����(-1�� �Էµ� ������)>> ");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) {
				break;
			}
			v.add(n);
		}
		
		if(v.size() == 0) {
			System.out.println("���� �ϳ��� ����");
			scanner.close();
			return;
		}
	
		printBig(v);
		scanner.close();
	}
}
