import java.util.Arrays;
import java.util.ArrayList;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "123";
		int n = Integer.parseInt(num);
		int s = n + 1;
		System.out.println(s);
		String str = n+"";
		System.out.println(str);
		
		int n1 = 12345;
		String num1 = String.valueOf(n1);
		String num2 = Integer.toString(n1);

		String str1 = "123,234";
		double d = Double.parseDouble(str1);
		double dd = d + 1;
		
		double d1 = n1;
		
		final int N = 123;
		final ArrayList<String> list = new ArrayList<>(Arrays.asList("aa", "bb"));
		
		list.add("cc");
		System.out.println(list);
	}

}

