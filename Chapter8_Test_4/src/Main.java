import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("c:\\Temp\\testlol.txt");
		System.out.println("c:\\Temp\\testlol.txt 파일을 읽어 출력합니다.");
		
		BufferedReader fr = null;
		
		try {
			fr = new BufferedReader(new FileReader(f));
			int c = 1;
			while(true) {
				String line = fr.readLine();
				if(line == null)
					break;
				System.out.println(c + ": " + line);
				c++;
			}
			fr.close();
			
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}
}
