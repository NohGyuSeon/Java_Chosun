import java.io.IOException;

class note {
	
	
	
	
	
	
	
}

public class Main {

	private static final String[] voca = { "amazing,amaze, surprising, wonderful", "chat,chatter, pratter",
			"minimal,min, very small in quantity, value, or degree", "supermarket,mart, a large shop.",
			"wellbeing,happyiness, health and happiness" };

	public static void main(String[] args) {

		try {
			if (note.LoadData(voca)) {
				System.out.println("Vocabulary is loaded. (Total words : " + note.word.size() + ")");
			} else {
				System.out.println("Error : Vocabulary isn't loaded.");
				return;
			}
		} catch (IOException e) {
			System.out.println("Error : Can't load vocadata.");
			return;
		}

		note.operate();
		System.out.println("Good bye.");
	}
}
