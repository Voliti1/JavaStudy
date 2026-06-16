import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int kor = s.nextInt();
		int math = s.nextInt();
		int eng = s.nextInt();
		double avg = (kor + math + eng) / 3.0;
		System.out.printf("평균 = %.2f\n", avg);
		
//		if (avg >= 90)
//			System.out.println("A");
//		else if(avg >= 80)
//			System.out.println("B");
//		else if(avg >= 70)
//			System.out.println("C");
//		else if(avg >= 60)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		switch((int)avg / 10) {
//			case 10:
//			case 9:
//				System.out.println("A"); break;
//			case 8:
//				System.out.println("B"); break;
//			case 7:
//				System.out.println("C"); break;
//			case 6:
//				System.out.println("D"); break;
//			default:
//				System.out.println("F");
		
		switch ((int)avg / 10) {
	    case 10, 9 -> System.out.println("A");  // break 필요 없음!
	    case 8     -> System.out.println("B");
	    case 7     -> System.out.println("C");
	    case 6     -> System.out.println("D");
	    default    -> System.out.println("F");
	}
	}
}
