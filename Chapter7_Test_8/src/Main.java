import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> info = new HashMap<String, Integer>();

		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");

		while (true) {
			System.out.print("�̸��� ����Ʈ �Է�>>");
			String name = scanner.next();
			if (name.equals("�׸�"))
				break;
			int point = scanner.nextInt();
			
			if (info.containsKey(name)) { // Ű�� �����ϸ� ����
				int value = info.get(name);
				value += point;
				info.put(name, value);
			} // �ƴϸ� ����
			else
				info.put(name, point);
			
			Set<String> keys = info.keySet();
			Iterator<String> it = keys.iterator();
			
			while (it.hasNext()) {
				String key = it.next();
				int value = info.get(key);
				System.out.println("(" + key + ", " + value + ") ");
			}
		}
		scanner.close();
	}
}
