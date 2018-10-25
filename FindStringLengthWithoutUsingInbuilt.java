import java.util.Scanner;

/*Java pgm to find the length of a given string without
 * using string built in functions.//chethana
 * Approach is to convert the string in to a char[] and use a counter
 * to count no. of chars in the array
 */
public class FindStringLengthWithoutUsingInbuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String scanString = scanner.nextLine();
		int i =0;
		int length = scanString.length();
		char[] charArry = scanString.toCharArray();
		for(i=0;i<length;i++) {
			System.out.println(charArry[i]);
			//i++;
		}
		System.out.println("Length of the given string is: "+i);
	}

}
