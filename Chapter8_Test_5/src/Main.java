import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		FileInputStream srcStream = null;
		FileInputStream destStream = null;
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		
		System.out.print("첫번째 파일 이름을 입력하시오 ");
		String src = scanner.nextLine();
		
		System.out.print("두번째 파일 이름을 입력하시오 ");
		String dest = scanner.nextLine();
		
		System.out.println(src + "와 " + dest + "를 비교합니다.");
		try {
			srcStream = new FileInputStream(src);
			destStream = new FileInputStream(dest);
			if (compareFile(srcStream, destStream))
				System.out.println("파일이 같습니다.");
			else {
				System.out.println("파일이 다릅니다.");
			}
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		
		scanner.close();
	}
	
	private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
		byte[] srcBuf = new byte[1024];
		byte[] destBuf = new byte[1024];
		
		int srcCount = 0, destCount;
		
		while(true) {
			srcCount = src.read(srcBuf, 0, srcBuf.length);
			destCount = dest.read(destBuf, 0, destBuf.length);
			
			if(srcCount != destCount)
				return false;
			
			if(srcCount == -1)
				break;
			
			for (int i = 0; i < srcCount; i++) {
				if(srcBuf[i] != destBuf[i])
					return false;
			}
		}
		
		return true;
	}
}
