import java.util.Scanner;

class Player {
	private Scanner scanner; // 키보드 입력
	private String name; // 게임 참가자의 이름
	private String word; // 참가자가 말한 단어

	public Player(String name) {
		this.name = name;
		scanner = new Scanner(System.in);
	}
	
	public String getName() {return name;}
	
	public String getWordFromUser() {
		System.out.print(name + ">>");
		word = scanner.next();
		return word;
	}
	
	// lastWord와 참가자가 말한 word를 비교하여 끝말잇기가 잘되었는지 판단.
	// 성공하였으면 true 리턴
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1; // 최종 단어의 맨 마지막 문자의 인덱스
		
		// 최종 단어의 맨 마지막 문자와 참가자가 말한 단어의 첫 문자가 같은지 비교
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	
	private Scanner scanner;
	private String startWord = "아버지";
	private Player[] players;
	
	public WordGameApp() {
		scanner = new Scanner(System.in);
	}
	
	// 게임 참가자 수를 입력받고 Player []을 생성하는 메소드
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
		int nPlayers = scanner.nextInt(); 
		players = new Player[nPlayers];
		
		for(int i = 0; i < nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요>> ");
			String name = scanner.next(); 
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다...");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("시작하는 단어는 " + lastWord + "입니다");
		int next = 0;
		
		// 게임이 끝날 때까지 루프
		while(true) {
			String newWord = players[next].getWordFromUser(); // next 참가자가 단어를 말하도록 한다.
			if(!players[next].checkSuccess(lastWord)) { // next 참가자가 성공하였는지 검사.
				System.out.print(players[next].getName() + "이 졌습니다.");
				break;
			}
			next++;
			next %= players.length;
			lastWord = newWord;
		}
	}
	
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
	}
	
}
