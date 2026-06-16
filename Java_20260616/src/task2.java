import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		
		while(true) {
			count++;
			if(n < 10)
				break;
			n = n / 10;	
		}
		
		System.out.println(count + "자리 수 숫자 입니다.");
	}

}
