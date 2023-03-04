import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> student = new HashMap<String, Double>();

		System.out.println("�̷����бݰ����ý����Դϴ�.");
		for (int i = 0; i < 5; i++) {
			System.out.print("�̸��� ���� >> ");
			String name = scanner.next();
			double grade = scanner.nextDouble();
			student.put(name, grade);
		}
		System.out.print("���л� ���� ���� ���� �Է�>> ");
		double standard = scanner.nextDouble();
		
		System.out.print("���л� ���: ");
		Set<String> keys = student.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			double value = student.get(key);
			if (value >= standard)
				System.out.print(key + " ");
		}
		scanner.close();
	}
}
