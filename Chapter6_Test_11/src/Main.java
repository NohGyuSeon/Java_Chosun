import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		System.out.println(">> ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		StringBuffer sb = new StringBuffer(text);

		while(true)	 {
			System.out.println("���: ");
			String cmd = scanner.nextLine();
			String [] tokens = cmd.split("!");
			
			if(cmd.equals("�׸�")	) {
				System.out.println("�����մϴ�");
				break;
			}
			if(tokens.length != 2) {
				System.out.println("�߸��� ����Դϴ�!");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("�߸��� ����Դϴ�!");
					
					continue;
				}
				int index = sb.indexOf(tokens[0]);
				if(index == -1) {
					System.out.println("ã�� �� �����ϴ�!");
					
					continue;
				}

				sb.replace(index, index+tokens[0].length(), tokens[1]);
				
				System.out.println(sb.toString());
			}
		}
		
		scanner.close();
	}

}
