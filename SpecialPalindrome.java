
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**Below is a hackerrank test - used to try find special palindrome..
 * 
 */
public class SpecialPalindrome {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        //compute no. of palindromes possible. For ex s=aaaa
        int count=s.toCharArray().length;
        char[] charArr = s.toCharArray();
        for(int i=0;i<charArr.length-1;i++) {
            if(charArr[0]==charArr[1])
                count = count+1;
            else if(charArr[0]==charArr[2])
                count = count+1;
            s=s.substring(1);
            charArr = s.toCharArray();
        }
        return count;
    }
    
    static int sockMerchant(int n, int[] ar) {//{10,20,20,10,10, 30,50,10,20};
    	List<Integer> list = new ArrayList<Integer>();
    	int count = 0;
    	for(int i=0;i<n;i++) {
    		int element = ar[i];
    		if(list.size()!=0) {
    			if(list.contains(element))
    				count = count+1;//count=3
    		}
    		list.add(ar[i]);//list = 10,20,20,10,10
    	}
    	
    	return count;

    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	/*Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = scanner.nextLine();*/
		int n=9;
        //int n = scanner.nextInt();
      //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        //String s = scanner.nextLine();

        //long result = substrCount(n, s);
		int ar[] = {10,20,20,10,10, 30,50,10,20};
		int count = sockMerchant(n,ar);
        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/
        System.out.println("No. of pairs "+count);
        //scanner.close();
    }
}

