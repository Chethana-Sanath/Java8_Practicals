import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.Test;


/**
 * Provides sufficient test coverage for oracle.test.PalindromeUtil class.
 */
public class PalindromeUtilTest1 {

	@Test
	public void testNullArgument() {
		assertThrows(IllegalArgumentException.class,() -> {
			PalindromeUtil.isPalindrome(null);
		});		
	}

	@Test
	public void testEmptyString() {
		assertEquals(true, PalindromeUtil.isPalindrome(""));
	}

	@Test
	public void testSingleCharacterPalindrome() {
		assertEquals(true, PalindromeUtil.isPalindrome("a"));
	}

	@Test
	public void testTwoCharacterPalindrome() {
		assertEquals(true, PalindromeUtil.isPalindrome("aa"));
	}

	@Test
	public void testTwoCharacterNonPalindrome() {
		assertEquals(false, PalindromeUtil.isPalindrome("ab"));
	}

	@Test
	public void testPalindrome() {
		assertEquals(true, PalindromeUtil.isPalindrome("malayalam"));
	}

	@Test
	public void testNonPalindrome() {
		assertEquals(false, PalindromeUtil.isPalindrome("palindrome"));
	}
}
