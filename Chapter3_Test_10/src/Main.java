
public class Main {

	public static void main(String[] args) {
		
		int array [][] = new int [4][4];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j]	= 0;
			}
		}
		
		int num = 0;
		while(num < 10) {
			
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
			
			if(array[row][col] != 0) {
				continue;
			}
			else {
				array[row][col] = (int)(Math.random()*10 + 1);
				num++;
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
