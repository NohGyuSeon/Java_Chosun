
public class Main {

	public static void main(String[] args) {
		
		System.out.print("·£´ıÇÑ Á¤¼öµé : ");
		int [] array = new int [10];
		int sum = 0;
		for(int j = 0; j < array.length; j++) {
			int i = (int)(Math.random()*10 + 1);
			array[j] = i;
			System.out.print(array[j] + " ");
			sum += array[j];
		}
		
		double avg;
		avg = (double)sum / 10;
		System.out.print("\nÆò±ÕÀº " + avg);
		
	}
}
