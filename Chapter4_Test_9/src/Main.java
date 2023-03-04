class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {
	
		int len = a.length + b.length;
		int	[] concate = new int [len];
		int position = 0;
		for (int object : a) {
			concate[position] = object;
			position++;
		}
		for (int object : b) {
			concate[position] = object;
			position++;
		}
		
		return concate;
	}
	
	public static void print(int[] a) { 	
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
}

public class Main {

	public static void main(String[] args) {
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		
	}
}
