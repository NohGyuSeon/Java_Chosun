/*
public class Main {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while (i < 100) {
			sum = sum + i;
			i += 2;
		}
		System.out.println(sum);
	}
}
*/

/*
public class Main {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 100; i+=2) {
			sum = sum + i;
		}
		
		System.out.println(sum);
	}
}
*/

public class Main {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		do {
			sum = sum + i;
			i += 2;
		} while(i < 100);
		
		System.out.println(sum);
	}
}

