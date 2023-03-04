import java.util.Scanner;
import java.util.StringTokenizer;

class TextProcess {	

	private String input;
	
	public TextProcess(String input) { 
		this.input = input;
	}  // 객체 생성 시, 입력받은 텍스트를 기반으로 생성자 함수 수행

	public int getTextLength(String input) { 
		
		return input.length();
	}  // 입력받은 텍스트의 전체 길이를 정수로 반환
	
	public int getWordCount(String input) { 
		
		StringTokenizer Word = new StringTokenizer(input, " ");
		
		int count;
		count = Word.countTokens();

		return count;
	}  // 입력받은 텍스트의 단어 수를 정수로 반환
	
	public int getAlphabetCount(String input) { 
		
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				count++;
			}
		}
		
		return count;
	}  // 입력받은 텍스트의 문자(A~Z) 수를 정수로 반환
	
	public int getNumCount(String input) {

		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch >= '0' && ch <= '9') {
				count++;
			}
		}

		return count;
	}  // 입력받은 텍스트의 숫자(0~9) 수를 정수로 반환

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
	}  // 입력받은 텍스트의 특수기호 수를 정수로 반환

	public boolean checkText() {
		String array[] = input.split("/");   // 대상은 array[0]
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
	} //입력받은 텍스트에서 찾고자 하는 키워드가 있는지 여부를 반환
	
	public String check(String input) {
		 if(checkText()) {
			 return "Thers is the keyword in the input text.";
		 }
		 else {
			 return "Thers is no keyword in the input text.";
		 }
	}
	
	public String toString() { 
		String array[] = input.split("/");   // 대상은 array[0]
		String Textarray[] = new String[1];
		Textarray[0] = array[0].trim(); 
		Textarray[0] = Textarray[0].toUpperCase();
		
		array[0] = array[0].trim();
		array[1] = array[1].trim();
		array[1] = array[1].toUpperCase();

		return "Input Msg: " + input + "\n" + "Text: " + Textarray[0] + "\n" + "Text Length: " + getTextLength(array[0]) + "\n" + "Word Count: " + getWordCount(array[0]) + "\n" + "Alphabet Count: " + 
			getAlphabetCount(array[0]) + "\n" + "Number Count: " + getNumCount(array[0]) + "\n" + "Special Character Count: " + getSpeChrCount(array[0]) + "\n" + check(array[0]) + "\n"; 
	} // TextProcess 객체를 출력(println)하였을 때, 문제에서 요구하는 양식대로 출력하도록 toString() 함수를 overriding
}

public class Main {  // 메인 클래스
		
	public static void main(String[] args){  // 메인 함수
		Scanner scanner = new Scanner(System.in);  // 텍스트를 입력받기 위한 Scanner 객체 생성
	
		while(true) { 
			
			String n = scanner.nextLine();
			
			if(n.equals("exit")) {
				System.out.println("Input Msg: exit");
				break;
			}
			else {
					TextProcess str = new TextProcess(n);
					// 텍스트를 연속으로 입력받기 위한 while loop
					// 문제에서 요구하는 형태로 입력 문구 및 입력받은 텍스트 출력
					// 입력받은 텍스트의 불필요한 양쪽 공백 제거
					// exit가 입력되었을 때, 무한 루프 종료
					// TextProcess 객체 생성
					System.out.println(str); // TextProcess 객체 정보 출력
			} 
		}
		
		scanner.close();
		System.out.println("Good bye!");
		// Scanner 객체 종료
		// 종료메세지 출력
	}
}
