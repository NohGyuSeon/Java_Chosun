import java.util.Scanner;
import java.lang.NegativeArraySizeException;
import java.util.InputMismatchException;

class Ch3 {
	public static void printArray(double arr[][]) {
		System.out.println("The number of rows in arr array: " + arr.length);
		for(int i = 0; i < arr.length; ++i) {
			System.out.print("arr[" + i + "] ");
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public static double[][] run1(Scanner s) {
		double array[][];
		System.out.print("Enter the number of rows of real non-square array to create:");
		array = new double[s.nextInt()][];
		for (int i = 0; i < array.length; ++i) {
			array[i] = new double[i+1];
			System.out.print("Enter " + (i+1) + " numbers in a row to store in row " + (i+1) + ": ");
			for(int j = 0; j < (i+1); ++j) {
				array[i][j] = s.nextDouble();
			}
		}
		
		return array;
	}
	
	public static double[][] run2(Scanner s) {
		double array[][];
		while(true) {
			System.out.print("Enter the number of rows of real non-square array to create:");
			try {
				array = new double[s.nextInt()][];
				break;
			}
			catch (NegativeArraySizeException e) {
				System.out.println("You must enter a POSITIVE  integer. Try again.");
			}
			catch (InputMismatchException e) {
				System.out.println("You must enter an integer. Try again.");
				s.next();
			}
		}
		for (int i = 0; i < array.length; ++i) {
			array[i] = new double[i+1];
			while(true)	{
				System.out.print("Enter " + (i+1) + " numbers in a row to store in row " + (i+1) + ": ");
				try {
					for(int j = 0; j < (i+1); ++j)
						array[i][j] = s.nextDouble();	
					break;
				}
				catch (InputMismatchException e) {
					System.out.println("You must enter an INTEGER or DOUBLE value. Try again.");
					s.nextLine();
				}	
			}
		}
		return array;
	}
}

public class Main { // 제출 시 Main으로 변경

	public static void main(String[] args) {
        double array[][] = { {0}, {1,2}, {3,4,5} };
        Ch3.printArray(array);
        System.out.println();
        
        Scanner scanner = new Scanner(System.in); // 변수 생성 및 초기화; // 필요한 파일 import시킬 것
        
        double dArr1[][] = Ch3.run1(scanner);
        Ch3.printArray(dArr1);
        System.out.println();
        
        double dArr2[][] = Ch3.run2(scanner);
        Ch3.printArray(dArr2);
        System.out.println();

        scanner.close(); // 닫기;
        System.out.println("Done."); // 기존과 동일
        
	}
}
