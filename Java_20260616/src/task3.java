import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 어떠한 문자열을 입력받았을때 공백을 제외한 단어수와 글자수를 출력하는 코드
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int charCnt = 0;
		int wordCnt = 1;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				charCnt++;
			}
			else {
				wordCnt++;
			}
		}
		
		System.out.println("글자수 : " + charCnt);
		System.out.println("단어수 : " + wordCnt);
		
	}

}
