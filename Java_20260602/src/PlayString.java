
public class PlayString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append(" ");
		sb.append("Jump to Java!");
		sb.insert(0, "Good");
		sb.delete(5, 7);
		String s = sb.toString();
		System.out.println(sb);
	}

}
