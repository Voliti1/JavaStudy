import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr1 = new int[10];
		
		for(int i : arr1)
			System.out.print(i + "\t");
		
		System.out.println();
		
		for(int i = 0; i < arr1.length; i++)
			arr1[i] = s.nextInt();		
		
		for(int i : arr1)
			System.out.print(i + "\t");
		
		int sum = 0;
		double avg;
		
		for(int i : arr1)
			sum += i;
		
		avg = (double)sum / arr1.length;
		
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
