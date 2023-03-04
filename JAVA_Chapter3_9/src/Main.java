
public class Main {
	enum Week { Mon, Tue, Wed, Thu, Fri, Sat, Sun }
	
	public static void main(String[] args) {
		int [] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String names[] = { "Apple", "Pear", "Banana", "Cherry", "Strawberry", "Grape" } ;
		
		int sum = 0;
		for (int k : n) {
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("sum to" + sum);
		
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
		
		for (Week day : Week.values())
			System.out.print(day + "Day ");
		System.out.println();
	}

}
