import java.util.Scanner;
import java.util.StringTokenizer;

class TextProcess {	

	private String input;
	
	public TextProcess(String input) { 
		this.input = input;
	}  // ��ü ���� ��, �Է¹��� �ؽ�Ʈ�� ������� ������ �Լ� ����

	public int getTextLength(String input) { 
		
		return input.length();
	}  // �Է¹��� �ؽ�Ʈ�� ��ü ���̸� ������ ��ȯ
	
	public int getWordCount(String input) { 
		
		StringTokenizer Word = new StringTokenizer(input, " ");
		
		int count;
		count = Word.countTokens();

		return count;
	}  // �Է¹��� �ؽ�Ʈ�� �ܾ� ���� ������ ��ȯ
	
	public int getAlphabetCount(String input) { 
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				count++;
			}
		}
		
		return count;
	}  // �Է¹��� �ؽ�Ʈ�� ����(A~Z) ���� ������ ��ȯ
	
	public int getNumCount(String input) {

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= '0' && ch <= '9') {
				count++;
			}
		}

		return count;
	}  // �Է¹��� �ؽ�Ʈ�� ����(0~9) ���� ������ ��ȯ

	public int getSpeChrCount(String input) {
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '!' || ch == '~' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || 
					ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+' || ch == '=' || 
					ch == ',' || ch == '.' || ch == '?' || ch == '"' || ch == '\'' || ch == ':' || ch == ';' || 
					ch == '|' || ch == '`' || ch == '_') {
				count++;
			}
		}
		
		return count;
	}  // �Է¹��� �ؽ�Ʈ�� Ư����ȣ ���� ������ ��ȯ

	public boolean checkText() {
		String array[] = input.split("/");   // ����� array[0]
		String Textarray[] = new String[1];
		Textarray[0] = array[0].trim(); 
		Textarray[0] = Textarray[0].toUpperCase();
		
		array[0] = array[0].trim();
		array[1] = array[1].trim();
		array[1] = array[1].toUpperCase();
		
		if(Textarray[0].contains(array[1])) {
			return true;
		}
		else {
			return false;
		}
	} //�Է¹��� �ؽ�Ʈ���� ã���� �ϴ� Ű���尡 �ִ��� ���θ� ��ȯ
	
	public String check(String input) {
		 if(checkText()) {
			 return "Thers is the keyword in the input text.";
		 }
		 else {
			 return "Thers is no keyword in the input text.";
		 }
	}
	
	public String toString() { 
		String array[] = input.split("/");   // ����� array[0]
		String Textarray[] = new String[1];
		Textarray[0] = array[0].trim(); 
		Textarray[0] = Textarray[0].toUpperCase();
		
		array[0] = array[0].trim();
		array[1] = array[1].trim();
		array[1] = array[1].toUpperCase();

		return "Input Msg: " + input + "\n" + "Text: " + Textarray[0] + "\n" + "Text Length: " + getTextLength(array[0]) + "\n" + "Word Count: " + getWordCount(array[0]) + "\n" + "Alphabet Count: " + 
			getAlphabetCount(array[0]) + "\n" + "Number Count: " + getNumCount(array[0]) + "\n" + "Special Character Count: " + getSpeChrCount(array[0]) + "\n" + check(array[0]) + "\n"; 
	} // TextProcess ��ü�� ���(println)�Ͽ��� ��, �������� �䱸�ϴ� ��Ĵ�� ����ϵ��� toString() �Լ��� overriding
}

public class Main {  // ���� Ŭ����
		
	public static void main(String[] args){  // ���� �Լ�
		Scanner scanner = new Scanner(System.in);  // �ؽ�Ʈ�� �Է¹ޱ� ���� Scanner ��ü ����
	
		while(true) { 
			
			String n = scanner.nextLine();
			
			if(n.equals("exit")) {
				System.out.println("Input Msg: exit");
				break;
			}
			else {
					TextProcess str = new TextProcess(n);
					// �ؽ�Ʈ�� �������� �Է¹ޱ� ���� while loop
					// �������� �䱸�ϴ� ���·� �Է� ���� �� �Է¹��� �ؽ�Ʈ ���
					// �Է¹��� �ؽ�Ʈ�� ���ʿ��� ���� ���� ����
					// exit�� �ԷµǾ��� ��, ���� ���� ����
					// TextProcess ��ü ����
					System.out.println(str); // TextProcess ��ü ���� ���
			} 
		}
		
		scanner.close();
		System.out.println("Good bye!");
		// Scanner ��ü ����
		// ����޼��� ���
	}
}
