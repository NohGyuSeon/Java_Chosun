import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("c:\\NGS\\자료 (메모)\\독극물.txt");
		BufferedReader fr = null;
		try {
			fr = new BufferedReader(new FileReader(f));
			System.out.println(f.getPath() + "를 출력합니다.");
			while(true) {
				String line = fr.readLine();
				if(line == null)
					break;
				System.out.println(line);
			}
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
