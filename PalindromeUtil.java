/**
 * Checks if a string is a palindrome.
 *
 * Palindrome is a word, phrase or sentence that reads the same backward or
 * forward. For example, the following string is a palindrome: "Madam, I'm Adam."
 */
public class PalindromeUtil {
	/**
	 * Checks whether passed String is a palindrome or not.
	 *
	 * Requirements:
	 * - Limit the amount of additional consumed memory to O(1).
	 * - Limit complexity to O(n).
	 *
	 * @return true if passed string is palindrome, false - otherwise
	 */
	public static boolean isPalindrome(String str) {
		//If str is null then raise an exception
		str="malayalam";
		if (str == null) {		    
			throw new IllegalArgumentException("string should not be null.");
		} 

		int length=str.length();
		if (length < 2) { //if single char or empty string, then consider it to be a Palindrome		    
			return true;
		} else {
			//toCharArray is faster than chartAt, because charAt is a function call while chars[x] is simple index accessing.
			char[] chars = str.toCharArray();
			//It is sufficient to compare half the length of the string
			for (int i = 0; i < length/2; ++i) {
				if (chars[i] != chars[length-i-1]){
					return false;
				}
		    }
			//is a palindrome since all characters match
			return true;
		}
	}
}

