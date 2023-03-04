
public class Main {

	public static void main(String[] args) {
		
		int array[][] = new int [4][4];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int ran = (int)(Math.random()*10 + 1);
				array[i][j] = ran;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
