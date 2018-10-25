import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FetchDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> givenArray = new ArrayList<String>();
		ArrayList<String> listOfNamesStartingWithA = new ArrayList<String>();
		ArrayList<String> listOfNamesStartingWithG = new ArrayList<String>();
		givenArray.add("apple");
		givenArray.add("appleinc");
		givenArray.add("applemac");
		givenArray.add("google");
		
		HashMap<String, ArrayList> map = new HashMap<String, ArrayList>();
		map.clone();
		Iterator<String> itr = givenArray.iterator();
		
		while(itr.hasNext()) {
			String arrayListOb = itr.next();

			String key =arrayListOb.substring(0, 1);
			if(key.startsWith("a")) {
				listOfNamesStartingWithA.add(arrayListOb);	
				map.put(key, listOfNamesStartingWithA);	
			}
			if(key.startsWith("g")) {
				listOfNamesStartingWithG.add(arrayListOb);
				map.put(key, listOfNamesStartingWithG);
			}				
			System.out.println(key);
			System.out.println(map.get(key));
		}
		System.out.println(map.size());
		//System.out.println(map.get("g"));
		//System.out.println(map.get("a"));
		/*for(Map.Entry<String,ArrayList> entry: map.entrySet())
		{
			System.out.println(map.get("a"));
		}*/
	}
		
	}


