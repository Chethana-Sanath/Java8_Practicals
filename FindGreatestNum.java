
public class FindGreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//returnGreater(10, 20);
		int a =10;
		int b=20;
		if(a / b)
			return "a is greater than b";
	}
	
	static String returnGreater(int a,int b) {
		String statement = "";
		if(a/b>1)
			statement = "a is greater than b";
		else if(a/b=1)
			statement = "a and b are equal";
		return statement;
	}

}
