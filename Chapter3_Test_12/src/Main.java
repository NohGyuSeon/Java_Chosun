
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				int n = Integer.parseInt(args[i]);
				sum = sum + n;
			} catch(NumberFormatException e) {
				// ������ ��ȯ�� �� ���� ���ڴ� NumberFormatException ���ܰ� �߻��ϸ� �ջ꿡�� ����
			}
		}
		System.out.println(sum);
	}
}
