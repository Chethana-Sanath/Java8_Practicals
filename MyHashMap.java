		import java.util.HashMap;
import java.util.Map;


public class MyHashMap {
	
	public static void Main(String[] ar) {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("bbb", 1);
		map.put("ccc", 1);
		map.put("ddd", 1);
		map.put(null, 5);
	}
}
