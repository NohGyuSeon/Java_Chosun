import java.util.StringTokenizer;

public class StringTokenizerEx {
	
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/³ë±Ô¼±/ÄáÁã", "/");
		
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}