import java.util.Scanner;
import java.util.Random;

public class UpNDown {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int x = r.nextInt(100) + 1;
		
		int answer, count = 0;
		
		System.out.println("숫자맞추기 게임");
		while(true) {
			System.out.println("숫자를 입력해주세요");
			answer = s.nextInt();
			count += 1;
			if(x == answer) {
				System.out.println("정답입니다");
				System.out.println(count + "번 입력하셨습니다");
				break;
			}
			else if(x < answer)
				System.out.println("숫자가 더 작아야 합니다");
			else
				System.out.println("숫자가 더 커야 합니다");
			
			
		}
	}

}
