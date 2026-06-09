import java.util.HashMap;
import java.util.TreeMap;

public class MapPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();
		map.put("사과", "apple");
		map.put("야구", "baseball");
		map.put("당근", "carrot");
		map.put("문", "door");
		map.put("지구", "earth");
		map.put("얼굴", "face");
		map.put("녹색", "green");
		map.put("집", "home");
		map.remove("사과");
		
		TreeMap<String, String> sortedMap = new TreeMap<>(map);
		System.out.println(sortedMap);
		
		
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		System.out.println(map);
//		
//		System.out.println(map.get(""));

	}
}
