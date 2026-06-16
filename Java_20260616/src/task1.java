import java.util.Scanner;
import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9 이다. 이들의 총 합은 23이다.
		// 그렇다면 1000 미만의 자연수에서 3과 5의 배수의 총합을 구하라.
		// 입력 받는 값은 1부터 999까지(1000 미만의 자연수)이다.
		// 출력하는 값은 3의 배수와 5의 배수의 총합이다.
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int n = s.nextInt();
		int sum = 0;
		for(int i = 1; i < n; i++)
		{
			if(i % 3 == 0 || i % 5 == 0) {
//				if(i != n-1)
//					System.out.print(i + " + ");
//				else
//					System.out.print(i);
				list.add(i);
				sum += i;
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(i != list.size() - 1)
				System.out.print(list.get(i) + " + ");
			else
				System.out.print(list.get(i) + " = ");
		}
		
		System.out.print(" = " + sum);	
	}
}