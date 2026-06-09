import java.util.Scanner;

public class ArrayPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sin = new Scanner(System.in);
		
		System.out.println("몇 개의 성적을 입력하시겠습니까?");
		int n = sin.nextInt();
		int[] score = new int[n];
	
		int[] score2 = {90, 50, 10, 60, 70};
		
		int sum = 0;
		int max = 0, min = 100;
		for(int i = 0; i < n; i++) {
			System.out.printf("%d번째 성적을 입력해주세요\n", i + 1);
			score[i] = sin.nextInt();
			sum += score[i];
			
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) { 
				min = score[i];
			}
		}
		
		double avg = sum /(double) n;
		
		System.out.println("수학 과목 성적 통계");
		for(int i = 0; i < n; i++) {
			if(i < n-1)
				System.out.print(score[i] + ", ");
			else
				System.out.println(score[i]);
		}
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.printf("최고점 : %d\n", max);
		System.out.printf("최저점 : %d\n", min);
	}

}
