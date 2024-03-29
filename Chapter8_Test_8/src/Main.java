import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("c:\\");
		File [] files = file.listFiles();
		
		long bigsize = 0;
		File bigFile = null;
		for (int i = 0; i < files.length; i++) {
			File f = files[i];
			if(!f.isFile())
				continue;
			
			long size = f.length();
			if(bigsize < size) {
				bigsize = size;
				bigFile = f;
			}
		}

		if(bigFile == null) 
			System.out.println("파일은 없습니다");
		else
			System.out.println("가장 큰 파일은 " + bigFile.getPath() + " " + bigsize + "바이트");
	}

}
