import java.util.Scanner;

class Player {
	private Scanner scanner; // Ű���� �Է�
	private String name; // ���� �������� �̸�
	private String word; // �����ڰ� ���� �ܾ�

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
	
	// lastWord�� �����ڰ� ���� word�� ���Ͽ� �����ձⰡ �ߵǾ����� �Ǵ�.
	// �����Ͽ����� true ����
	public boolean checkSuccess(String lastWord) {
		int lastIndex = lastWord.length() - 1; // ���� �ܾ��� �� ������ ������ �ε���
		
		// ���� �ܾ��� �� ������ ���ڿ� �����ڰ� ���� �ܾ��� ù ���ڰ� ������ ��
		if(lastWord.charAt(lastIndex) == word.charAt(0))
			return true;
		else
			return false;
	}
}

public class WordGameApp {
	
	private Scanner scanner;
	private String startWord = "�ƹ���";
	private Player[] players;
	
	public WordGameApp() {
		scanner = new Scanner(System.in);
	}
	
	// ���� ������ ���� �Է¹ް� Player []�� �����ϴ� �޼ҵ�
	private void createPlayers() {
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>> ");
		int nPlayers = scanner.nextInt(); 
		players = new Player[nPlayers];
		
		for(int i = 0; i < nPlayers; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>> ");
			String name = scanner.next(); 
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("�����ձ� ������ �����մϴ�...");
		createPlayers();
		String lastWord = startWord;
		
		System.out.println("�����ϴ� �ܾ�� " + lastWord + "�Դϴ�");
		int next = 0;
		
		// ������ ���� ������ ����
		while(true) {
			String newWord = players[next].getWordFromUser(); // next �����ڰ� �ܾ ���ϵ��� �Ѵ�.
			if(!players[next].checkSuccess(lastWord)) { // next �����ڰ� �����Ͽ����� �˻�.
				System.out.print(players[next].getName() + "�� �����ϴ�.");
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
