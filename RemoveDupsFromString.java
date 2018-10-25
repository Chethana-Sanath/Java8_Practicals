import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDupsFromString {

	static String input = "abcddcejkllkmbc";
	List<Character> list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RemoveDupsFromString().RemoveDups();
		
		
	}
	
	public RemoveDupsFromString() {
		list = new ArrayList<Character>();
	}
	
	void RemoveDups() {
		char[] charArry = input.toCharArray();
		for(int i=0;i<charArry.length;i++) {
			if(!list.contains(charArry[i]))
				list.add(charArry[i]);
		}
		
		System.out.println("After removing dups the input string is "+list.toString());
	}

}
