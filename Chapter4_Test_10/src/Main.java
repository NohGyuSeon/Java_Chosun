import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static void kor2Eng() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
		int k = 0;
		while (true) {
			System.out.println("한글 단어?");
			String s = scanner.next();
			for (int i = 0; i < kor.length; i++) {
				if(s.equals(kor[i])) {
					k = i;
					break;
			 	}
				else if(s.equals("그만")){
					k = -1;
					break;
				}
				else {
					k = -2;
				}
			}
			if(k == -2) {
				System.out.println(s + "은(는)" + "저의 사전에 없습니다.");
			}
			else if(k == -1) {
				break;
			}
			else {
				System.out.println(kor[k] + "은(는)" + eng[k]);
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
