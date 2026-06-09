import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		int a, sum = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력해주세요 : ");
		a = s.nextInt();

		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.println(String.format("1부터 입력한 수까지의 합 : %d", sum));
	}

}
