import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class ListPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> num = new ArrayList<>();
//		ArrayList<String> str = new ArrayList<>();
//		num.add(10);
//		num.add(20);
//		num.add(0, 100);
//		num.remove(0);
//		num.remove(Integer.valueOf(20));
//		num.set(0, 50);
//		num.clear();
//					
//		str.add("java");
//		str.add("python");
//		
//		for(int n : num)
//			System.out.print(n + " ");
//		
//		System.out.println();
//		
//		for(String s : str)
//			System.out.print(s + " ");
//		
//		System.out.println();
//		
//		System.out.println(num.size());
//		System.out.println(str.size());
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(70);
		list.add(85);
		list.add(90);
		list.add(60);
		System.out.println("초기 리스트 : " + list);
		
		Scanner sin = new Scanner(System.in);
		
		while(true) {
			System.out.println("시그널 번호를 입력해 주세요");
			String signal = sin.next();
			if(signal.equals("i")) {
				System.out.print("넣으실 위치를 입력해주세요 ");
				int pos = sin.nextInt();
				System.out.print("넣으실 값을 입력해주세요 ");
				int val = sin.nextInt();
				if(!list.contains(val)) {
					list.add(pos, val);
				}
				
				System.out.println("삽입 후 : " + list);
			}
			else if(signal.equals("d")) {
				System.out.println("삭제하실 값을 입력해주세요");
				int del = sin.nextInt();
				if(list.contains(del)) {
					list.remove(del);
					System.out.println("삭제 후 : "+ list);
				}					
				else
					System.out.println("삭제하시려는 값이 리스트에 없습니다");
			}
			else if(signal.equals("s")) {
				System.out.println("검색하실 값을 입력해주세요");
				int s = sin.nextInt();
				int a = list.indexOf(s);
				
				if(a == -1)
					System.out.println("찾으시는 값이 리스트에 없습니다");	
				else
					System.out.printf("찾으시는 값은 %d번 위치에 있습니다", a);
				System.out.println();
			}
			else if(signal.equals("m")) {
				System.out.println("수정하실 위치를 입력해주세요");
				int pos = sin.nextInt();
				System.out.println("수정 값을 입력해주세요");
				int val = sin.nextInt();
				if(pos < list.size()){
					list.set(pos, val);
					System.out.println("수정 후 : " + list);
				}
				else
					System.out.println("해당 위치에 값이 없습니다");
			}
			else if(signal.equals("id")) {
				System.out.println("값을 입력해주세요");
				int val = sin.nextInt();
				int a = list.indexOf(val);
				
				if(list.contains(val)) {
					list.remove(a);
				}
				else {
					list.add(val);
				}
				
				System.out.println("작업 후 : " + list);
			}
			else if(signal.equals("e")){
				System.out.println("종료되었습니다");
				break;
			}
			
			list.sort(Comparator.naturalOrder());
			list.sort(Comparator.reverseOrder());
		}
	}
}
